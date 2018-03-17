/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expidia.model;

/**
 *
 * @author AD
 */
public class Hotel {

    /**
     * offerDateRange
     */
    private OfferDateRange offerDateRange;
    /**
     * hotelUrls
     */
    private HotelUrls hotelUrls;
    /**
     * hotelInfo
     */
    private HotelInfo hotelInfo;
    /**
     * hotelPricingInfo
     */
    private HotelPricingInfo hotelPricingInfo;
    /**
     * destination
     */
    private Destination destination;

    /**
     * getOfferDateRange
     *
     * @return
     */
    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    /**
     * setOfferDateRange
     *
     * @param offerDateRange
     */
    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    /**
     * getHotelUrls
     *
     * @return
     */
    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    /**
     * setHotelUrls
     *
     * @param hotelUrls
     */
    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    /**
     * getHotelInfo
     *
     * @return
     */
    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    /**
     * setHotelInfo
     *
     * @param hotelInfo
     */
    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    /**
     * getHotelPricingInfo
     *
     * @return
     */
    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    /**
     * setHotelPricingInfo
     *
     * @param hotelPricingInfo
     */
    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    /**
     * getDestination
     *
     * @return
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * setDestination
     *
     * @param destination
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "ClassPojo [offerDateRange = " + offerDateRange + ", hotelUrls = " + hotelUrls + ", hotelInfo = " + hotelInfo + ", hotelPricingInfo = " + hotelPricingInfo + ", destination = " + destination + "]";
    }
}
