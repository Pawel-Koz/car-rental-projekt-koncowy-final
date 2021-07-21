<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 20.07.2021
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Panel</title>
</head>
<body>
    <h2>Witaj adminie </h2>
    <p>${sessionScope.user.firstName}</p>
    <p><a href='<c:url value="http://localhost:8080/admin/category/add" />'>Add Category</a></p>
    <p><a href='<c:url value="http://localhost:8080/admin/category/list" />'>List Categories</a></p>
    <p><a href='<c:url value="http://localhost:8080/admin/car/add" />'>Add Car</a></p>
    <p><a href='<c:url value="http://localhost:8080/admin/car/list" />'>List all Cars</a></p>

</body>
</html>
