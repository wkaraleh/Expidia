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
public class OfferInfo {

    /**
     * siteID
     */
    private String siteID;
    /**
     * language
     */
    private String language;
    /**
     * currency
     */
    private String currency;
    /**
     * userSelectedCurrency
     */
    private String userSelectedCurrency;

    /**
     * getSiteID
     *
     * @return
     */
    public String getSiteID() {
        return this.siteID;
    }

    /**
     * setSiteID
     *
     * @param siteID
     */
    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    /**
     * setSiteID
     *
     * @return
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * setLanguage
     *
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * getCurrency
     *
     * @return
     */
    public String getCurrency() {
        return this.currency;
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
     * getUserSelectedCurrency
     *
     * @return
     */
    public String getUserSelectedCurrency() {
        return this.userSelectedCurrency;
    }

    /**
     * userSelectedCurrency
     *
     * @param userSelectedCurrency
     */
    public void setUserSelectedCurrency(String userSelectedCurrency) {
        this.userSelectedCurrency = userSelectedCurrency;
    }

    @Override
    public String toString() {
        return "ClassPojo [siteID = " + siteID + ", userSelectedCurrency = " + userSelectedCurrency + ", language = " + language + ", currency = " + currency + "]";
    }
}
