package com.restaurant.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.restaurant.dao.Jdbcimpl;
import com.restaurant.model.Menu;
import com.restaurant.model.Orderdetails;
import com.restaurant.model.Orders;

@Controller
public class OrderController {
	 int dc[]=new int[26];
	 int q[]=new int[26];
	 int i=0;
	  double bill=0;
 String tableno="";
	
	@Autowired
	Jdbcimpl jdbc;
	@Autowired
	Orders order ;

	
	
	@RequestMapping(value="/order1", method = RequestMethod.GET)
	public String showorder1(Model model)
	{
		model.addAttribute("custorder", order);
		return "takeorder";
	}
	
	@RequestMapping(value="/takeorder", method = RequestMethod.POST)
	public String showOrderpage(ModelMap model, @ModelAttribute("custorder") Orders O)
	{	
		
		Menu menu = jdbc.getCodeandPrice(O.getDishname());	
		q[i]=O.getQuantity();
		
		dc[i]=menu.getDish_code();
				i++;
		tableno=O.getTableno();
		System.out.println(tableno);
		bill+=menu.getPrice()*O.getQuantity();
		
		System.out.println(bill);
		System.out.println(i);
		
		
		
		return "takeorder";
	}
		
		@RequestMapping(value="/waiter1", method = RequestMethod.POST)
		public String showorderdetail(Model model) throws IOException, SQLException
		{
			Orderdetails od=new Orderdetails();
			od.setDish_code(dc);
			od.setBill(bill);
			od.setQuantity(q);
			od.setTable_no(tableno);
			int a=	jdbc.insertOrders(od);
			
			
			Orderdetails od1=new Orderdetails();
			System.out.println(tableno);
			od1=jdbc.getOrderdetails(tableno);
			System.out.println(od1);
			bill=0;
			i=0;
			return "waiter1";
		}
	}

