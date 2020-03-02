<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--    <jsp:include page="IdeaProjects/java-adlister/src/main/webapp/partials/head.jsp">--%>
<%--        <jsp:param name="title" value="Welcome to my site!" />--%>
<%--    </jsp:include>--%>
</head>
<body>

<%--    <jsp:include page="IdeaProjects/java-adlister/src/main/webapp/partials/navbar.jsp" />--%>
    <h1>Welcome to the Adlister ads!</h1>

            <c:forEach var="ad" items="${ads}">
            <div class="container">
            <h2>User:${ad.UserId}</h2>
            <h2>Title: ${ad.title}</h2>
            <p>${ad.description}</p> </div>
            </c:forEach>


</body>
</html>
