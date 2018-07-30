package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        ul {\n");
      out.write("            list-style-type: none;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            overflow: hidden;\n");
      out.write("            background-color: crimson;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("        header, footer {\n");
      out.write("                padding: 1em;\n");
      out.write("                color: aquamarine;\n");
      out.write("                background-color: crimson;\n");
      out.write("                clear: left;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        li {\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        li a {\n");
      out.write("            display: block;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        li a:hover {\n");
      out.write("            background-color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .mySlides {display:none;}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <h1 style=\"font-size: 40px; font-family: cursive;\">Registration</h1>\n");
      out.write("        </ul>\n");
      out.write("<img style=\"float: right; margin-top: 30px; margin-right: 30px;\" src=\"images/fruits.jpg\" height=\"400\" alt=\"\"/>\n");
      out.write("        <form action=\"registerUser\" method=\"post\">\n");
      out.write("            <div style=\"font-size:30px;\">\n");
      out.write("                <pre>\n");
      out.write("        Login Id      <input type=\"text\" name=\"login_id\" value=\"\" size=\"20\" />\n");
      out.write("        Password      <input type=\"password\" name=\"pwd\" value=\"\" size=\"20\" />\n");
      out.write("        Name          <input type=\"text\" name=\"name\" value=\"\" size=\"20\" />\n");
      out.write("        Mobile_no     <input type=\"text\" name=\"mobile_no\" value=\"\" size=\"20\" />\n");
      out.write("        Email_ID      <input type=\"text\" name=\"email_id\" value=\"\" size=\"20\" />\n");
      out.write("                <input type=\"submit\" value=\"Register User\" />\n");
      out.write("                </pre>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        <footer style=\"margin-top: 170px;\"><h2>ARTIFICIAL DIETICIAN</h2>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
