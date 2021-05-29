<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
		body
		{
			background-image: url("../resources/img/reception.jpg");
			background-position: center center;
			background-repeat: no-repeat;
			background-attachment: fixed;
			background-size: cover;
        	height: 1000px;
        	width: 100%;
			text-align: center;
			margin: 0;
			background-color: gray;
			position:fixed;
		}
		.nav-bar{
			height: 50px;
			width: 100%;
			box-shadow: 1px 1px 10px #eee;
		}
		.status{
			margin-top: 50px;
		}
        .list-opt1{
		    color: black;
		    font-size: 20px;		
		 }
		 .list-opt{
		    color: black;
		    font-size: 20px;	
		    margin-top: 50px;	
		 }
		  #opt1{
		       margin-right: 200px;
		       margin-left:65px;
			}
		#opt-1{
			background: linear-gradient(0deg, rgba(255, 255, 255, 0.5), rgba(255, 255, 255, 0.5));
			margin-right: 100px;
			padding: 10px 40px;
		}
		.log-out{
			text-decoration: none;
			background: linear-gradient(0deg, rgba(255, 255, 255, 0.3), rgba(255, 255, 255, 0.3));
			float: right;
			padding: 14px;
			font-size: 20px;
		}	
		a{
			color: black;
			text-decoration: none;
		}
		#opt2
		{
		margin-right:200px;
		margin-left:65px;
		}
		#opt3
		{
		margin-right:200px;
		margin-left:65px;
		}
		#ok-btn{
			background: linear-gradient(0deg, rgba(255, 255, 255, 0.3), rgba(255, 255, 255, 0.3));
			padding: 14px;
			font-size: 20px;
			
		}
		
</style>
</head>
<body>
	<div class = "nav-bar" >
		<div class = "log-out">
     		<a href = "login">Log Out</a>
    	</div>
	</div>
     <div class="status">
        <div>
        	<ul class = "list-opt1">
		           <li1 id = "opt-1">table number</li1>
		           <li1 id = "opt-1">capacity</li1>
		           <li1 id = "opt-1">status</li1>
		    </ul>
        </div>
       <form action="/recep1"  method="POST">
       <c:forEach var = "seat" items = "${seatList}">
        	<div>
        		<ul class = "list-opt">
		            <li1 id = "opt1">
		            	<input type="checkbox" value="${seat.table_no}" id="check-1" name="checkbox">
		            	<label for="check-1">${seat.table_no}</label>
		            </li1>
		            <li1 id = "opt2">${seat.capacity}</li1>
		            <li1 id = "opt3">${seat.status}</li1>
		       </ul>
        	</div>
       </c:forEach>
       		<div><input id = "ok-btn" type="submit" value="submit"></div>
         </form>
     </div> 
</body>
</html>