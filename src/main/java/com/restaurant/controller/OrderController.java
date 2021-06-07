package com.restaurant.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.dao.Jdbcimpl;

import com.restaurant.model.Menu;
import com.restaurant.model.Orderdetails;
import com.restaurant.model.Orders;
import com.restaurant.model.Seating;

@Controller
public class OrderController {
	 int dc[]=new int[26];
	 int q[]=new int[26];
	 int i=0,j=0;
	 int k=0;
	 int id=1;
	 String status="Order-Received";
	  double bill=0;
 String tableno="";
	Orders ord[]=new Orders[26];
	public List<Orders> ords=new ArrayList<Orders>();
	public List<Orders> chefords=new ArrayList<Orders>();
	public List<Orders> waiterords=new ArrayList<Orders>();
	@Autowired
	Jdbcimpl jdbc;
	@Autowired
	Orders order;
	

	
	
	@RequestMapping(value="/order1", method = RequestMethod.GET)
	public String showorder1(Model model)
	{
		model.addAttribute("custorder", order);
		return "takeorder";
	}
	
	@RequestMapping(value="/takeorder", method = RequestMethod.POST)
	public String showOrderpage(ModelMap model, @ModelAttribute("custorder") Orders O)
	{	
		tableno=O.getTableno();
		System.out.println(tableno);
		String a=jdbc.checkStatus1(Integer.parseInt(tableno));
		System.out.println("dffasdfad"+a);
		if(a.equals("A"))
		{
		System.out.println("dffasdfad"+a);
		model.put("error","This table is still not occupied");
		jdbc.deleteRow(Integer.parseInt(tableno));
		return  "takeorder";

		}
		
		Menu menu = jdbc.getCodeandPrice(O.getDishname());	
		q[i]=O.getQuantity();
		O.setId(id++);
		O.setOrder_status(status);
		dc[i]=menu.getDish_code();
				
		tableno=O.getTableno();
		
		for(int k=0;k<ords.size();k++)
		{
			if(ords.get(k).getDishname().equals(O.getDishname())&&ords.get(k).getTableno().equals(O.getTableno()))
			{
				int z=O.getQuantity();
				ords.get(k).setQuantity(ords.get(k).getQuantity()+z);
				O=null;
			}
			
		}
		if(O!=null)
		{
		ords.add(O);
		k++;
		i++;
		System.out.println(tableno);
		bill+=menu.getPrice()*O.getQuantity();
		
		System.out.println(bill);
		System.out.println(i);
		
		System.out.println(ords);
		}
		
		
		return "takeorder";
	}
		
		@RequestMapping(value="/waiter1", method = RequestMethod.POST)
		public String showorderdetail(Model model) throws IOException, SQLException
		{
			Orderdetails od=new Orderdetails();
			if(bill>0)
			{
			od.setDish_code(dc);
			od.setBill(bill);
			od.setQuantity(q);
			od.setTable_no(tableno);
			int a=	jdbc.insertOrders(od);
			
			
			Orderdetails od1=new Orderdetails();
			System.out.println(tableno);
			od1=jdbc.getOrderdetails(tableno);
			System.out.println(od1);
			}
			bill=0;
			i=0;
			return "waiter1";
		}

		@RequestMapping(value="/chefdisplay", method = RequestMethod.GET)
		public ModelAndView showChefpage(ModelAndView mv)
		{
			System.out.println("insideCHEF");
			
			System.out.println("sdasfas"+ords);
			mv.setViewName("Chef");
			mv.addObject("orderList",ords);

			return mv;
		}

		@RequestMapping(value="/chefdisplay11",method = RequestMethod.POST)
		public String showupdatedChef(@RequestParam int id,@RequestParam String status) 
		{
			for(j=0;j<ords.size();j++)
			{
				if(ords.get(j).getId()==id)
				{
					ords.get(j).setOrder_status(status);
				}
			}
			
			return "redirect:/chefdisplay";

		}
		@RequestMapping(value="/orderstatusR", method = RequestMethod.GET)
		public ModelAndView showOrderstatus(ModelAndView mv)
		{
			System.out.println("insideorderstatus1");
			
			mv.setViewName("orderstatus1");
			mv.addObject("orderstatuswaiter1",ords);

			return mv;
		}

}
		
	

