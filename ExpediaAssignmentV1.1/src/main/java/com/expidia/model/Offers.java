
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expidia.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonSetter;

/**
 *
 * @author AD
 */
public class Offers {

    /**
     * hotel
     */
    private Hotel[] hotel;

    /**
     * getHotel
     *
     * @return
     */
    public Hotel[] getHotel() {
        return hotel;
    }

    /**
     * setHotel
     *
     * @param Hotel
     */
    public void setHotel(Hotel[] Hotel) {
        this.hotel = Hotel;
    }

    @Override
    public String toString() {
        return "ClassPojo [Hotel = " + hotel + "]";
    }
}
