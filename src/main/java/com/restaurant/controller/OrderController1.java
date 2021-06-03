package com.restaurant.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.dao.Jdbcimpl;
import com.restaurant.model.Menu;
import com.restaurant.model.Orderdetails;
import com.restaurant.model.Orders;

@Controller
public class OrderController1 {
	int dc[]=new int[26];
	int q[]=new int[26];
	int i=0,j=0;
	double bill=0;
	String tableno="";
	int k=0;

	@Autowired
	Jdbcimpl jdbc;
	@Autowired
	Orders order;
	
	 List<Orders> ords1=new ArrayList<Orders>();
	 public List<Orders> chefords1=new ArrayList<Orders>();
		public List<Orders> waiterords1=new ArrayList<Orders>();
	 
	
	
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
		
				ords1.add(O);
				k++;
				i++;
				System.out.println(tableno);
				bill+=menu.getPrice()*O.getQuantity();
				
				System.out.println(bill);
				System.out.println(i);
				
				System.out.println(ords1);
				
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

		@RequestMapping(value="/chefdisplay1", method = RequestMethod.GET)
		public ModelAndView showChefpage1(ModelAndView mv)
		{
			System.out.println("insideCHEF");
			
			System.out.println("sdasfas"+ords1);
			mv.setViewName("chef1");
			mv.addObject("orderList1",ords1);

			return mv;
		}
		@RequestMapping(value="/chefdisplay22",method = RequestMethod.POST)
		public String showupdatedChef(@RequestParam String checkbox1, @RequestParam int checkbox2, @RequestParam String checkbox3) 
		{
			order.setDishname(checkbox1);
			order.setQuantity(checkbox2);
			order.setTableno(checkbox3);
			chefords1.add(order);
			for(i=0;i<chefords1.size();i++)
			{
				for(j=0;j<ords1.size();j++)
				if(ords1.get(j).equals(chefords1.get(i)))
				{
					waiterords1.add(ords1.get(j));
					ords1.remove(j);
					
					
				}
				System.out.println("waiterrr"+waiterords1);
				System.out.println(ords1);
				System.out.println("cheff"+chefords1);
						
			}
			
			
			return "redirect:/chefdisplay1";

		}
		@RequestMapping(value="/orderstatusV", method = RequestMethod.GET)
		public ModelAndView showOrderstatus(ModelAndView mv)
		{
			System.out.println("insideorderstatus2");
			
			mv.setViewName("orderstatus2");
			mv.addObject("orderstatuswaiter2",waiterords1);

			return mv;
		}

	}

