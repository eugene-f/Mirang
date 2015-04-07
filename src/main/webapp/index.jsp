<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="platform" type="com.frolov.mirang.entity.Platform"--%>
<%--@elvariable id="user" type="com.frolov.mirang.entity.User"--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mirang</title>
    <style>
        @import "http://webfonts.ru/import/nautilus.css";
        body {
            margin: 0;
            padding: 0;
            background-color: lightgray;
            font-family: sans-serif;
        }
        *::selection {
            background: orangered;
            color: yellow;
        }
        div#header {
            margin: 0;
            padding: 25px;
            background-color: darkorange;
            color: white;
            border-bottom-width: 1px;
            border-bottom-color: orange;
            border-bottom-style: solid;
            box-shadow: 0 7px 15px 5px rgba(0, 0, 0, 0.25);
        }
        div#header h1 {
            font-family: 'Nautilus Pompilius';
        }
        div.card {
            /*margin: 25px;*/
            margin-top: 25px;
            margin-bottom: 25px;
            margin-left: auto;
            margin-right: auto;
            padding: 25px;
            width: 75%;
            background-color: white;
            color: dimgray;
            text-align: justify;
            border-width: 1px;
            border-color: lightgray;
            border-style: solid;
            border-radius: 5px;
            box-shadow: 0 7px 15px 5px rgba(0, 0, 0, 0.25);
        }
        div.card h3 {
            color: orangered;
        }
        a {
            padding: 5px;
            font-size: 100%;
            text-decoration: none;
        }
        a:link {
            color: orangered;
        }
        a:visited {
            color: darkorange;
        }
        a:hover {
            background-color: orangered;
            color: white;
            border-radius: 3px;
        }
        a:active {
            background-color: red;
            color: lightgray;
        }
    </style>
</head>
<body>

<div id="header">
    <h1>Welcome to Mirang</h1>
    <h3>${user.firstName} ${user.lastName}</h3>
</div>
    <c:forEach var="wish" items="${platform.wishList}">
        <div class="card">
            <h3>${wish.title}</h3>
            <h5>Author: ${wish.author.firstName} ${wish.author.firstName}</h5>
            <p>${wish.intent}</p>
            <h5><a href="#">I do it</a> ${wish.cost} coins</h5>
        </div>
    </c:forEach>
</body>
</html>
