<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 21.07.2021
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form:form method="post" modelAttribute="rentalDto">
    <p>Start Date          <form:input path="startDate" type="date" placeholder="StartDate"/></p><form:errors path="startDate"/>
    <p>Finish Date        <form:input path="finishDate" type="date" placeholder="FinishDate"/></p><form:errors path="finishDate"/>
<%--    <p>User firstName    <form:input path="user" itemLabel="name" itemValue="firstName" item="${firstName}" /></p><form:errors path="user"/>--%>
<%--    <p>User lastName    <form:input path="user" itemLabel="lastName" itemValue="lastName" item="${lastName}" /></p><form:errors path="user"/>--%>
<%--    <p>Car model     <form:input path="fuelType" type="text" placeholder="Fuel type"/></p> <form:errors path="fuelType"/>--%>
<%--    <p>Car make       <form:input path="przebieg" placeholder="Przebieg"/></p><form:errors path="przebieg"/>--%>
    <p>User         <form:input path="user" itemLabel="lastName" itemValue="id"/></p><form:errors path="user"/>
    <p>Car         <form:input path="car" itemLable="model" itemValue="id"/></><form:errors path="car"/>

<%--    <p>Price         <form:input path="price" type="text"/></p><form:errors path="price"/>--%>
    <p><input type="submit" value="save"></p>
  </form:form>


</body>
<%--</html>--%>
<%--<p>Make          <form:input path="make" type="text" placeholder="Make"/></p><form:errors path="make"/>--%>
<%--<p>Model         <form:input path="model" type="text" placeholder="Model"/></p><form:errors path="model"/>--%>
<%--<p>Category      <form:select path="category" itemLabel="name" itemValue="id" items="${categories}" multiple="false"/></p><form:errors path="category"/>--%>
<%--<p>Vin number    <form:input path="vin" type="text" placeholder="VIN"/></p> <form:errors path="vin"/>--%>
<%--<p>Fuel type     <form:input path="fuelType" type="text" placeholder="Fuel type"/></p> <form:errors path="fuelType"/>--%>
<%--<p>Mileage       <form:input path="przebieg" placeholder="Przebieg"/></p><form:errors path="przebieg"/>--%>