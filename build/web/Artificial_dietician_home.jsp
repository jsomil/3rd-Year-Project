<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOME</title>
    </head>
    <style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: crimson;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 16px;
    text-decoration: none;
}

li a:hover {
    background-color: black;
}


.mySlides {display:none;}
</style>
    <body>
        <ul>
        <h1>HOME</h1>
         <li> <a href="provide_user_info.jsp">Provide User Information</a></li>
         <li> <a href="view.jsp">View</a></li>
         <li> <a href="ask_query.jsp">Ask Query</a></li>
         <li> <a href="view_answer">View Answer</a></li>
         <li> <a href="Feedback.jsp">Feedback</a></li>
         <li> <a href="logout">Logout</a></li>
        </ul>
        <img src="images/sign_question_punctuation_wall_form_metal_19918_2560x1440.jpg" height="530" width="1333" alt=""/>
 
    </body>
</html>
