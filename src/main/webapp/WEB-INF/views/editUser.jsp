<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<script src="resources/js/jquery-1.11.3.js"></script>
<script src="resources/js/user.js"></script>
<link href="<c:url value="/resources/css/user.css" />" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<!--<form action="take-user-info" method="POST" cssClass="form-horizontal"> -->
<div id="create_user">
	<div>
		<label for="firstName">First Name</label> <input id="firstName" name="firstName" 
		type="text" class="form-control" value="${firstUserName}">
	</div>
	<div>
		<label for="lastName">Last Name</label> <input id="lastName" type="text" name="lastName"
			class="form-control" value="${lastUserName}">
	</div>
	<div>
		<label for="middleName">Middle Name</label> <input id="middleName" type="text" name="middleName"
			class="form-control" value="${middleUserName}">
	</div>
	<div>
		<label for="age">Age</label> <input id="age" type="text" name="age"
			class="form-control" value="${userAge}">
	</div>
	<div>
		<label for="email">Email</label> <input id="eMail" type="text" name="eMail"
			class="form-control" value="${userEmail}">
	</div>
	<div>
		<label for="role">Role</label> <input id="userRole" type="text" name="userRole"
			class="form-control" value="some role">
	</div>
	
	<button id="take-user-info" class="btn btn-sample">Save</button>
	
</div>
	<!--</form>-->
	<script src="resources/js/user.js"></script>
</body>
</html>