<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>

<head>
<title>Students</title>
</head>

<body>
<h2>Students</h2>
<hr>
<br/><br/>

<table border="1">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
	<c:forEach var="currentStudent" items="${studentList}">
	<tr>
		<td>${currentStudent.firstName}</td>
		<td>${currentStudent.lastName}</td>
		<td>${currentStudent.email}</td>
	</tr>
</c:forEach>
	

</table>

</body>

</html>