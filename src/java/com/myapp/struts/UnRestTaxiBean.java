/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author ravig
 */
public class UnRestTaxiBean extends org.apache.struts.action.ActionForm {
    
   private String restno2;

    public String getRestno2() {
        return restno2;
    }

    public void setRestno2(String restno2) {
        this.restno2 = restno2;
    }
    public UnRestTaxiBean() {
        super();
        
    }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getRestno2() == null || getRestno2().length() < 1) {
            errors.add("resterr", new ActionMessage("error.rest.required"));
        }
        try{
            int restNo=Integer.parseInt(getRestno2());
        }catch(NumberFormatException e){
            errors.add("resterr", new ActionMessage("error.rest.format"));
        }
        return errors;
    }
}
