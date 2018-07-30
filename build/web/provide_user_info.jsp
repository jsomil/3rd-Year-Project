
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>provide_user_info</title>
        <style>

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
            <h1>PROVIDE USER INFORMATION</h1>
        </header>

        <h1 style="font-size: 40px; font-family: cursive;">User information</h1>
        <pre>
        <form action="save_user_info" method="post">
                AGE(in years)        <input type="text" required="required" name="age" value="" size="20" />
                HEIGHT(in cm)        <input type="text" required="required" name="height" value="" size="20" />
                Weight(in kg)        <input type="text" required="required" name="weight" value="" size="20" />
                GENDER               <select required="required" name="Gender">
                                        <option>Male</option>
                                        <option>Female</option>
                                     </select>
                                    <input type="submit" value="submit_information" name="submit_information" />
            
        </form>
        <a href="Artificial_dietician_home.jsp" style="font-size: 30px;">HOME</a>
        </pre>
        <footer><h2> “Take care of your body. It’s the only place you have to live.”</h2>


        </footer> 

    </body>
</html>
