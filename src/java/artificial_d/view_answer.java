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
public class view_answer extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String fb, id, s, qry;

        Connection con;
        ResultSet rs;
        PreparedStatement ps = null;

        try {
            HttpSession session = request.getSession();
            s = (String) session.getAttribute("login_id");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/somil", "root", "");
            qry = "Select answer from answer where login_id=?";
            ps = con.prepareStatement(qry);
            ps.setString(1, s);

            rs = ps.executeQuery();

            out.println("<html>");
            out.println("    <head>\n"
                    + "        <style>\n"
                    + "            div.container {\n"
                    + "                width: 100%;\n"
                    + "                border: 1px solid gray;\n"
                    + "            }\n"
                    + "\n"
                    + "            header, footer {\n"
                    + "                padding: 1em;\n"
                    + "                color: aquamarine;\n"
                    + "                background-color: crimson;\n"
                    + "                clear: left;\n"
                    + "                text-align: center;\n"
                    + "            }\n"
                    + "\n"
                    + "            nav {\n"
                    + "                float: left;\n"
                    + "                max-width: 160px;\n"
                    + "                margin: 0;\n"
                    + "                padding: 1em;\n"
                    + "            }\n"
                    + "\n"
                    + "            nav ul {\n"
                    + "                list-style-type: none;\n"
                    + "                padding: 0;\n"
                    + "            }\n"
                    + "\n"
                    + "            nav ul a {\n"
                    + "                text-decoration: none;\n"
                    + "            }\n"
                    + "\n"
                    + "            article {\n"
                    + "                margin-left: 170px;\n"
                    + "                border-left: 1px solid gray;\n"
                    + "                padding: 1em;\n"
                    + "                overflow: hidden;\n"
                    + "            }\n"
                    + "        </style>\n"
                    + "    </head>\n"
                    + "");

            out.println("<body>");
            out.println("<div class=\"container\">\n"
                    + "            <header>\n"
                    + "                <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                    + "                <h1>ANSWERED QUERY</h1>\n"
                    + "            </header></div>");
            out.println("<h1>Answered_Query</h1>");
            while (rs.next()) {
                out.println("<h2>Your Answer:" + rs.getString(1) + "</h2>");
                out.println("<br>");
            }
            out.println("<img src=\"images/images (12).jpg\" width=\"600\"> ");
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
     *
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
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
