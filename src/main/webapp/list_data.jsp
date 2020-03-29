<html>
    <head><title>List data</title></head>
    <body>
        <p>User:</p>
        <table border="2">
            <tr><th>First name:</th><th>Last name:</th></tr>
            <c:forEach items="${requestScope.users}" var="user">
                <tr><td><c:out value="${user.firstName}" /></td><td><c:out value="${user.lastName}" /></td></tr>
            </c:forEach>
        </table>
    </body>
</html>