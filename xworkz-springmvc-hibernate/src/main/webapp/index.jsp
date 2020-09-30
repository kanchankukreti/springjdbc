<!DOCTYPE html>
<%@page import="com.sun.prism.paint.Color"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Information of natural Calamities</h2>
		<form action="register.doc" method="post">

		<pre>
			
			Enter Place Name: <input type="text" name="place" />
			
			Enter Date: <input type="text" name="date" />
			
			Enter Captured By: <input type="text" name="calamityType" />
			
			Enter Calamity Type: <select name="types" style="width: 200px" >
							<option></option>
							<option value="Flood">Flood</option>
							<option value="Rain">Rain</option>
							<option value="Cyclone">Cyclone</option>
							<option value="Earth Quake">Earth Quake</option>
							</select> 
			
			Enter Area of calamity: <input type="text" name="area" />
			
			Enter Average Loss: <input type="text" name="avgLoss" />
			
			Enter Number of Deaths: <input type="text" name="noOfDeaths" />
			
			Enter Number of Injured: <input type="text" name="noOfInjured" />
			
			<input type="submit" value="Register here" />
			
		</pre>

	</form>
</body>
</html>