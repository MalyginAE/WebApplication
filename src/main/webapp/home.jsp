<%--
  Created by IntelliJ IDEA.
  User: andre
  Date: 14.09.2021
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная</title>
</head>
<body>
<form method="get" action="/signUp">
    <label for="name">User name
        <input class="input-field" type="text" id="name" name="name">
    </label>
    <label for="password">Password
        <input class="input-field" type="password" id="password" name="password">
    </label>
    <input type="submit" value="sign Up">
</form>
</body>
</html>
