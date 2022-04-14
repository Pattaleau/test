<%@page errorPage="error.jsp" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>

<head>
<title>Navbar Exemple</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>

	<jsp:include page="../jspf/head.jsp"/>
	<h2> JSP Action : jsp:useBean</h2>
	<jsp:useBean id="helloBean" class="fr.formation.inti.model.HelloModel"></jsp:useBean>
	<jsp:getProperty property="name" name="helloBean"/>
	
	<jsp:getProperty property="hello" name="helloBean"/>

	<%@ include file="../jspf/script.jsp" %>

</body>
</html>
