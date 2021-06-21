<!DOCTYPE html>

<html>

<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>


	body{
		background: linear-gradient(0deg, rgba(255, 255, 255, 0.1), rgba(255, 255, 255, 0.1)), url('../resources/img/log.jpg');
		background-position: center center;
		background-repeat: no-repeat;
		background-attachment: fixed;
		background-size: cover;
		margin: 0;
	}
	center{
		margin-top: 30px;
	}
	.input-box{
		padding: 10px;
		border: none;
		margin-top: 10px;
	}
	.labels{
		font-size: 20px;
	}
	.btn{
			padding: 10px 20px;
		}
	#alert
	{
		padding:10px;
		background-color:"blue";
		font-size:25px;
		
	}
</style>
</head>

<body>
	
	
	
	<form method="post">
	<center>
	
		
	<br>
	<br>
	<font color="blue" id="alert">${errorMessage}</font>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
		<b class = "labels">Username</b>
		<br><input type="text" name="username" class = "input-box"/><br>
		<br>
		
		<b class = "labels">Password</b>
		<br><input type="password" name="password" class = "input-box"/> <br>
		<br>
		
		<input type="submit" class = "btn" value="Submit"/><br>
		<br>
		<br>
		
	</center>
	</form>
</body>
</html>