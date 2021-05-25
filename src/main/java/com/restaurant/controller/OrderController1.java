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
public class OrderController1 {
	int dc[]=new int[26];
	int q[]=new int[26];
	int i=0;
	double bill=0;
	String tableno="";
	
	@Autowired
	Jdbcimpl jdbc;
	@Autowired
	Orders order;
	
	
	
	
	@RequestMapping(value="/order2", method = RequestMethod.GET)
	public String showorder2(Model model)
	{
		model.addAttribute("custorder1", order);
		return "takeorder1";
	}
	
	@RequestMapping(value="/takeorder1", method = RequestMethod.POST)
	public String showHome(ModelMap model, @ModelAttribute("custorder1") Orders O)
	{	
		Menu menu = jdbc.getCodeandPrice(O.getDishname());	
		q[i]=O.getQuantity();
		
		dc[i]=menu.getDish_code();
				i++;
		tableno=O.getTableno();
		bill+=menu.getPrice()*O.getQuantity();
		System.out.println(bill);
		
		
		
		return "takeorder1";
	}
		
		@RequestMapping(value="/waiter2", method = RequestMethod.POST)
		public String showorderdetail1(Model model) throws IOException, SQLException
		{
			Orderdetails od=new Orderdetails();
			od.setDish_code(dc);
			od.setBill(bill);
			od.setQuantity(q);
			od.setTable_no(tableno);
			int a=	jdbc.insertOrders(od);
			Orderdetails od1=new Orderdetails();
			od1=jdbc.getOrderdetails(tableno);
			System.out.println(od1);
			return "waiter2";
		}
	}

