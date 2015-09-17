<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<h3> Welcome to Office </h3> 
<p>Users:</p>
<!--
<c:forEach items="${allUsersList}" var="current">
	<p><c:out value="${current.lName} ${current.age} ${current.eMail}" /></p>
 	<a href=""><button>delete</button></a>
	<a href=""><button>edit</button></a>
	 
</c:forEach>
-->

<table class="table table-bordered">
	<tr>
		<th>Id</th>
	 	<th>Name</th>
		<th>Email</th> 
		<th>Delete</th>
		<th>Edit</th>
	</tr>
	<c:forEach items="${allUsersList}" var="user">
		<tr>
		 	<td>${user.id}</td>
			<td>${user.lName}</td>
			<td>${user.eMail}</td> 
			<td><a href="deleteUser?userId=${user.id}"><button>delete</button></a></td>
	        <td><a href="editUser?userId=${user.id}"><button>edit</button></a></td> 
		</tr>
	</c:forEach>
</table>


<a href="toAddUser"><button>Add new user</button></a><br /> 
</body>
</html>