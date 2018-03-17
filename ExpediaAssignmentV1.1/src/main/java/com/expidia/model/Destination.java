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
public class Destination {
    
    /**  province */
    private String province;
    /** longName */
    private String longName;
    /** nonLocalizedCity */
    private String nonLocalizedCity;
    /** tla */
    private String tla;
    /** shortName */
    private String shortName;
    /** associatedMultiCityRegionId */
    private String associatedMultiCityRegionId;
    /** regionID */
    private String regionID;
    /** city */
    private String city;
    /** country */
    private String country;
    
    /**
     * getProvince
     * @return 
     */
    public String getProvince ()
    {
        return province;
    }
    
    /**
     * setProvince
     * @param province 
     */
    public void setProvince (String province)
    {
        this.province = province;
    }
    
    /**
     * getLongName
     * @return 
     */
    public String getLongName ()
    {
        return longName;
    }
    
    /**
     * setLongName
     * @param longName 
     */
    public void setLongName (String longName)
    {
        this.longName = longName;
    }
    /**
     * getNonLocalizedCity
     * @return 
     */
    public String getNonLocalizedCity ()
    {
        return nonLocalizedCity;
    }
    /**
     * setNonLocalizedCity
     * @param nonLocalizedCity 
     */
    public void setNonLocalizedCity (String nonLocalizedCity)
    {
        this.nonLocalizedCity = nonLocalizedCity;
    }
    /**
     * getTla
     * @return 
     */
    public String getTla ()
    {
        return tla;
    }
    /**
     * setTla
     * @param tla 
     */
    public void setTla (String tla)
    {
        this.tla = tla;
    }
    /**
     * getShortName
     * @return 
     */
    public String getShortName ()
    {
        return shortName;
    }
    /**
     * setShortName
     * @param shortName 
     */
    public void setShortName (String shortName)
    {
        this.shortName = shortName;
    }
    /**
     * getAssociatedMultiCityRegionId
     * @return 
     */
    public String getAssociatedMultiCityRegionId ()
    {
        return associatedMultiCityRegionId;
    }
    /**
     * setAssociatedMultiCityRegionId
     * @param associatedMultiCityRegionId 
     */
    public void setAssociatedMultiCityRegionId (String associatedMultiCityRegionId)
    {
        this.associatedMultiCityRegionId = associatedMultiCityRegionId;
    }
    /**
     * getRegionID
     * @return 
     */
    public String getRegionID ()
    {
        return regionID;
    }
    /**
     * setRegionID
     * @param regionID 
     */
    public void setRegionID (String regionID)
    {
        this.regionID = regionID;
    }
    /**
     * getCity
     * @return 
     */
    public String getCity ()
    {
        return city;
    }
    /**
     * setCity
     * @param city 
     */
    public void setCity (String city)
    {
        this.city = city;
    }
    /**
     * getCountry
     * @return 
     */
    public String getCountry ()
    {
        return country;
    }
    /**
     * setCountry
     * @param country 
     */
    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [province = "+province+", longName = "+longName+", nonLocalizedCity = "+nonLocalizedCity+", tla = "+tla+", shortName = "+shortName+", associatedMultiCityRegionId = "+associatedMultiCityRegionId+", regionID = "+regionID+", city = "+city+", country = "+country+"]";
    }   
}
