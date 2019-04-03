<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form for add Customer</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/form.css">



</head>
<body>

<header>
<h1>Form of add Doctor</h1>

</header>
<div class="container">
  <h2>Save Doctor</h2>
<form:form action="saveDoctor" modelAttribute="doctor" method="POST">

<form:hidden path="id" />

<table>
<tbody>
<tr>
<td><label>First Name:</label></td>
<td><form:input path="firstName" /></td>
</tr>

<tr>
<td><label>Last Name:</label></td>
<td><form:input path="lastName" /></td>
</tr>

<tr>
<td><label>Email:</label></td>
<td><form:input path="email" /></td>
</tr>
<tr>
<td><label></label></td>
<td><input type="submit"  value="Save" class="save" /></td>
</tr>
</tbody>
</table>
</form:form>

<div style="clear: both;"></div>

<p>
<a class="back" href="${pageContext.request.contextPath}/doctor/list">Back to List</a>
</p>
</div>

</body>
</html>