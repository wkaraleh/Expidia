/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expidia.utils;



import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.expidia.model.TargetData;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WK
 */

public class JacksonObjectMapper {
    
    /**
     * get Target Object by reading json
     * @param url
     * @return 
     */
    public TargetData getTargetObject(String url) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            NameStrategy nameStrategy = new NameStrategy();
            mapper.setPropertyNamingStrategy(nameStrategy);
            //JSON from URL to Object
            TargetData obj = mapper.readValue(new URL(url), TargetData.class);
            return obj;
        } catch (MalformedURLException ex) {
            Logger.getLogger(JacksonObjectMapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JacksonObjectMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
