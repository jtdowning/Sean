<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

<title>Ordered Name Input</title>
</head>
<body>

	<c:url var="formInput" value="/orderedNameOutput"/>
	<form action="${formInput}" method="GET">
		<label for = "firstname">FirstName:</label><br>
		<input type="text" name="firstname"/><br>
		<label for = middleinitial>Middle Initial</label><br>
		<input type ="text" name="middleinitial"/><br>
		<label for = "lastname">LastName:</label><br>
		<input type= "text" name="lastname"/><br>
		<br>
		<br>
		
		<input type="radio" name="order" value="fml"/>First Middle Last<br>
		<input type="radio" name="order" value="fl"/>First Last<br>
		<input type="radio" name="order" value="lfm"/>Last First Middle<br>
		<input type="radio" name="order" value="lf"/>Last First<br>
		<br>
		<br>
		<input type="submit"/>
		
	</form>

</body>

</html>