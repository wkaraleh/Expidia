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
public class TargetData {

    /**
     * offerInfo
     */
    private OfferInfo offerInfo;
    /**
     * userInfo
     */
    private UserInfo userInfo;
    /**
     * offers
     */
    private Offers offers;

    /**
     * getOfferInfo
     *
     * @return
     */
    public OfferInfo getOfferInfo() {
        return this.offerInfo;
    }

    /**
     * setOfferInfo
     *
     * @param offerInfo
     */
    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    /**
     * getUserInfo
     *
     * @return
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    /**
     * setUserInfo
     *
     * @param userInfo
     */
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * getOffers
     *
     * @return
     */
    public Offers getOffers() {
        return this.offers;
    }

    /**
     * setOffers
     *
     * @param offers
     */
    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "ClassPojo [offers = " + offers + ", offerInfo = " + offerInfo + ", userInfo = " + userInfo + "]";
    }
}
