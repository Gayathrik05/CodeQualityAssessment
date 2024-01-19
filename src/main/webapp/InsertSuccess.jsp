<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="InsertEmployee.jsp" %>
<%@ page isELIgnored ="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
<!-- <h1 align="center"><font color="green">Record Inserted Successfully !.</font></h1> -->
<center>
<font color="green">${bean}</font><br><br>
<div class="alert alert-success">
  <strong>Record Inserted Successfully.!</strong> You can see your details <a href="performView" class="alert-link">in this page.</a>.
</div>
</center>
</body>
</html> --%>