/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expidia.model;

/**
 *
 * @author WK
 */
public class Address {

    /** street  */
    private String street;
    /** city  */
    private String city;
    /** zipcode   */
    private int zipcode;

    /**
     * getStreet
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     * setStreet
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * getCity
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * setCity
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * getZipcode
     * @return
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * setZipcode
     * @param zipcode
     */
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return getStreet() + ", " + getCity() + ", " + getZipcode();
    }
}
