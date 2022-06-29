
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class SignUpBean extends org.apache.struts.action.ActionForm {
    
   private String uname;
   private String upass;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
    public SignUpBean() {
        super();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUname() == null || getUname().length() < 1) {
            errors.add("nameerr", new ActionMessage("error.name.required"));
        }
        if (getUpass()== null || getUpass().length() < 1) {
            errors.add("passerr", new ActionMessage("error.pass.required"));
        }
        if(DBClass.Customer_list.containsKey(getUname())){
            errors.add("userexist",new ActionMessage("error.user.exist"));
        }
        return errors;
    }
}
