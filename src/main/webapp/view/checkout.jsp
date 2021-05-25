<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>checkout</title>
<style>
	body{
		background-image: url('../resources/img/check.PNG');
		background-position: center center;
		background-repeat: no-repeat;
		background-attachment: fixed;
		background-size: cover;
		margin: 0;
	}
	center{
		margin-top: 20px;
	}
	.input-box{
		padding: 10px;
		border: none;
		margin-top: 10px;
	}
	.labels{
		background: linear-gradient(0deg, rgba(255, 255, 255, 0.9), rgba(255, 255, 255, 0.9));
		opacity: 0.5;
		font-size: 20px;
		padding: 5px;
	}
	.btn{
		padding: 20px 30px;
		border: none;
		cursor: pointer;
	}
</style>
</head>
<body>
<form method="post">
	<center>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
		<b class = "labels">Enter email id</b>
		<br><input type="text" name="emailid" class = "input-box"/><br>
		<br>
		
		<b class = "labels">Enter Table Number</b>
		<br><input type="password" name="table" class = "input-box"/> <br>
		<br>
		
		<input type="submit" value="Submit" class = "btn"/><br>
		<br>
		<br>
		
	</center>
	</form>
</body>
</html>