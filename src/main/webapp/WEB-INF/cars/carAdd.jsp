<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 19.07.2021
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Car</title>
</head>
<body>
<form:form method="post" modelAttribute="carDto">
    <p>Make          <form:input path="make" type="text" placeholder="Make"/></p><form:errors path="make"/>
    <p>Model         <form:input path="model" type="text" placeholder="Model"/></p><form:errors path="model"/>
    <p>Category      <form:select path="category" itemLabel="name" itemValue="id" items="${categories}" multiple="false"/></p><form:errors path="category"/>
    <p>Vin number    <form:input path="vin" type="text" placeholder="VIN"/></p> <form:errors path="vin"/>
    <p>Fuel type     <form:input path="fuelType" type="text" placeholder="Fuel type"/></p> <form:errors path="fuelType"/>
    <p>Mileage       <form:input path="przebieg" placeholder="Przebieg"/></p><form:errors path="przebieg"/>
    <p><input type="submit" value="save"></p>
</form:form>

</body>
</html>
