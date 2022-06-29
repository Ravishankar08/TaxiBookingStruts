package com.myapp.struts;

import java.util.ArrayList;
import java.util.Date;


public class Customer {
    private String name,pass;
    public ArrayList<TaxiOrders> CustomerOrders= new ArrayList<>();

   public void setCustomerDetails(TaxiOrders order){
       CustomerOrders.add(order);
//       System.out.println("Orders added");
   }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
