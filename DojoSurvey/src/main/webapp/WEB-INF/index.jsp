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
			<form action="/process" method="post" class="card m-3 p-5">
				<label for="name">Your Name:</label>
				<input type="text" name="name" id="name" class="form-control"/>
				<label for="location">Location:</label>
				<select name="location" id="location" class="form-control">
					<option value="San Jose">San Jose</option>
					<option value="Seattle">Seattle</option>
					<option value="Austin">Austin</option>
					<option value="Burbank">Burbank</option>
					<option value="Chicago">Chicago</option>
				</select>
				<label for="language">Favorite Language:</label>
				<select name="language" id="language" class="form-control">
					<option value="Java">Java</option>
					<option value="Python">Python</option>
					<option value="JavaScript">JavaScript</option>
					<option value="C#">C#</option>
				</select>
				<label for="comment">Comment (optional):</label>
				<textarea name="comment" id="comment" cols="4" rows="4"></textarea>
				<button type="submit" class="btn btn-dark my-3 w-25">Submit</button>
			</form>
		</div>
	</body>
</html>