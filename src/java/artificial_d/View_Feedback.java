package artificial_d;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author karishma
 */
public class View_Feedback extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String fb,id,qry;
        
        Connection con;
        ResultSet rs;
        PreparedStatement ps;
        
        
        try {
        
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/somil","root","");
        qry="Select * from feedback";
        ps= con.prepareStatement(qry);
     
        rs=ps.executeQuery();
        
        
        
            
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Feedback</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Feedback</h1>");
            while(rs.next()) {
            out.println("<h2>Login_id:"+rs.getString(1)+"</h2>");
            out.println("<h2>Feedback:"+rs.getString(2)+"</h2>");
            out.println("<br>");
            }
            
            out.println("</body>");
            out.println("</html>");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(fb.class.getName()).log(Level.SEVERE, null, ex);
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
