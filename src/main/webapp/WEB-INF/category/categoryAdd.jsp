<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 19.07.2021
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Add car category</h2>
    <form:form method="post" modelAttribute="category">
        <form:input path="name" type="text" placeholder="Category name"/><form:errors path="name"/>
        <input type="submit" value="Add category">
    </form:form>


</body>
</html>
