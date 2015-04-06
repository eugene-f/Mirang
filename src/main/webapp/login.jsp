<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login - Mirang</title>
</head>
<body>
    <h1>Login</h1>

    <form name="loginForm" method="post" action="/login">
        <input type="email" placeholder="E-mail" name="email"><br>
        <input type="password" placeholder="Password" name="password"><br>

        <input type="submit" value="Login">
    </form>

</body>
</html>
