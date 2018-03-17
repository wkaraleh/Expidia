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
public class OfferDateRange {

    /**
     * travelEndDate
     */
    private String[] travelEndDate;
    /**
     * lengthOfStay
     */
    private String lengthOfStay;
    /**
     * travelStartDate
     */
    private String[] travelStartDate;

    /**
     * getTravelEndDate
     *
     * @return
     */
    public String[] getTravelEndDate() {
        return travelEndDate;
    }

    /**
     * setTravelEndDate
     *
     * @param travelEndDate
     */
    public void setTravelEndDate(String[] travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    /**
     * getLengthOfStay
     *
     * @return
     */
    public String getLengthOfStay() {
        return lengthOfStay;
    }

    /**
     * setLengthOfStay
     *
     * @param lengthOfStay
     */
    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    /**
     * getTravelStartDate
     *
     * @return
     */
    public String[] getTravelStartDate() {
        return travelStartDate;
    }

    /**
     * setTravelStartDate
     *
     * @param travelStartDate
     */
    public void setTravelStartDate(String[] travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    @Override
    public String toString() {
        return "ClassPojo [travelEndDate = " + travelEndDate + ", lengthOfStay = " + lengthOfStay + ", travelStartDate = " + travelStartDate + "]";
    }
}
