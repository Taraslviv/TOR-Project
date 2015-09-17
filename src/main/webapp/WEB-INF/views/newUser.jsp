<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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

<!-- Latest compiled and minified JavaScript -->
<script src="//netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New user</title>
</head>
<body>
<p>New User</p>

<form:form commandName="user" cssClass="form-horizontal"  action="createNewUser">
	<div class="form-group">
		<label for="firsName" class="col-sm-2 control-label">First Name:</label>
		<div class="col-sm-10">
			<form:input path="firstName" cssClass="form-control" placeholder="First Name"/>
		</div>
	</div>
	<div class="form-group">
		<label for="lastName" class="col-sm-2 control-label">Last Name:</label>
		<div class="col-sm-10">
			<form:input path="lastName" cssClass="form-control" placeholder="Last Name"/>
		</div>
	</div>
	<div class="form-group">
		<label for="middleName" class="col-sm-2 control-label">Middle Name:</label>
		<div class="col-sm-10">
			<form:input path="middleName" cssClass="form-control" placeholder="Middle Name"/>
		</div>
	</div>
	<div class="form-group">
		<label for="age" class="col-sm-2 control-label">Age:</label>
		<div class="col-sm-10">
			<form:input path="age" cssClass="form-control" placeholder="22" value="18"/>
		</div>
	</div>
	<div class="form-group">
		<label for="eMail" class="col-sm-2 control-label">Email:</label>
		<div class="col-sm-10">
			<form:input path="eMail" cssClass="form-control" placeholder="exapmle@mail.com"/>
		</div>
	</div>	
	<div class="form-group">
		<label for="userRole" class="col-sm-2 control-label">Role:</label>
		<div class="col-sm-10">
			<form:input path="userRole" cssClass="form-control" placeholder="employee"/>
		</div>
	</div>	
	<div class="form-group">
		<label for="userPassword" class="col-sm-2 control-label">Password:</label>
		<div class="col-sm-10">
			<form:password path="userPassword" cssClass="form-control" placeholder="password"/>
		</div>
	</div>	
	<div class="form-group">
		<div class="col-sm-2">
			<input type="submit" value="Save" 
			class="btn btn-lg btn-primary" />
		</div>
	</div>	
	
</form:form>

<!-- https://www.youtube.com/watch?v=F9o-0N7tMg8 -->
<a href="home"><button>turn back</button class="btn btn-lg btn-primary"></a>

<p>${userObject}</p>
</body>
</html>