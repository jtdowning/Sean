<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Name Output</title>
</head>
	<body>
		
		<p>
		<c:out value = "${param.firstname}"/><br>
		<c:out value = "${param.lastname}"/><br>
		<c:out value = "${param.order}"/><br>
		</p>
	
	</body>
</html>