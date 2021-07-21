<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 17.07.2021
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form:form method="post" modelAttribute="user" class="user">
            <form:input path="firstName" type="text" placeholder="First Name"/>
            <form:errors path="firstName"/>
            <form:input path="lastName" type="text" placeholder="Last Name"/>
            <form:errors path="lastName"/>
            <form:input path="email" type="email" placeholder="Email Address"/>
            <form:errors path="email"/>
            <form:input path="dateOfBirth" type="date" name="date" min="${localDate}"/>
            <form:errors path="dateOfBirth"/>
            <form:input path="drivingLicenceNumber" type="text" placeholder="Drivin licence number"/>
            <form:errors path="drivingLicenceNumber"/>
            <form:input path="password" type="password" placeholder="Password"/>
            <form:errors path="password"/>
            <input type="password" placeholder="Repeat Password" name="repassword">
            <form:errors path="password"/>
            <input type="submit" value="Register">

</form:form>

</body>
</html>
