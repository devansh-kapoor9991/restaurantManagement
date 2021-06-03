<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Waiter1</title>
<style>
		body{
			margin: 0;
		}
 		.GFG {
            background-color:orange;
            border: 2px solid black;
            color: black;
            font-size: 20px;
            cursor: pointer;
            padding: 10px;
            margin-top: 80px;
         }
 		.abc
        	{
		     background-color: orange;
		     float:left;
		     height:800px;
		     width:15%;
		     text-align:center;
		     position:fixed;
        }
        .xyz
        	{
        	background-image: url("../resources/img/wait1.jpg");
			background-position: center center;
			background-repeat: no-repeat;
			background-attachment: 500px;
			background-size: cover;
		    background-color:grey;
		    height:800px;
		    text-align:center; 
		    width: 85%;
		    position:fixed;
		    
		     margin-left:205px;
        }
        .wt-details{
        	background: linear-gradient(0deg, rgba(255, 255, 255, 0.9), rgba(255, 255, 255, 0.9));
			opacity: 0.7;
			font-size: 30px;
			padding: 20px;
			
			float: right;
	}
        }
</style>
</head>
<body>
	<div class = "abc">
		<div><a href="order1"><button class = "GFG" href=>Take Order</button></a></div>
		<div><a href="orderstatusR"><button class = "GFG">Order Status</button></a></div>
		<div><a href="checkout"><button class = "GFG">Checkout</button></a></div>
	
		<div>  <a href="home"><button class = "GFG">Logout</button></a></div>
	
		
	</div>

	<div class = "xyz">
		<div class = "wt-details">
			<div>Welcome Rahul</div>
			<div>Waiter ID: 103</div>
		</div>
	</div>
</body>
</html>