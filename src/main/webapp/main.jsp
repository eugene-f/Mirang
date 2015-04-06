<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mirang</title>
    <style>
        @import "http://webfonts.ru/import/nautilus.css";
        * {
            font-family: 'Nautilus Pompilius';
        }
        body {
            margin: 0;
            padding: 0;
            background-color: darkorange;
        }
        *::selection {
            background: orangered;
            color: yellow;
        }
        div {
            margin-top: 25%;
            width: 100%;
            color: white;
            text-align: center;
        }
        p {
            font-size: 750%;
            text-shadow: 1px 1px 3px black, 0 0 150px white;
        }
        a {
            padding: 5px;
            font-size: 100%;
            text-decoration: none;
        }
        a:link {
            color: darkred;
        }
        a:visited {
            color: darkred;
        }
        a:hover {
            background-color: white;
            color: darkred;
            border-radius: 3px;
        }
        a:active {
            background-color: white;
            color: red;
        }
    </style>
</head>
<body>
    <div>
        <p>Mirang</p>
        <a href="/login">Login</a><b> // </b><a href="/registration">Registration</a><br>
    </div>
</body>
</html>
