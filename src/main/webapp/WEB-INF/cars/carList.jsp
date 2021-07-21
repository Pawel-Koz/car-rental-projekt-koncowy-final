<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 19.07.2021
  Time: 09:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Car List</title>
</head>
<body>
    <h1>List cars</h1>
    <table>
        <tr>
            <th>Make</th>
            <th>Model</th>
            <th>Category</th>
            <th>Fuel type</th>
            <th>Mileage</th>
            <th>Availability</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${cars}" var="car">
            <tr>
                <td>${car.make}</td>
                <td>${car.model}</td>
                <td>${car.category}</td>
                <td>${car.fuelType}</td>
                <td>${car.przebieg}</td>
                <td>${car.availability}</td>
                <td><a href="<c:url   value="/admin/car/edit/${car.id}"/>">Edytuj</a>
                    <a href="<c:url   value="/admin/car/delete/${car.id}"/>">Usuń</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
