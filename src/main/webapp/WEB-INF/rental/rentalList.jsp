<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 22.07.2021
  Time: 07:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rental List</title>
</head>
<body>
  <h1>Rental list</h1>
  <table>
    <tr>
      <th>Start date</th>
      <th>Finish date</th>
      <th>User</th>
      <th>Car</th>
      <th>Actions</th>
    </tr>
    <c:forEach items="${rentals}" var="rental">
      <tr>
        <td>${rental.startDate}</td>
        <td>${rental.finishDate}</td>
        <td>${rental.user}</td>
        <td>${rental.car}</td>
        <td><a href="<c:url   value="/admin/rental/edit/${rental.id}"/>">Edytuj</a>
          <a href="<c:url   value="/admin/rental/delete/${rental.id}"/>">Usuń</a></td>
      </tr>
    </c:forEach>
  </table>

</body>
</html>
