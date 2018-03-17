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
public class UserInfo {

    /**
     * userId
     */
    private String userId;
    /**
     * persona
     */
    private Persona persona;

    /**
     * getUserId
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * setUserId
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * getPersona
     *
     * @return
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * setPersona
     *
     * @param persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "ClassPojo [userId = " + userId + ", persona = " + persona + "]";
    }
}
