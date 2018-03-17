package com.expedia.jsf;

import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import com.expidia.model.*;
import com.expidia.utils.JacksonObjectMapper;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RequestScoped
@ManagedBean(name = "offerSearchController")
public class OfferSearchController implements Serializable {

    /**
     * TARGET_URL
     */
    private static final String TARGET_URL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

    /**
     * targetVO
     */
    private static TargetData targetVO = new TargetData();
    /**
     * locationList
     */
    private List<String> locationList = new ArrayList<>();

    /**
     * countryName
     */
    private String countryName;

    /**
     * items
     */
    private List<Hotel> items = new ArrayList<>();

    /**
     * selected
     */
    private Hotel selected;

    /**
     * regionID
     */
    private String regionID;

    /**
     * itemsLocMap
     */
    private Map<String, Hotel> itemsLocMap = new HashMap<>();

    /**
     * itemsRegMap
     */
    private Map<String, Hotel> itemsRegMap = new HashMap<>();

    static {
        JacksonObjectMapper jacksonObjectMapper = new JacksonObjectMapper();
        targetVO = jacksonObjectMapper.getTargetObject(TARGET_URL);
    }

    /**
     * constructure OfferSearchController
     */
    public OfferSearchController() {

    }

    @PostConstruct
    public void initOfferSearchController() {
        if (targetVO != null && targetVO.getOffers() != null
                && targetVO.getOffers().getHotel() != null
                && targetVO.getOffers().getHotel().length > 0) {
            for (Hotel hotel : targetVO.getOffers().getHotel()) {
                items.add(hotel);
                if (hotel.getDestination() != null && !isBlankOrNull(hotel.getDestination().getRegionID())) {
                    itemsRegMap.put(hotel.getDestination().getRegionID(), hotel);
                }
                if (hotel != null && hotel.getHotelInfo() != null
                        && !isBlankOrNull(hotel.getHotelInfo().getHotelLongDestination())) {
                    itemsLocMap.put(hotel.getHotelInfo().getHotelLongDestination(), hotel);
                    locationList.add(hotel.getHotelInfo().getHotelLongDestination());
                }
            }

        }
    }

    /**
     * doSearch
     */
    public void doSearch() {
        if (targetVO != null && targetVO.getOffers() != null
                && targetVO.getOffers().getHotel() != null
                && targetVO.getOffers().getHotel().length > 0) {
            for (Hotel hotel : targetVO.getOffers().getHotel()) {
                items.add(hotel);
            }

        }
        if (isBlankOrNull(countryName) && isBlankOrNull(regionID)) {
            return;
        }
        List<Hotel> tmpLocItems = new ArrayList<>();
        if (!isBlankOrNull(countryName)) {
            if (itemsLocMap != null) {
                for (Map.Entry<String, Hotel> entry : itemsLocMap.entrySet()) {
                    if (entry.getKey().contains(countryName)) {
                        tmpLocItems.add(entry.getValue());
                    }
                }
            }
            if (isBlankOrNull(regionID)) {
                items = tmpLocItems;
                return;
            }
        }

        List<Hotel> tmpRegItems = new ArrayList<>();
        if (!isBlankOrNull(regionID)) {
            if (itemsRegMap != null) {
                for (Map.Entry<String, Hotel> entry : itemsRegMap.entrySet()) {
                    if (entry.getKey().contains(regionID)) {
                        tmpRegItems.add(entry.getValue());
                    }
                }
            }
            if (isBlankOrNull(countryName)) {
                items = tmpRegItems;
                return;
            }
        }

        if (!isBlankOrNull(countryName) && !isBlankOrNull(regionID)) {
            items = new ArrayList();
            if (tmpRegItems != null && tmpRegItems.size() > 0 && tmpLocItems != null && tmpLocItems.size() > 0) {
                for (Hotel h : tmpRegItems) {
                    for (Hotel l : tmpLocItems) {
                        if (h.getDestination() != null && !isBlankOrNull(h.getDestination().getRegionID())
                                && l.getDestination() != null && !isBlankOrNull(l.getDestination().getRegionID())) {
                            if (l.getDestination().getRegionID().equals(h.getDestination().getRegionID())) {
                                items.add(l);
                                break;
                            }
                        }
                    }
                }

            }

        }

    }

