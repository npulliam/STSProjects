<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/style.css"/>
		<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
		<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="card w-75 m-3 p-5">
				<h2>Submitted info: </h2>
				<table class="table table-striped table-dark text-light">
					<tbody>
						<tr>
							<td>Name:</td>
							<td><c:out value="${name}"/></td>
						</tr>
						<tr>
							<td>Dojo Location:</td>
							<td><c:out value="${location}"/></td>
						</tr>
						<tr>
							<td>Favorite Language:</td>
							<td><c:out value="${language}"/></td>
						</tr>
						<c:if test= "${comment != null}">
							<tr>
								<td>Comment</td>
								<td><c:out value="${comment}"/></td>
							</tr>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>