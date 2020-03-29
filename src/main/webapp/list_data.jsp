<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>

<html>
    <head><title>List data</title></head>
    <body>
        <p>Users:</p>
        <table border="2">
            <tr><th>Id</th><th>First name:</th><th>Last name:</th><th>Address1</th><th>Address2</th><th>City</th><th>State</th><th>Country</th><th>Image</th><th>Points</th><th>Range</th><th>Served</th><th>Password</th><th>Date of birth</th></tr>
            <c:forEach items="${requestScope.users}" var="user">
                <tr>
                    <td><c:out value="${user.userId}" /></td>
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
                    <td><c:out value="${user.password}" /></td>
                    <td><c:out value="${user.dateOfBirth}" />/td>
                </tr>
            </c:forEach>
        </table>

        <p>Items:</p>
        <table border="2">
            <tr><th>Id</th><th>Name</th><th>Image</th><th>Point value</th></tr>
            <c:forEach items="${requestScope.items}" var="item">
                <tr>
                    <td><c:out value="${item.id}" /></td>
                    <td><c:out value="${item.name}" /></td>
                    <td><c:out value="${item.image}" /></td>
                    <td><c:out value="${item.pointValue}" /></td>
                </tr>
            </c:forEach>
        </table>

        <p>Transactions:</p>
        <table border="2">
            <tr><th>User id</th><th>Item id</th><th>Quantity</th></tr>
            <c:forEach items="${requestScope.transactions}" var="tran">
                <tr><td><c:out value="${tran.user.userId}" /></td><td><c:out value="${tran.item.id}" /></td><td><c:out value="${tran.quantity}" /></td></tr>
            </c:forEach>
        </table>
    </body>
</html>