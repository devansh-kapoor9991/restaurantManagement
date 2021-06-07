<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>menu</title>
    <style>
        body {
            background-image: linear-gradient(0deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.2)),url("../resources/img/hom.jpg");
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: 1900px 1000px;
            margin: 0;
            font-style: serif;
        }
        .menu{
            margin-top: 50px;
        }
        #menu {
   
            border-radius: 5px;
            padding: 5px 40px;
            background: linear-gradient(0deg, rgba(255, 255, 255, 0.5), rgba(255, 255, 255, 0.5));
        }

        #sub-headings {
            
            border-radius: 3px;
            padding: 3px;
           
        }

        table {
            margin: 10px;
            color: black;
            /*background: linear-gradient(0deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.2));
            padding: 10px;
            border-radius: 5px;*/
            padding: 5px;
        }

        .highlight {
            background: linear-gradient(0deg, rgba(255, 255, 255, 0.4), rgba(255, 255, 255, 0.4));
            width: 25%;
            padding: 20px;
         
            border-radius: 12px;
            margin: 25px;
            height: 300px;
            font-size: 20px;
        }
        .main {
            margin-top: 60px;
        }
        
    </style>
</head>

<body>
    <center class = "menu">
        <font size="8" color="red" face="cursive" id="menu">MENU</font>
    </center>
    <center class="main">
        <div class="upper-div">
            <div class="highlight" id="div-1">
                <font size="6" color="#0000FF" face="cursive" id="sub-headings">Starters</font>
                <table>
                    <tr>
                        <td>
                            <b>1.</b>
                        </td>

                        <td>
                            <b>Paneer Tikka</b>
                        </td>


                        <td>
                            <b>~180/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>2.</b>
                        </td>

                        <td>
                            <b>Chilli Paneer</b>
                        </td>


                        <td>
                            <b>~160/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>3.</b>
                        </td>

                        <td>
                            <b>Spring Roll</b>
                        </td>


                        <td>
                            <b>~140/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>4.</b>
                        </td>

                        <td>
                            <b>Afgani Chaap</b>
                        </td>


                        <td>
                            <b>~140/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>5.</b>
                        </td>

                        <td>
                            <b>Assorted Kabab</b>
                        </td>


                        <td>
                            <b>~200/-</b>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="highlight" id="div-2">
                <font size="6" color="#0000FF" face="cursive" id="sub-headings">Main Course</font>
                <table>
                    <tr>
                        <td>
                            <b>6.</b>
                        </td>
                        <td>
                            <b>Paneer Butter Masala</b>
                        </td>
                        <td>
                            <b>~200/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>7.</b>
                        </td>
                        <td>
                            <b>Shahi Paneer</b>
                        </td>
                        <td>
                            <b>~200/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>8.</b>
                        </td>
                        <td>
                            <b>Kadhai Paneer</b>
                        </td>
                        <td>
                            <b>~220/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>9.</b>
                        </td>
                        <td>
                            <b>Palak Paneer</b>
                        </td>
                        <td>
                            <b>~200/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>10.</b>
                        </td>

                        <td>
                            <b>Malai Kofta</b>
                        </td>


                        <td>
                            <b>~240/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>11.</b>
                        </td>

                        <td>
                            <b>Mushroom Masala</b>
                        </td>


                        <td>
                            <b>~220/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>12.</b>
                        </td>

                        <td>
                            <b>Dal Makhani</b>
                        </td>


                        <td>
                            <b>~180/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>13.</b>
                        </td>

                        <td>
                            <b>Mixed Vegetable</b>
                        </td>


                        <td>
                            <b>~160/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>14.</b>
                        </td>

                        <td>
                            <b>Jeera Aloo</b>
                        </td>


                        <td>
                            <b>~140/-</b>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
        <div class="lower-div">
            <div class="highlight" id="div-3">
                <font size="6" color="#0000FF" face="cursive" id="sub-headings">Breads</font>
                <table>
                    <tr>
                        <td>
                            <b>16.</b>
                        </td>

                        <td>
                            <b>Garlic Naan</b>
                        </td>
                        <td>
                            <b>~80/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>17.</b>
                        </td>

                        <td>
                            <b>Butter Naan</b>
                        </td>


                        <td>
                            <b>~60/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>18.</b>
                        </td>

                        <td>
                            <b>Lachha Paratha</b>
                        </td>


                        <td>
                            <b>~50/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>19.</b>
                        </td>

                        <td>
                            <b>Tandoori Roti</b>
                        </td>


                        <td>
                            <b>~30/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>20.</b>
                        </td>

                        <td>
                            <b>Stuffed Kulcha</b>
                        </td>


                        <td>
                            <b>~100/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>21.</b>
                        </td>

                        <td>
                            <b>Rumali Roti</b>
                        </td>


                        <td>
                            <b>~20/-</b>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="highlight" id="div-4">
                <font size="6" color="#0000FF" face="cursive" id="sub-headings">Dessert</font>
                <table>

                    <tr>
                        <td>
                            <b>22.</b>
                        </td>

                        <td>
                            <b>Gulab Jamun</b>
                        </td>


                        <td>
                            <b>~60/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>23.</b>
                        </td>

                        <td>
                            <b>Vanilla Ice Cream</b>
                        </td>


                        <td>
                            <b>~60/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>24.</b>
                        </td>

                        <td>
                            <b>Kheer</b>
                        </td>


                        <td>
                            <b>~100/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>25.</b>
                        </td>

                        <td>
                            <b>Sundae</b>
                        </td>


                        <td>
                            <b>~100/-</b>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <b>26.</b>
                        </td>

                        <td>
                            <b>Shahi Tukda</b>
                        </td>


                        <td>
                            <b>~120/-</b>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </center>

</body>

</html>