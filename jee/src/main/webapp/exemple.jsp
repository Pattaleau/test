<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.util.Date"%>

<html>

<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>

	<%@ include file="jspf/head.jsp" %>
	
	<h2><%= new Date() %></h2>
	<%! private int compteur =0; %>
	<%=++ compteur %>
	<br>
	<%
	int a = 3;
	int b = 5;
	out.println(a+b);
	for( int i =0; i<10;i ++){
		
	
	%>
	<h3> Bonjour</h3>
	<%} %>
	
	<%@ include file="jspf/script.jsp" %>

</body>
</html>
