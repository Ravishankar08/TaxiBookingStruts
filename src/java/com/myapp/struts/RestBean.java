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
public class RestBean extends org.apache.struts.action.ActionForm {
    
   private String restno;

    public String getRestno() {
        return restno;
    }

    public void setRestno(String restno) {
        this.restno = restno;
    }
    public RestBean() {
        super();
        
    }

    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        try{
        if (getRestno()== null || getRestno().length() < 1 ||Integer.parseInt(getRestno())<0||Integer.parseInt(getRestno())>4 ) {
            errors.add("resterr", new ActionMessage("error.rest.required"));
        }
        }catch(NumberFormatException e){
            errors.add("resterr", new ActionMessage("error.rest.format"));
        }
        return errors;
    }
}
