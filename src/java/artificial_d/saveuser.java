/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artificial_d;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Freeware Sys
 */
public class saveuser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String s1,s2,s3,s4,s5,s6,qry;
        PreparedStatement ps;
        Connection con;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        s1= request.getParameter("login_id");
        s2= request.getParameter("pwd");
        s3= request.getParameter("name");
        s4= request.getParameter("mobile_no");
        s5= request.getParameter("email_id");
        s6= request.getParameter("user");
         HttpSession session =request.getSession();
         session.setAttribute("login_id",s1);
        Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/somil","root","");
             qry="insert into users values(?,?,?,?,?,?)";
         ps= con.prepareStatement(qry);
         ps.setString(1,s1);
         ps.setString(2,s2);
         ps.setString(3,s3);
         ps.setString(4,s4);
         ps.setString(5,s5);
         ps.setString(6,s6);
          int check=ps.executeUpdate();
         con.close();
         if(check==1)
         {
         if(s3.equals("User"))
                 response.sendRedirect("Artificial_dietician_home.jsp");
                 else
                 response.sendRedirect("Admin_home.jsp");
         
         }
         else
         {
             out.println("Error");
         }
        } catch (ClassNotFoundException | SQLException ex) {
            
            Logger.getLogger(saveuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
