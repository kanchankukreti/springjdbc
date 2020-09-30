<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="newcheck.css">
<link href="./css/bootstrap.css" rel="stylesheet">

<style>
body {
	font-family: "Times New Roman", Georgia, Serif;
}
h2, h4, h5, h6 {
	font-family: "Playfair Display";
	letter-spacing: 3px;
}
h3 {
	font-family: "Georgia";
}
h1 {
	font-family: "Times New Roman";
}
#done {
	width: 15%;
	align-items: center;
}
#grad {
	background-image: linear-gradient(to bottom right, red, yellow);
}
</style><title>Success Page</title>
</head>
<body>


	<div class="container" align="center">

		<div id="grad">


				<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
					<a class="navbar-brand" href="#">Navbar</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarNavAltMarkup"
						aria-controls="navbarNavAltMarkup" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
						<div class="navbar-nav">

							<a class="nav-item nav-link active" href="deshboard.jsp">
Success<span class="sr-only">(current)</span>
							</a> <a class="nav-item nav-link" href="welcome.jsp">Display Message</a>

						</div>
					</div>
				</nav>

<h4>  Name : ${name} </h4>
<h4>Messsage :${message} </h4>

<br><br>

					<footer class="mx-auto bg-warning">
						<p class="text-white-50 bg-dark mx-auto bg-warning">Powered by
							X-workz &reg;</p>
					</footer>

				
				</div>
	</div>
</body>
</html>