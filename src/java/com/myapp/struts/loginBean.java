package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class loginBean extends org.apache.struts.action.ActionForm {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public loginBean() {
        super();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUsername() == null || getUsername().trim().length() < 1) {
            errors.add("nameerr", new ActionMessage("error.name.required"));
        }
        if (getPassword() == null || getPassword().trim().length() < 1) {
            errors.add("passerr", new ActionMessage("error.pass.required"));
        }
        System.out.println(getUsername());
        if (!DBClass.Customer_list.containsKey(getUsername()) && !getUsername().equals("admin")) {
            System.out.println("login check"+DBClass.Customer_list);
            errors.add("existUser", new ActionMessage("error.uset.notexist"));

        }
        return errors;
    }
}
