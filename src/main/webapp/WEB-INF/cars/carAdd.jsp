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
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="car">
    <p>Make          <form:input path="make" type="text" placeholder="Make"/></p><form:errors path="make"/>
    <p>Model         <form:input path="model" type="text" placeholder="Model"/></p><form:errors path="model"/>
    <p>Category      <form:input path="category" itemLabel="name" items="${catogories}" multiple="false"/></p><form:errors path="category"/>
    <p>Vin number    <form:input path="pages" type="text" placeholder="VIN"/></p> <form:errors path="vin"/>
    <p>Fuel type     <form:select path="fuelType" items="${categories}" itemLabel="name" itemValue="id"/></p> <form:errors path="category"/>
    <p>Publisher     <form:select path="publisher" itemLabel="name" itemValue="id" items="${publishers}" multiple="false"/></p><form:errors path="publisher"/>
    <p>Authors       <form:select path="authors" itemLabel="firstName" itemValue="id" items="${authors}" multiple="false"/></p><form:errors path="authors"/>
    <p><input type="submit" value="save"></p>
</form:form>

</body>
</html>
