<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="refresh" content="10">
    <title>menu</title>
    <style>
        body {
          
            margin: 0;
            font-family: sans-serif;
            height:1000px;
        }
        .side-bar{
            height: 100%;
            width:20%;
            float:left;
            background-color:orange;
           text-align:center;
           position:fixed;
        }
        .main{
            text-align: center;
            height: 100%;
            width:80%;
            float:right;
            background-image: linear-gradient(0deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.2)),url("../resources/img/status.jpg");
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: 1400px 1000px;
        }
        .btn{
        	border: 2px solid black;
            background-color: rgb(99, 163, 35);
            color: black;
            padding: 8px 15px;
            display: inline-block;
            font-size: 15px;
            margin: 10px 30px;
            cursor: pointer;
            border: none;
            border-radius: 5px;
        }
        .order-set{
            background: linear-gradient(0deg, rgba(255, 255, 255, 0.4), rgba(255, 255, 255, 0.4));
            width: 65%;
            padding: 20px;
            border-radius: 12px;
            margin-top: 30px;
            margin-left: 18%;
            height: 40px;
            font-size: 15px;
        }
   
        #home{
            margin-top: 380px;
            font-size: 20px;
            font-weight: bold;
            border:2px solid black;
            width:60px;
            margin-left:100px;
        }
        #order-status
        {
        	border-radius:5px;
        	padding:5px;
           background: linear-gradient(0deg, rgba(255, 255, 255, 0.4), rgba(255, 255, 255, 0.4));
            margin-top: 80px;
            font-size: 15px;
            font-weight: bold;
             width:100px;
            margin-left:75px;
        }
        #space-1{
            margin-top: 10px;
            margin-right: 50px;
            margin-left: 10px;
            font-weight: bold;
            color: white;
        }
        #space{
            margin-top: 10px;
            margin-right: 90px;
            margin-left: 10px;
            font-weight: bold;
            color: white;
        }
        #input-field{
            border-radius: 3px;
            border: none;
            width: 150px;;
        }
        a{
            text-decoration: none;
            color: black;
        }
        
    </style>
</head>

<body>
    <div class = "side-bar">
        <div id = "side-bar_text">
            <a href = "waiter1"><p id = "order-status">Order Status</p></a>
        </div>
        <div id = "side-bar_text">
            <a href = "waiter1"><p id = "home">Home</p></a>
        </div>
    </div>
    <div class = "main">
        <div class = "order-set">
            <span id = "space-1">Dishname</span>
            <span id = "space-1">Table Number</span>	
            <span id = "space-1">Quantity</span>
            <span id = "space-1">Order Status</span>
        </div>
        <c:forEach var = "orders" items = "${orderstatuswaiter2}" >
                    <form action = "/get" method="post">
                        <div class = "order-set">
                            <span id = "space">${orders.dishname}</span>
                            <span id = "space">${orders.tableno}</span>	
                            <span id = "space">${orders.quantity}</span>
                            <c:choose>
                                <c:when test = "${orders.order_status == 'Order-Received'}">
                                    <span id = "space" style = "color: red">${orders.order_status}</span>
                                </c:when>
                                <c:when test = "${orders.order_status == 'In-Progress'}">
                                    <span id = "space" style = "color: blue">${orders.order_status}</span>
                                </c:when>
                                <c:when test = "${orders.order_status == 'Ready'}">
                                    <span id = "space" style = "color: green">${orders.order_status}</span>
                                </c:when>
                            </c:choose>                      
                            <input type = "hidden" name = "id" value = "${orders.id}" />
                            
                        </div>
                    </form>
        </c:forEach>
    </div>
</body>

</html>