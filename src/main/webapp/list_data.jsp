<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>

<html>
    <head><title>List data</title></head>
    <body>
        <p>User:</p>
        <table border="2">
            <tr><th>First name:</th><th>Last name:</th><th>Address1</th><th>Address2</th><th>City</th><th>State</th><th>Country</th><th>Image</th><th>Points</th><th>Range</th><th>Served</th></tr>
            <c:forEach items="${requestScope.users}" var="user">
                <tr>
                    <td><c:out value="${user.firstName}" /></td>
                    <td><c:out value="${user.lastName}" /></td>
                    <td><c:out value="${user.addressLine1}" /></td>
                    <td><c:out value="${user.addressLine2}" /></td>
                    <td><c:out value="${user.addressCity}" /></td>
                    <td><c:out value="${user.addressState}" /></td>
                    <td><c:out value="${user.addressCountry}" /></td>
                    <td><c:out value="${user.image}" /></td>
                    <td><c:out value="${user.points}" /></td>
                    <td><c:out value="${user.range}" /></td>
                    <td><c:out value="${user.served}" /></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>