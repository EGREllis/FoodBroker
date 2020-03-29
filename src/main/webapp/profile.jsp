<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
    <head></head>
    <body>
        <form method="POST" action="submit_demand">
        <input type="hidden"
        <table>
            <tr><td>Number of toilet rolls:</td><td><input type="text" name="toilet_roll" /></td></tr>
            <tr><td>Number of nappy:</td><td><input type="text" name="nappy" /></td></tr>
            <tr><td>Number of cleaner:</td><td><input type="text" name="cleaner" /></td></tr>
            <tr><td>Number of sanitzers:</td><td><input type="text" name="sanitizer" /></td></tr>
            <tr><td>Number of wipes:</td><td><input type="text" name="wipes" /></td></tr>
            <tr><td>Number of oxygen:</td><td><input type="text" name="oxygen" /></td></tr>
            <tr><td rowspan="2"><input type="submit" value="Submit" /></td></tr>
        </table>
        </form>
        <h1>User profile</h1>
        <p><c:out value="${requestScope.user.firstName}" />, <c:out value="${requestScope.user.lastName}" /> </p>
        <p><c:out value="${requestScope.user.addressLine1}" /></p>
        <p><c:out value="${requestScope.user.addressLine2}" /></p>
        <p><c:out value="${requestScope.user.addressCity}" />, <c:out value="${requestScope.user.addressState}" /></p>
        <p><c:out value="${requestScope.user.addressCountry}" /></p>

        <h1>Items</h1>
        <c:forEach items="${requestScope.items}" var="item">
            <p><c:out value="${item.name}" /></p>
            <img src="${item.image}"/>
        </c:forEach>
    </body>
</html>
