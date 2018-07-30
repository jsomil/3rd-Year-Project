

package artificial_d;

import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;


public class answer extends HttpServlet {
   
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
        PreparedStatement ps,ps1;
        String qry,s1,s2,s3,qry1;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/somil","root","");
          s1=request.getParameter("ch");
          
          s2=request.getParameter("ans");
          out.println(s1);
          out.println(s2);
          HttpSession session= request.getSession();
                 s3=(String) session.getAttribute("login_id");
            qry="insert into answer values(?,?,?)"; 
             ps=con.prepareStatement(qry);
             ps.setString(1,s3);
             ps.setString(2,s1);
             ps.setString(3,s2);
             int check=ps.executeUpdate();
             
             if(check==1)
             {
                 out.println("Successfully Answered");
                 
             }
             else 
             {
                 out.println("Error");
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(answer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(answer.class.getName()).log(Level.SEVERE, null, ex);
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
