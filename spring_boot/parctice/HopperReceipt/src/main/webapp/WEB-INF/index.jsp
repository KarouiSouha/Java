<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1>Customer Name:  <c:out value="${username}"/></h1>
  <h2>Items name:  <c:out value="${itemName}"/></h2> 
  <h2>Price :  <c:out value="${price}"/></h2>
  <h2>Description:  <c:out value="${description}"/></h2>
  <h2>Vendor :  <c:out value="${vendor}"/></h2>
 
</body>
</html>