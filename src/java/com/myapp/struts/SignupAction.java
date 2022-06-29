
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SignupAction extends org.apache.struts.action.Action {

   
    private static final String SUCCESS = "success";

   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        SignUpBean sub= (SignUpBean) form;
        String name=sub.getUname();
        String pass=sub.getUpass();
        Customer customer= new Customer();
        customer.setName(name);
        customer.setPass(pass);
        DBClass.Customer_list.put(name, customer);
        HttpSession session =request.getSession(true);
        session.setAttribute("curr_cust", customer);
        return mapping.findForward(SUCCESS);
    }
}
