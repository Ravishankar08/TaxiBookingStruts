package com.myapp.struts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.myapp.struts.DBClass;
import com.myapp.struts.RestBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author ravig
 */
public class RestTaxiAction extends org.apache.struts.action.Action {

    
    private static final String SUCCESS = "success";

    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
        RestBean rest=(RestBean) form;
        DBClass.Taxi_List[Integer.parseInt(rest.getRestno())].setRest(true);
        return mapping.findForward(SUCCESS);
    }
}
