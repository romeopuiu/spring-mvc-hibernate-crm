<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Doctors</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<header>
<div class="container">

<h1>CRM - List of Doctors</h1>
</div>
</header>
<div class="container">
<div class="content">

<input type="button" value="Add Doctor"
onclick="window.location.href='showFormForAdd'; return false;"
 class="add-button" />
<br/><br/>
 <table class="table table-bordered">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Action</th>
</tr>

<c:forEach var="tempDoctor" items="${doctori}">

<c:url var="updateLink" value="/doctor/showFormForUpdate">
<c:param name="doctorId" value="${tempDoctor.id}" />

</c:url>

<!-- delete a doctor -->
	<c:url var="deleteLink" value="/doctor/delete">
						<c:param name="doctorId" value="${tempDoctor.id}" />
					</c:url>
<tr>
<td> ${tempDoctor.firstName} </td>
<td> ${tempDoctor.lastName} </td>
<td> ${tempDoctor.email} </td>

<td><a class="upDate" href="${updateLink}">Update</a>
|
<a class="del" href="${deleteLink}"
	 onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
</td>
</tr>

</c:forEach>



</table>

</div>


</div>


</body>
</html>