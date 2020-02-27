<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>Login Form</h3>
<div style="text-align: center;">
    <form action="login.jsp" method="post">
        Username:<input type="text" name="username"/><br/><br/>
        Password:<input type="password" name="password"/><br/><br/>
        <input type="submit" value="Submit"/>
    </form>
</div>
<%
    PrintWriter printer = response.getWriter();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username!=null && password!=null ){
        if (username.equals("admin")&& password.equals("password123")){
            response.sendRedirect("/profile.jsp");
        }else {
            response.sendRedirect("/login.jsp");
        }
    }


%>
<br/>
<%--<%--%>
<%--    String username=request.getParameter("username");--%>
<%--    String password=request.getParameter("password");--%>
<%--    if((username.equals("anurag") && password.equals("jain"))) {--%>
<%--        session.setAttribute("username",username); response.sendRedirect("Home.jsp");--%>
<%--    } else response.sendRedirect("Error.jsp");--%>
<%--%>--%>


</body>
</html>
