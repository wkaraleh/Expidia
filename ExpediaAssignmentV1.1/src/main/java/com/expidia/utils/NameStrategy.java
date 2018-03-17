/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expidia.utils;

/**
 *
 * @author AD
 */

import org.codehaus.jackson.map.MapperConfig;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;

public class NameStrategy extends PropertyNamingStrategy.PropertyNamingStrategyBase
 {
  @Override  
  public String translate(String input) {
        if (input == null) {
            return input;
        } else {
            if(input.equals("hotel")){
            
            
                String first = input.substring(0, 1);
                String rest  = input.substring(1);
                return first.toUpperCase() + rest;
            }
            
        }
        return input;
    }
  /**
   * convert
   * @param defaultName
   * @return 
   */
  public String convert(String defaultName )
  {
   char[] arr = defaultName.toCharArray();
   if(arr.length !=0)
   {
    if ( Character.isLowerCase(arr[0])){
     char upper = Character.toUpperCase(arr[0]);
     arr[0] = upper;
    }
   }
   return new StringBuilder().append(arr).toString();
  }

 }
