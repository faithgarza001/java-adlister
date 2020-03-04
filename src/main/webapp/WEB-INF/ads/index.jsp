<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Products</title>
<%--    <jsp:include page=" /WEB-INF/partials/head.jsp"/>--%>

</head>
<body>

<%--    <jsp:include page="/WEB-INF/partials/navbar.jsp" />--%>
    <h1>Welcome to the Adlister ads!</h1>

        <c:forEach var="ad" items="${ads}">
            <div class="container">
            <h2>User: ${ad.userId}</h2>
            <h2>Title: ${ad.title}</h2>
            <p>${ad.description}</p> </div>
        </c:forEach>


</body>
</html>
