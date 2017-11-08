<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
<title>Ordered Name Output</title>

</head>


<body>
	<p>
		First Name: <c:out value = "${param.firstname}"/><br>
		Middle Initial: <c:out value = "${param.middleinitial}"/><br>
		Last Name: <c:out value = "${param.lastname}"/><br>
	</p>
	
	<p>
	Ordered Name: <c:out value="${orderedName}"/>
	</p>
</body>
</html>