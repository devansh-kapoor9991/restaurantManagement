<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">   
<title>home</title>
<style>
		body{
			background-image: url("../resources/img/hom.jpg");
			background-position: center center;
			background-repeat: no-repeat;
			background-attachment: fixed;
			background-size: cover;
			margin: 0;
		}
		.header{
			background-color: white;
			height:100px;
			width: 100%;
		}
        .GFG {
		        background-color: orange;
		        border: 2px solid black;
		        color: black;
		        padding: 5px 10px;
		        text-align: center;
		        display: inline-block;
		        font-size: 20px;
		        margin: 30px;
		        margin-right: 50px;
		        cursor: pointer;
             }
         .GFA{
		        background-color: orange;
		        border: 2px solid black;
		        color: black;
		        padding: 5px 10px;
		        text-align: center;
		        display: inline-block;
		        font-size: 20px;
		        margin: 10px 30px;
		        cursor: pointer;
        }
        .abc
        {
		     float: right;
		     background-color: orange;
		     height:100%;
		     width: 400px;
		     text-align: center;
        }
        .xyz
        {
		    float: left;
		    height: 100%;
		    color: black;
		    margin-left: 50px;
		    margin-top: 15px;
		    font-size: 40px;
		    font-weight:bolder;
		    font-family:'sans-serif';
		    vertical-align: middle;
        }
        .fa {  
			padding: 20px;  
			text-align: center;  
			margin: 5px 2px;  
			font-size: 30px;  
			width: 30px;  
		}  
	    .fa-facebook {    
			color: black;  
		}  
		.fa-instagram {    
  			color: black;  
		}  
		.fa-youtube {    
  			color: black;  
		}  
		.fa-google {   
			margin-left: 400px; 
  			color: black;  
  			
		}  
    </style>
</head>
<body>
	<div class = "header">
		<div class="xyz">
			Spice hut
			<a href="https://www.google.com" class="fa fa-google"></a> 
			<a href="https://www.youtube.com" class="fa fa-youtube"></a>   
			<a href="https://www.instagram.com" class="fa fa-instagram"></a>  
			<a href="https://www.facebook.com" class="fa fa-facebook"></a> 
		</div>
		<div class="abc">
  			<a href="login">
        		<button class="GFG">
            		Login
        		</button>
   		    </a>
  			<a href="menu">
        		<button class="GFA">
            		Menu
        		</button>
    		</a>
    	</div>
	</div>
</body>
</html>