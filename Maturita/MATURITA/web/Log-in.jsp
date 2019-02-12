<%-- 
    Document   : Log-in
    Created on : 5-feb-2019, 19.42.41
    Author     : hassa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"  crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"  crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"  crossorigin="anonymous"></script>
	<title>LOGIN</title>
</head>

<body>
	<header>
            <div class="container" style="margin-top: 6%;">
		<div class="content-section">
			<form action="loginDipendente" method="POST">
		 		 <div class="form-group">
		  	 		 <label for="Username">Username</label>
		  	 		 <input type="text" class="form-control" name="username_txt" placeholder="Username">
		 		 </div>
		 		 <div class="form-group">
		  		 	 <label for="Psw">Password</label>
		  	 		 <input type="password" class="form-control" name="password_txt" placeholder="Password">
		  		 </div>
		 		 <button type="submit" class="btn btn-primary">Login</button>
			</form>
		</div>
	</div>
	</header>
	
	
	
</body>
</html>
