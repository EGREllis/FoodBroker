<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>

<html>
    <head><title>This is page uses JSP and JSTL</title></head>
    <body>
        <p>This is a table full of random numbers provided by the servlet:</p>
        <table border="2">
            <c:forEach items="${requestScope.randomData}" var="randomDigit">
                <tr><td><c:out value="${randomDigit}" /></td></tr>
            </c:forEach>
        </table>
        <p>This table is counts from 1 to 10, using just the JSTL tags</p>
        <table border="2">
            <c:forEach items="1,2,3,4,5,6,7,8,9,10" var="digit">
                <tr><td><c:out value="Number: ${digit}" /></td></tr>
            </c:forEach>
        </table>
        <p><% out.println(0); %></p>
    </body>
</html>