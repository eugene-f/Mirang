<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="platform" type="com.frolov.mirang.entity.Platform"--%>
<%--@elvariable id="user" type="com.frolov.mirang.entity.User"--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mirang</title>
</head>
<body>
    <h1>Welcome to Mirang</h1>
    <h3>${user.firstName} ${user.lastName}</h3>
    <c:forEach var="wish" items="${platform.wishList}">
        <br><hr><br>
        <div>
            <h3>${wish.title}</h3>
            <h5>Author: ${wish.author.firstName} ${wish.author.firstName}</h5>
            <p>${wish.intent}</p>
            <h5>${wish.cost} coins</h5>
        </div>
    </c:forEach>
    <p>${platform.wishList.get(0).city}</p>
</body>
</html>
