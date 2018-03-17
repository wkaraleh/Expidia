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
public class HotelPricingInfo {

    /**
     * totalPriceValue
     */
    private String totalPriceValue;
    /**
     * averagePriceValue
     */
    private String averagePriceValue;
    /**
     * originalPricePerNight
     */
    private String originalPricePerNight;
    /**
     * drr
     */
    private String drr;
    /**
     * percentSavings
     */
    private String percentSavings;
    /**
     * currency
     */
    private String currency;
    /**
     * crossOutPriceValue
     */
    private String crossOutPriceValue;

    /**
     * getTotalPriceValue
     *
     * @return
     */
    public String getTotalPriceValue() {
        return totalPriceValue;
    }

    /**
     * setTotalPriceValue
     *
     * @param totalPriceValue
     */
    public void setTotalPriceValue(String totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    /**
     * setAveragePriceValue
     *
     * @return
     */
    public String getAveragePriceValue() {
        return averagePriceValue;
    }

    /**
     * setAveragePriceValue
     *
     * @param averagePriceValue
     */
    public void setAveragePriceValue(String averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    /**
     * getOriginalPricePerNight
     *
     * @return
     */
    public String getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    /**
     * setOriginalPricePerNight
     *
     * @param originalPricePerNight
     */
    public void setOriginalPricePerNight(String originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    /**
     * getDrr
     *
     * @return
     */
    public String getDrr() {
        return drr;
    }

    /**
     * setDrr
     *
     * @param drr
     */
    public void setDrr(String drr) {
        this.drr = drr;
    }

    /**
     * getPercentSavings
     *
     * @return
     */
    public String getPercentSavings() {
        return percentSavings;
    }

    /**
     * setPercentSavings
     *
     * @param percentSavings
     */
    public void setPercentSavings(String percentSavings) {
        this.percentSavings = percentSavings;
    }

    /**
     * getCurrency
     *
     * @return
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * setCurrency
     *
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * getCrossOutPriceValue
     *
     * @return
     */
    public String getCrossOutPriceValue() {
        return crossOutPriceValue;
    }

    /**
     * setCrossOutPriceValue
     *
     * @param crossOutPriceValue
     */
    public void setCrossOutPriceValue(String crossOutPriceValue) {
        this.crossOutPriceValue = crossOutPriceValue;
    }

    @Override
    public String toString() {
        return "ClassPojo [totalPriceValue = " + totalPriceValue + ", averagePriceValue = " + averagePriceValue + ", originalPricePerNight = " + originalPricePerNight + ", drr = " + drr + ", percentSavings = " + percentSavings + ", currency = " + currency + ", crossOutPriceValue = " + crossOutPriceValue + "]";
    }
}
