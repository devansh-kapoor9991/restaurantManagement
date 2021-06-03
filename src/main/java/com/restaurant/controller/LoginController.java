package com.restaurant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.restaurant.dao.Jdbcimpl;
import com.restaurant.model.Menu;

	
	@Controller
	
	public class LoginController {
	
		
		
		@RequestMapping(value="/waiter1", method = RequestMethod.GET)
		public String showWaiter1(ModelMap model)
		{
			return "waiter1";
		}
		
		@RequestMapping(value="/orderstatus2", method = RequestMethod.GET)
		public String showStatus2(ModelMap model)
		{
			return "orderstatus2";
		}
		@RequestMapping(value="/waiter2", method = RequestMethod.GET)
		public String showWaiter2(ModelMap model)
		{
			return "waiter2";
		}
		
		@RequestMapping(value="/orderstatus1", method = RequestMethod.GET)
		public String showStatus1(ModelMap model)
		{
			return "orderstatus1";
		}
		
		
		
		@RequestMapping(value="/home", method = RequestMethod.GET)
		public String showHome(ModelMap model)
		{
			return "home";
		}
	
		@RequestMapping(value="/menu", method = RequestMethod.GET)
		public String showMenu(ModelMap model)
		{
			return "menu";
		}
		
		

		@RequestMapping(value="/login", method = RequestMethod.GET)
		public String showLoginPage(ModelMap model){
			return "login";
		}
		
		@RequestMapping(value="/login", method = RequestMethod.POST)
		public String showWelcomePage(ModelMap model, @RequestParam String username, @RequestParam String password)
		{
			
			if(username.equals("Nilesh@123")&&password.equals("Admin@1234"))
			{
				
				return "redirect:/recep";
			}
			
			else if(username.equals("Rahul@123")&&password.equals("Admin@1234"))
			{
			
					return "waiter1";
			
			}
			
			else if(username.equals("Vijay@123")&&password.equals("Admin@1234"))
			{
				
				return "waiter2";
			}
			
			else if(username.equals("Sanjeev@123")&&password.equals("Admin@1234"))
			{

			
				
				return "redirect:/chefdisplay";
			}
			else if(username.equals("Rajiv@123")&&password.equals("Admin@1234"))
			{

			
				
				return "redirect:/chefdisplay1";
			}		
			else
			{
				model.put("errorMessage", "Invalid Credentials!!!.Try Again");
		
				return "login";
			}
			
		}
		@RequestMapping(value="/checkout", method = RequestMethod.GET)
		public String showCheckout(ModelMap model)
		{
			return "checkout";
		}
		
	}
	