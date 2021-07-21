<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h1>Categories</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${categories}" var="category">
            <tr>
                <td>${category.id}</td>
                <td>${category.name}</td>
                <td><a href="<c:url   value="/admin/category/edit/${category.id}"/>">Edytuj</a>
                    <a href="<c:url   value="/admin/category/delete/${category.id}"/>">Usuń</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
