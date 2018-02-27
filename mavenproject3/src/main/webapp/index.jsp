<html>
    <body>
        <h2>Hello Palo!</h2>
        <p>Tu sa nachadza dlhy text</p>
        
        <%@page import="java.util.Random" %>
        <%
            Random rand = new Random();
            int age=12;
            out.println(age);
            
            for (int i=0; i<10; i++){
                int  n = rand.nextInt(50) + 1;
                System.out.println(n + "<br/>");
            }
        %>
    </body>
</html>
