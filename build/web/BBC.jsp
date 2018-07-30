
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<jsp:useBean id="obj" class="artificial_d.BBC"/>
<%
    Connection con;
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/somil", "root", "");
    HttpSession s = request.getSession();
    String lid = (String) s.getAttribute("login_id");
    String qry = "Select * from userdetails where login_id=?";
    PreparedStatement ps = con.prepareStatement(qry);
    ps.setString(1, lid);
    ResultSet rs = ps.executeQuery();
    boolean found = rs.next();
    float BMI = 0, BFC = 0, IWC = 0, BMX = 0;
    if (found) {
        int age = rs.getInt(2);
        double height = rs.getDouble(3);
        String gender = (String) rs.getString(4);

        int weight = Integer.parseInt(rs.getString(5));

        BMI = obj.getBMI(weight, height);
        BFC = obj.getBFC(weight, height, age, gender);
        IWC = obj.getIWC(height, gender);
        BMX = obj.getBMR(weight, height, age);
    } else {
        out.print("record not found");
    }


%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BBC</title>
        <link href="bootstrap.min.css" rel="stylesheet"/>
        <style type="text/css">
            th{font-family: inherit; font-size: 20px;}
             header, footer {
                padding: 1em;
                color: aquamarine;
                background-color: crimson;
                clear: left;
                text-align: center;
            }
            </style>
    </head>
    <body>
     <header>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <h1>BASIC BODY CALCULATOR</h1>
            </header>
       
        
        <table class="table-responsive table" border='1' style="margin:50px;">
<thead>
<tr>
<th>BASIC BODY CALCULATOR</th>
<th>OUTPUT</th>
</tr>
</thead>
<tbody>
<tr>
<td>BODY MASS INDEX</td>
<td><%=BMI%></td>
</tr>
<tr>
<td>BODY FAT CALCULATOR</td>
<td><%=BFC%></td>
</tr>
<tr>
<td>IDEAL WEIGHT CALCULATOR</td>
<td><%=BFC%></td>
</tr>
<tr>
<td>BMR</td>
<td><%=BMX%></td>
</tr>
</tbody>
</table>

      
<a href="Report.jsp">Report</a><br>
<a href="Artificial_dietician_home.jsp" style="font-size: 30px;">HOME</a>
        <footer><h2>“Your body is a temple, but only if you treat it as one.” </h2>


                </footer>   
    </body>
</html>
