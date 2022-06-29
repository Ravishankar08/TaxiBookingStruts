package com.myapp.struts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class TaxiBookBean extends org.apache.struts.action.ActionForm {
    private int  fromoptions;
    private int  tooptions;
    private String reqTime;

    public int getFromoptions() {
        return fromoptions;
    }

    public void setFromoptions(int fromoptions) {
        this.fromoptions = fromoptions;
    }

    public int getTooptions() {
        return tooptions;
    }

    public void setTooptions(int tooptions) {
        this.tooptions = tooptions;
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    
    public TaxiBookBean() {
        super();
    }

  
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        SimpleDateFormat df = new SimpleDateFormat("hh:mm aa");
        
        if (getReqTime() == null || getReqTime().length() < 1) {
            errors.add("timerr", new ActionMessage("error.time.required"));
        }
        System.out.println("from"+getFromoptions()+"to"+getTooptions());
        if(getFromoptions()==getTooptions()){
            errors.add("toerr", new ActionMessage("error.time.equals"));
        }
        
        try{
            String Date =df.format(df.parse(getReqTime()));
            setReqTime(Date);
        } catch (ParseException ex) {
            errors.add("timeerr",new ActionMessage("error.date.format"));
        }
        
        return errors;
    }
}