    /**
     * countryList
     *
     * @return
     */
    public List<String> countryList() {
        List<String> list = new ArrayList<>();

        if (!isBlankOrNull(countryName)) {
            if (locationList != null) {
                for (String locationStr : locationList) {
                    if (locationStr.contains(countryName)) {
                        list.add(locationStr);
                    }
                }
            }
        } else {
            if (locationList != null) {
                list = locationList;
            }
        }

        return list;
    }

    /**
     * regionIDList
     *
     * @return
     */
    public List<String> regionIDList() {
        List<String> list = new ArrayList<>();
        if (itemsRegMap != null) {
            for (Map.Entry<String, Hotel> entry : itemsRegMap.entrySet()) {

                list.add(entry.getKey());

            }
        }

        return list;
    }

    /**
     * isBlankOrNull
     *
     * @param str
     * @return
     */
    private boolean isBlankOrNull(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    /**
     * redirect
     *
     * @throws IOException
     */
    public void redirect() throws IOException {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        if (selected == null) {
            return;
        }
        if (selected.getHotelUrls() != null && !isBlankOrNull(selected.getHotelUrls().getHotelSearchResultUrl())) {

            String urlStr = "https://www.expedia.com/Hotel-Search?regionId="
                    + selected.getDestination().getRegionID()+"&destination="
                    + selected.getDestination().getShortName()+"&startDate="
                    + selected.getOfferDateRange().getTravelStartDate()+"&endDate="
                    + selected.getOfferDateRange().getTravelEndDate()+"&selected="
                    + selected.getHotelInfo().getHotelId()+"&paandi=true";

            externalContext.redirect(urlStr);

        }
    }

    /**
     * getEncodedUrl
     *
     * @param urlStr
     * @return
     */
    private String getEncodedUrl(String urlStr) {
        if (isBlankOrNull(urlStr)) {
            return null;
        }
        String encoded = urlStr.replaceAll("%25", "%");
//        encoded = encoded.replace("%20", " ");
//        encoded = encoded.replace("%21", "!");
//        encoded = encoded.replace("%23", "#");
//        encoded = encoded.replace("%24", "$");
//        encoded = encoded.replace("%26", "&");
//        encoded = encoded.replace("%27", "'");
//        encoded = encoded.replace("%28", "(");
//        encoded = encoded.replace("%29", ")");
//        encoded = encoded.replace("%2A", "*");
//        encoded = encoded.replace("%2B", "+");
//        encoded = encoded.replace("%2C", ",");
        encoded = encoded.replaceAll("%2F", "/");
        encoded = encoded.replaceAll("%3A", ":");
//        encoded = encoded.replace("%3B", ";");
        encoded = encoded.replaceAll("%3D", "=");
//        encoded = encoded.replace("?", "%3F");
//        encoded = encoded.replace("%40", "@");
//        encoded = encoded.replace("%5B", "[");
//        encoded = encoded.replace("%5D", "]");
        return encoded;
    }

    /**
     * get TargetVO
     *
     * @return
     */
    public TargetData getTargetVO() {
        return targetVO;
    }

    /**
     * set TargetVO
     *
     * @param targetVO
     */
    public void setTargetVO(TargetData targetVO) {
        this.targetVO = targetVO;
    }

    /**
     * get CountryName
     *
     * @return
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * setCountryName
     *
     * @param CountryName
     */
    public void setCountryName(String CountryName) {
        this.countryName = CountryName;
    }

    /**
     * getLocationList
     *
     * @return
     */
    public List<String> getLocationList() {
        return locationList;
    }

    /**
     * setLocationList
     *
     * @param locationList
     */
    public void setLocationList(List<String> locationList) {
        this.locationList = locationList;
    }

    /**
     * getItems
     *
     * @return
     */
    public List<Hotel> getItems() {
        return items;
    }

    /**
     * setItems
     *
     * @param items
     */
    public void setItems(List<Hotel> items) {
        this.items = items;
    }

    /**
     * getSelected
     *
     * @return
     */
    public Hotel getSelected() {
        return selected;
    }

    /**
     * setSelected
     *
     * @param selected
     */
    public void setSelected(Hotel selected) {
        this.selected = selected;
    }

    /**
     * getRegionID
     *
     * @return
     */
    public String getRegionID() {
        return regionID;
    }

    /**
     *
     * @param regionID
     */
    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    /**
     * setEmbeddableKeys
     */
    protected void setEmbeddableKeys() {
    }

    /**
     * initializeEmbeddableKey
     */
    protected void initializeEmbeddableKey() {
    }

}
