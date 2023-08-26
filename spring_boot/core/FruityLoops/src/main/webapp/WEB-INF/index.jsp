<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<h1>FruityLoops</h1>
    <table class="bg-danger">
        <thead  >
            <tr class="table-danger">
                <th>Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="fruit" items="${fruits}">
                <tr>
                    <td>${fruit.name}</td>
                    <td>${fruit.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>