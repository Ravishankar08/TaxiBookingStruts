package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import com.myapp.struts.*;

public final class ShowUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <title>Customer List</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Details of the customer </h1>\n");
      out.write("\n");
      out.write("        ");

            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm aa");
            for (String c : DBClass.Customer_list.keySet()) {
                int i = 1;
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("\n");
      out.write("            <thead>\n");
      out.write("            <td>");
      out.print("User Name : " + c);
      out.write("</td>\n");
      out.write("            </thead>\n");
      out.write("            <\n");
      out.write("\n");
      out.write("            ");


                for (TaxiOrders t : DBClass.Customer_list.get(c).CustomerOrders) {

            
      out.write("\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("\n");
      out.write("                    ");
      out.print("Order " + i + " : ");
      out.write("\n");
      out.write("\n");
      out.write("                    <ul>\n");
      out.write("                        <li>");
      out.print("The Taxi Alloted is : Taxi" + t.getTaxiId());
      out.write("</li>\n");
      out.write("                        <li>");
      out.print("Cost : " + t.getPrice());
      out.write("</li>\n");
      out.write("                        <li>");
      out.print("From : " + DBClass.place[t.getFrom()].getPlaceName());
      out.write("</li>\n");
      out.write("                        <li>");
      out.print("Destination : " + DBClass.place[t.getTo()].getPlaceName());
      out.write("</li>\n");
      out.write("                        <li>");
      out.print("Request Time: " + formatter.format(t.getPickUpTime()));
      out.write("</li>\n");
      out.write("                        <li>");
      out.print("Pick Up Time : " + formatter.format(t.getPickUpTime()));
      out.write("</li>\n");
      out.write("                        <li>");
      out.print("Drop Time : " + formatter.format(t.getDropTime()));
      out.write("</li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    ");
i += 1;
      out.write("\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </table>\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <form action=\"Adminlogout\" method=\"post\">\n");
      out.write("            <button type=\"submit\" name=\"logbtn\">Logout</button>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
