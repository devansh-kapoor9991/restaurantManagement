<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="refresh" content="10">
    <title>menu</title>
    <style>
        body {
            background-image: linear-gradient(0deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.2)),url("../resources/img/chef.jpg");
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: auto;
            margin: 0;
            font-family: sans-serif;
        }
        .header{
            height: 50px;
            box-shadow: -2px -2px 10px rgb(231, 220, 220);
        }
        .main{
            text-align: center;
        }
		.btn {
            background-color: grey;
            color:white;
            padding: 8px 15px;
            display: inline-block;
            font-size: 15px;
            margin: 10px 30px;
            cursor: not-allowed;
            border: none;
            border-radius: 5px;
        }

        .btn-active {
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
            width: 50%;
            padding: 20px;
          
            border-radius: 12px;
            margin-top: 30px;
            margin-left: 25%;
            height: 40px;
            font-size: 15px;
        }
        #log-out{
            float: right;
            height: 50px;
            width: 120px;
            text-align: center;
            background: linear-gradient(0deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.2));
        }
        #logOut_text{
            margin-top: 13px;
            font-size: 20px;
            font-weight: bold;
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
            margin-right: 60px;
            margin-left: 10px;
            font-weight: bold;
            color: white;
        }
        .input-field{
            border-radius: 3px;
            border: none;
            width: 120px;;
        }
        a{
            text-decoration: none;
            color: black;
        }
        
    </style>
</head>

<body>
    <div class = "header">
        <div id = "log-out">
            <a href = "login"><p id = "logOut_text">Log Out</p></a>
        </div>
    </div>
    <div class = "main">
        <div class = "order-set">
            <span id = "space-1">Dishname</span>
            <span id = "space-1">Table Number</span>	
            <span id = "space-1">Quantity</span>
            <span id = "space-1">Order Status</span>
        </div>
        <c:forEach var = "orders" items = "${orderList1}" >
            <c:choose>
               <c:when test="${orders.order_status == 'In-Progress' || orders.order_status == 'Order-Received'}">
                    <form action = "/chefdisplay22" method="post">
                        <div class = "order-set">
                            <span id = "space">${orders.dishname}</span>
                            <span id = "space">${orders.tableno}</span>	
                            <span id = "space">${orders.quantity}</span>
                            <!--<span id = "space">In progress</span>-->                        
						<input type="text" path="tableno" class="input-field" placeholder="${orders.order_status}" list="tables" id="input-${orders.id}"
                                autocomplete="on" name="status" onblur="handler(['input-${orders.id}','${orders.id}'])" onChange="changeHandler('${orders.id}')" />
                            <datalist id="tables">
                                <option value="In-Progress">
                                <option value="Ready">
                            </datalist>
                            <input type = "hidden" name = "id" value = "${orders.id}" />
                            <input type="submit" value="Done" id="${orders.id}" disabled=true class="btn" />
                        </div>
                    </form>
                </c:when>
            </c:choose>
        </c:forEach>
    </div>
    <script>
        const changeHandler = (id) => {
            const btnElement = document.getElementById(id);
            btnElement.className = 'btn-active';
            btnElement.disabled = false;
        }
        const handler = (id_list) => {
            const input = document.getElementById(id_list[0]);
            const btnElement = document.getElementById(id_list[1]);
            if (input.value == '') {
                btnElement.className = 'btn';
                btnElement.disabled = true;
            }
        }
    </script>
</body>

</html>