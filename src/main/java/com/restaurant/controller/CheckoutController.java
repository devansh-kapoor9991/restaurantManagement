package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.restaurant.dao.Jdbcimpl;
import com.restaurant.dao.SendEmail;

@Controller
public class CheckoutController {
	@Autowired
	Jdbcimpl jdbc;
	@Autowired
	SendEmail sendemail;
	
	@RequestMapping(value="/checkout", method = RequestMethod.GET)
	public String showCheckout(ModelMap model)
	{
		return "checkout";
	}
	

	@RequestMapping(value="/checkout", method = RequestMethod.POST)
	public String showCheckoutPage1(ModelMap model, @RequestParam String emailid, @RequestParam String table) {
		System.out.println(emailid);
		     String tablebill= jdbc.findBill(Integer.parseInt(table));
		     System.out.println(emailid);    
		     sendemail.sendEmail(emailid,tablebill);
		     jdbc.deleteRow(Integer.parseInt(table));
		     jdbc.changeStatus1(Integer.parseInt(table));
		     if(Integer.parseInt(table)>=1&&Integer.parseInt(table)<=3)
		     return "waiter1";
		    
		     else
		    	 return "waiter2";
		    	 
		
	}



	
}
