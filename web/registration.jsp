
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <style>
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: crimson;
        }

        
        header, footer {
                padding: 1em;
                color: aquamarine;
                background-color: crimson;
                clear: left;
                text-align: center;
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
            <h1 style="font-size: 40px; font-family: cursive;">Registration</h1>
        </ul>
<img style="float: right; margin-top: 30px; margin-right: 30px;" src="images/fruits.jpg" height="400" alt=""/>
        <form action="registerUser" method="post">
            <div style="font-size:30px;">
                <pre>
        Login Id      <input type="text" name="login_id" value="" size="20" />
        Password      <input type="password" name="pwd" value="" size="20" />
        Name          <input type="text" name="name" value="" size="20" />
        Mobile_no     <input type="number" name="mobile_no" value="" size="20" />
        Email_ID      <input type="email" name="email_id" value="" size="20" />
                <select name="user">
                <option>User</option>
                <option>Admin</option>
                </select>
                <input type="submit" value="Register User" />
                </pre>
            </div>
            
        </form>
        <footer style="margin-top: 170px;"><h2>ARTIFICIAL DIETICIAN</h2>
    </body>
</html>
