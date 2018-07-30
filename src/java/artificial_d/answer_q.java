
package artificial_d;

import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;


public class answer_q extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con;
        String qry,s1,s2,s3;
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/somil","root","");
               qry="select * From ask";
               ps=con.prepareStatement(qry);
               
             rs=ps.executeQuery();
             
             out.println("<html>");
            out.println("<head>");
            out.println("<title>Queries</title>");  
            out.println("</head>");
            out.println("<body>");
           // out.println("<pre>");
            out.println("<form action=answer method=POST>");
            out.println("<h1>Select a query To answer</h1>");
            while(rs.next())
            {
            
        out.println("<h3>Login_ID : "+rs.getString(1)+"</h3>"+"<input type=radio name=ch value="+rs.getString(1)+" />");
            out.println("<br>");
            out.println("<h2>Question : </h2>" +rs.getString(2));
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            
            
               
            }
            
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<h2>Answer</h2> <input type=text name=ans />");
            out.println("<input type=submit value=Answer />");
           // out.println("</pre>");
            out.println("</form>");            
            
            
            out.println("</body>");
            out.println("</html>");
            
             
               
            
        } catch (SQLException ex) {
            Logger.getLogger(answer_q.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(answer_q.class.getName()).log(Level.SEVERE, null, ex);
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
