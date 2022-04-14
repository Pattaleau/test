<%@page isErrorPage="true"%>

<html>

<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>

	<%@ include file="jspf/head.jsp" %>
	
	<h2> Error sur cett page</h2>
	<%= exception.getMessage() %>
	
	<%@ include file="jspf/script.jsp" %>

</body>
</html>
