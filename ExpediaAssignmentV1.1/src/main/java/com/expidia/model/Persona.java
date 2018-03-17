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
public class Persona {

    /**
     * personaType
     */
    private String personaType;

    /**
     * getPersonaType
     *
     * @return
     */
    public String getPersonaType() {
        return personaType;
    }

    /**
     * setPersonaType
     *
     * @param personaType
     */
    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    @Override
    public String toString() {
        return "ClassPojo [personaType = " + personaType + "]";
    }
}
