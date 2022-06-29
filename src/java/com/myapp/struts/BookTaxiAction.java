
package com.myapp.struts;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.*;
import org.apache.struts.action.*;


public class BookTaxiAction extends org.apache.struts.action.Action {

    private static final String SHOWTAXI = "showTaxi";
    private static final String NOTAXI="notaxi";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception {
        TaxiBookBean taxibean=(TaxiBookBean) form;
        SimpleDateFormat formatter =new SimpleDateFormat("hh:mm aa");
        HttpSession session=request.getSession(false);
        
        int from=taxibean.getFromoptions();
        int to=taxibean.getTooptions();
        Date time=formatter.parse(taxibean.getReqTime());
        Taxi taxi=new Taxi();
        System.out.println(from +" "+to+" "+time);
        Customer customer=(Customer)session.getAttribute("curr_cust");
        TaxiOrders order=taxi.AllotTaxi(from, to, time,customer.getName() );
        customer.setCustomerDetails(order);
        if(order==null){
            System.out.println("No taxi is available at the moment");
            return mapping.findForward(NOTAXI);
        }
        request.setAttribute("curr_order", order);
        return mapping.findForward(SHOWTAXI);
    }
    
}
