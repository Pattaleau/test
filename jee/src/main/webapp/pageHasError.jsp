<%@page errorPage="error.jsp" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>

<head>
<title>Navbar Exemple</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>

	<%@ include file="jspf/head.jsp" %>
	
	<h2> error division</h2>
	<% int i = 10/0; %>
	
	<%@ include file="jspf/script.jsp" %>

</body>
</html>
