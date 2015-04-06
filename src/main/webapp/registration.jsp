<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration - Mirang</title>
</head>
<body>
    <h1>Registration</h1>

    <form name="registrationForm" method="post" action="/registration">
        <input type="text" placeholder="First Name" name="firstName"><br>
        <input type="text" placeholder="Last Name" name="lastName"><br>
        <input type="email" placeholder="E-mail" name="email"><br>
        <input type="text" placeholder="City" name="city"><br>
        <input type="number" placeholder="Age" name="age"><br>
        <input type="password" placeholder="Password" name="password"><br>
        <input type="password" placeholder="Confirm Password" name="passwordConfirm"><br>

        <input type="submit" value="Registration">
    </form>

</body>
</html>
