<!DOCTYPE html>
<html>
    <head>
    <meta charset="ISO-8859-1">
<title>Insert title here</title>
        <style>
        	body{
        		margin: 0;
        	}
        	.status{
        		background-image: url("../resources/img/status.jpg");
				background-position: center center;
				background-repeat: no-repeat;
				background-attachment: fixed;
				background-size: cover;
        		height: 1000px;
        		width: 80%;
        		float: right;
				margin: 0;
				text-align: center;
        	}
           .order{
           		height: 1000px;
		       	width: 20%;
		       	float: left;
		       	background-color: yellow;
		       	text-align: center;
		       	position:fixed;
           }    
           .order h1{
           		margin-top: 150px;
           		margin-bottom: 250px;
           }
           .home-btn{
           		color: black;
                text-decoration: none;
                font-size: 20px;
           }
           .list-opt{
           		padding-top: 30px;
           		color: black;
           		font-size: 20px;
           		position:fixed;
           }
           #opt1{
           		background: linear-gradient(0deg, rgba(255, 255, 255, 0.9), rgba(255, 255, 255, 0.9));
				opacity: 0.5;
				padding: 5px 50px;
				margin-left:100px;
           }
           #opt2{
           		background: linear-gradient(0deg, rgba(255, 255, 255, 0.9), rgba(255, 255, 255, 0.9));
				opacity: 0.5;
				padding: 5px 50px;
				margin-left: 100px;
				margin-right: 100px;
           }
           #opt3{
           		background: linear-gradient(0deg, rgba(255, 255, 255, 0.9), rgba(255, 255, 255, 0.9));
				opacity: 0.5;
				padding: 5px 50px;
           }
        </style>
    </head>

 <body>
 		<div class="order">
            <h1>Order Status</h1>
            <b><a href="waiter1" class="home-btn">Home</a></b>
        </div>
        <div class="status">
            <ul type="none"class = "list-opt">
                <li1 id = "opt1" >Items</li1>
                <li1 id = "opt2">Table Number</li1>
                <li1 id = "opt3">Status</li1>
            </ul> 
        </div>    
    </body>
</html>