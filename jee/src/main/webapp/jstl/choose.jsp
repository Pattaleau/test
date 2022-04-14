<!DOCTYPE html>
<%@page import="java.util.Date"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page errorPage="error.jsp" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Page HTML</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/style.css">
</head>
<body>

	<jsp:include page="../jspf/head.jsp" />
	<h2>JSTL : forEach</h2>

	<table class="table">
		<thead class="thead-dark">
			<tr>

				<th scope="col">Dept ID</th>
				<th scope="col">Name</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="dept">
				<c:choose>
					<c:when test="${dept.deptId == 1}">
						<tr style="background: red;">
							<td>${dept.deptId}</td>
							<td>${dept.name}</td>
							<td></td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<td>${dept.deptId}</td>
							<td>${dept.name}</td>
							<td></td>
						</tr>
					</c:otherwise>
				</c:choose>

			</c:forEach>
		</tbody>
	</table>
	
	<h2>JSTL : fmt</h2>
		<h5>
			<c:out value="<%=new Date() %>"></c:out>
			<c:set value="<%=new Date() %>" var="now" scope="session"></c:set>
		<br>
			<fmt:formatDate value="${now }" type="date" pattern="dd-mm-yyyy"/>
		</h5>



	<%@ include file="../jspf/script.jsp"%>
</body>
</html>