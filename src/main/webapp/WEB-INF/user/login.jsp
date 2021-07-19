<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 17.07.2021
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form class="user" method="post" action="/login">

        <input name="email" type="email" class="form-control form-control-user"
               id="inputEmail" aria-describedby="emailHelp"
               placeholder="Enter Email Address...">

        <input name="password" type="password" class="form-control form-control-user"
               id="inputPassword" placeholder="Password">

        <input type="submit" value="Login" class="btn btn-primary btn-user btn-block">



</form>

</body>
</html>
