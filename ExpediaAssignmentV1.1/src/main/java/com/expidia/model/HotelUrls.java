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
public class HotelUrls {

    /**
     * hotelSearchResultUrl
     */
    private String hotelSearchResultUrl;
    /**
     * hotelInfositeUrl
     */
    private String hotelInfositeUrl;

    /**
     * getHotelSearchResultUrl
     *
     * @return
     */
    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    /**
     * setHotelSearchResultUrl
     *
     * @param hotelSearchResultUrl
     */
    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

    /**
     * getHotelInfositeUrl
     *
     * @return
     */
    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    /**
     * setHotelInfositeUrl
     *
     * @param hotelInfositeUrl
     */
    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    @Override
    public String toString() {
        return "ClassPojo [hotelSearchResultUrl = " + hotelSearchResultUrl + ", hotelInfositeUrl = " + hotelInfositeUrl + "]";
    }
}
