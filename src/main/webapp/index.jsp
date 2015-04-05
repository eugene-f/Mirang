<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="user" type="com.frolov.mirang.entity.User"--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mirang</title>
</head>
<body>
    <h1>Welcome to Mirang</h1>
    <h3>${user.firstName} ${user.lastName}</h3>
</body>
</html>
