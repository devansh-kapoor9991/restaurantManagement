<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <style>
        body {
            margin: 0px;
            height: 100%;
      
        }

        .left-div {
            background-color: orange;
            float: left;
            height: 650px;
            width: 15%;
            text-align: center;
            padding: 0 0 0 0;
            border-collapse: collapse;
        }

        .right-div {
            background-image: url("../resources/img/order.jfif");
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: auto;
            background-size: cover;
            float: right;
            width: 85%;
            height: 650px;
            text-align: left;
        }

        .btn {
            border: 2px solid black;
            color: black;
            padding: 5px 10px;
            font-size: 20px;
            margin: 10px 30px;
            cursor: pointer;
        }

        .submit-btn {
            border: none;
            padding: 5px 40px;
            font-size: 15px;
            background: linear-gradient(0deg, rgba(255, 255, 255, 0.7), rgba(255, 255, 255, 0.7));
            margin: 0;
        }

        .home-btn {
            background-color: orange;
        }

        .place-order-class {
            text-align: center;
        }

        .place-order-btn {
            margin-top: 100px;
            border: none;
            background: linear-gradient(0deg, rgba(255, 255, 255, 0.7), rgba(255, 255, 255, 0.7));
        }

        .btn:hover {
            opacity: 0.7;
            cursor: pointer;
        }

        .home-btn:hover {
            opacity: 1;
        }

        .expense {
      
            background: linear-gradient(0deg, rgba(255, 255, 255, 0.4), rgba(255, 255, 255, 0.4));
            height: 260px;
            width: 400px;
            font-size: calc(10px + 2vmin);
            color: black;
            text-align: left;
            margin-left: 30%;
            margin-top: 70px;
            padding: 20px;
			
            border-radius: 12px;
        }

        #left-div_heading {
            background: linear-gradient(0deg, rgba(255, 255, 255, 0.4), rgba(255, 255, 255, 0.4));
            margin-top: 100px;
            width: 100px;
            margin-left: 50px;
            padding:5px;
        }

        #left-div_btn {
            margin-top: 300px;
        }

        #submit-flag {
            color: blue;
            font-size: 25px;

        }
              #alert
	{
		padding:10px;
		font-size:25px;
		font-weight:bold;
		margin-left:25px;
		color:red;
		
	}
	center
	{
	
	margin-bottom:10px;
	}
    </style>
</head>

<body>
    <div class="left-div">
        <div id="left-div_heading">
            <font>Take Order</font>
        </div>
        <div id="left-div_btn">
            <a href="waiter2">
                <button class="btn home-btn">
                    Home
                </button>
            </a>
        </div>
    </div>
    <div class="right-div">


        <div class="expense">
        <span  id="alert">${error}</span>
            <form:form action="takeorder1" modelAttribute="custorder1" method="POST">
                <center>
                    <table>
                        <tr>

                            <td>Table No</td>
                            <td>
                                <form:input path="tableno" placeholder="Table No" list="tables" autocomplete="on" />
                            </td>
                            <datalist id="tables">
                                <option value="4">
                                <option value="5">
                                <option value="6">
                            </datalist>

                        </tr>
                        <tr>

                            <td>Dishname</td>
                            <br>
                            <td>
                                <form:input path="Dishname" placeholder="Dishname" list="dishes" autocomplete="on"
                                    id="dishname" />
                            </td>
                            <datalist id="dishes">
                                <option value="Paneer Tikka">
                                <option value="Chilli Paneer">
                                <option value="Spring Roll">
                                <option value="Afgani Chaap">
                                <option value="Assorted Kabab">
                                <option value="Paneer Butter Masala">
                                <option value="Shahi Paneer">
                                <option value="Kadhai Paneer">
                                <option value="Palak Paneer">
                                <option value="Malai Kofta">
                                <option value="Mushroom Masala">
                                <option value="Dal Makhani">
                                <option value="Mixed Vegetable">
                                <option value="Jeera Aloo">
                                <option value="Kashmiri Dum Aloo">
                                <option value="Garlic Naan">
                                <option value="Butter Naan">
                                <option value="Lachha Paratha">
                                <option value="Tandoori Roti">
                                <option value="Stuffed Kulcha">
                                <option value="Rumali Roti">
                                <option value="Gulab Jamun">
                                <option value="Vanilla Ice Cream">
                                <option value="Kheer">
                                <option value="Sundae">
                                <option value="Shahi Tukda">
                            </datalist>

                        </tr>
                        <tr>

                            <td>Quantity</td>
                            <br>
                            <td>
                                <form:input path="quantity" placeholder="Quantity" id="qty" />
                            </td>

                        </tr>
                        <div>
                            <span id="submit-flag"></span>
                            <div>
                    </table>
                    <div>
                    							
                        <td><input type="submit" value="Submit" class="btn submit-btn" onClick="submitHandler()" /></td>
                        <td><input type="button" value="Clear" class="btn submit-btn" onClick="clearHandler()" /></td>
                    </div>
						    <p id="submit-flag"></p>
                </center>
            </form:form>
        </div>

        <form:form action="waiter2" method="POST">
            <div class="place-order-class">
                <a href="waiter2">
                    <button class="btn place-order-btn">
                        Place Order
                    </button>
                </a>
            </div>
        </form:form>
    </div>
</body>
<script>
    function clearHandler() {
        document.querySelector("#dishname").value = "";
        document.querySelector("#qty").value = "";
        document.querySelector("#submit-flag").innerHTML = "";
    }
    function submitHandler() {
        document.querySelector("#submit-flag").innerHTML = "Submitted!!";

    }
</script>

</html>