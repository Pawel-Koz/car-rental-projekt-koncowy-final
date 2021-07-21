<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 21.07.2021
  Time: 09:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Witaj drogi kliencie!!!<p>${sessionScope.user.firstName}</p> </h2>

<p><a href='<c:url value="http://localhost:8080/customer/car/list" />'>List all Cars</a></p>

</body>
</html>
