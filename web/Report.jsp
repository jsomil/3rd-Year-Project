


<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            div.container {
                width: 100%;
                border: 1px solid gray;
            }

            header, footer {
                padding: 1em;
                color: aquamarine;
                background-color: crimson;
                clear: left;
                text-align: center;
            }

            nav {
                float: left;
                max-width: 160px;
                margin: 0;
                padding: 1em;
            }

            nav ul {
                list-style-type: none;
                padding: 0;
            }

            nav ul a {
                text-decoration: none;
            }

            article {
                margin-left: 170px;
                border-left: 1px solid gray;
                padding: 1em;
                overflow: hidden;
            }
        </style>
    </head>
    <body>

        <div class="container">
            <header>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <h1>User Report</h1>
            </header>
            <body>
                <pre>
        <h1>TIPS for your Health</h1>

        <% Random rand = new Random();
            int n = rand.nextInt(4);
            if(n==0){
            %>
<h3>
    
You’re perfectly fine with your health.
In order to be consistent with your perfect wealth, try to maintain the same diet that you are going through now. Plus an addition of nutrients and proteins won’t bring you in loss of health. So, you can follow this diet-
Breakfast: A bowl of cereals with milk.
Lunch : A green leafy vegetable,  3-4 Indian bread, and you can add on to some rice and soupy curry.
Dinner :  Try to eat less during the night in order to help your your digestive system do its work more efficiently. Have a bowl of rice and curry and some pulses. You can sleep well by adding some fruit juice to your health.
Tip:
For the most part stay consistent with breakfast and lunch; it’s easier to stay on track with these meals for routine.
</h3>

<%}if(n==1){%>
<h3> 
You’re a bit unhealthy with your body.
But don’t worry we have a solution for you. Try to add on much of proteins and nutrients to your diet.
Breakfast: Have a fruit/egg and a glass of milk.
Lunch: Try to eat two different kinds of leafy vegetables at this time with a fresh fruit adding on.
Dinner:  Make sure you have enough green leafy vegetables on your plate. A bowl of cereals or pulses along with your normal diet would be better.
Tip:
This comes from being aware of what you’re eating, use the tips above to create structure to your eating. Unconscious eating is one of the biggest causes of weight gain.
You can’t make up for a day of consuming more food by consuming less food for the next few days, that’s not how the body works.
</h3>

<%}if(n==2){%>


<h3> 
You need to be serious with the diet you are on. You’re obese.
You’re fatty as compared to your age. You seriously need to control your diet and avoid eating on odd time.
Breakfast: Have a snackbar or a fruit or a glass of milk
Lunch: Try to stick to 2-4 Indian bread with one green vegetable with a bowl of curd.
Dinner: Try to eat properly at this night, you can also have just a platter of fruits which will fill your stomach as well as make you feel fresh.
Tip: 
 Be accountable for what enters you! It’s something that only you control, be aware of the fact that everything you do has a consequence
This comes from being aware of what you’re eating, use the tips above to create structure to your eating. Unconscious eating is one of the biggest causes of weight gain.
Drink coffee, it can really help stave off hunger
</h3>
<%}if(n==3){%>
<h3> 
You’re quite underweight. You need a proper diet.
You seriously need to eat well inorder to be healthy. We have a well planned diet for you.
Breakfast: Drink a glass of milk with two boiled eggs or a bowl of cereals.
Lunch: Eat well with around 3-4 Indian breads with two different types of green and leafy vegetable. Add on a bowl of cereals or pulses. Plus a bowl of curd.
Dinner:  Try to have a proper meal with around 2-3 Indian breads with a soupy vegetable and some rice with curry. Also grab on a snackbar or protein bar followed by a glass of fresh pomegranate juice.
Tip:
You cannot use diet to “detox” or “cleanse” the body. These words are used to sell products that are not only unhealthy, but dangerous.

Eating a side salad with meals will really help fill you up and get in many nutrients and fibre.
</h3>
<%}%>
        
                </pre>
            </body>
</html>
