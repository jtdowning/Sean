<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Name Input</title>
</head>
<body>


	<c:url var="formInput" value="/nameOutput" />
	
	<form action="${formInput}" method="GET">
	 <div>
	
			<label for = "firstname">FirstName:</label><br>
			<input type="text" name="firstname"/><br>
			<label for = "lastname">LastName:</label><br>
			<input type= "text" name="lastname"/><br>
			<br>

	</div>	
		
		<label for="colorChoice">Choose a Color </label>
		
		
			<input type="checkbox" name="order" value="red"/>Red<br>	
			<input type="checkbox" name="order" value="blue"/>Blue<br>
			<input type="checkbox" name="order" value="green"/>Green<br>
			
			<input type="Submit"/>
			
	</form>
	
	
</body>
</html>