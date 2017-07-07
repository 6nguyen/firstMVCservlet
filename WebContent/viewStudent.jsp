<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>

<head>
<title>Students</title>
</head>

<body>
<h2>Students</h2>

<c:forEach var="currentStudent" items="${studentList}">
	${currentStudent}
	<br/>
</c:forEach>

</body>

</html>