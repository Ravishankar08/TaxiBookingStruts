/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author ravig
 */
public class loginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";
    private static final String ADMIN = "admin";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        loginBean lb = (loginBean) form;
        String name = lb.getUsername();
        String pass = lb.getPassword();
        if (name.equals("admin") && pass.equals("admin123")) {
            return mapping.findForward(ADMIN);
        }
        else if (pass.equals(DBClass.Customer_list.get(name).getPass())) {
            return mapping.findForward(SUCCESS);
        }

        return mapping.findForward(FAILURE);
    }
}
