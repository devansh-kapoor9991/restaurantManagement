package com.restaurant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RestController;




import com.restaurant.dao.Jdbcimpl;
import com.restaurant.model.Login;
import com.restaurant.model.Menu;

@CrossOrigin(origins = "http://localhost:3000")	
@RestController
@RequestMapping("/api/v1/")
	
	public class LoginController 
	{	
		@GetMapping("/waiter1")
		public String showWaiter1(ModelMap model)
		{
			return "waiter1";
		}	
		@GetMapping("/orderstatus2")
		public String showStatus2(ModelMap model)
		{
			return "orderstatus2";
		}
		@GetMapping("/waiter2")
		public String showWaiter2(ModelMap model)
		{
			return "waiter2";
		}
		
		@GetMapping(value="/orderstatus1")
		public String showStatus1(ModelMap model)
		{
			return "orderstatus1";
		}
		
		
		
		@GetMapping("/home")
		public String showHome(ModelMap model)
		{
			return "home";
		}
	
		
		
		

		@GetMapping(value="/login")
		public String showLoginPage(ModelMap model){
			return "login";
		}
		
		@PostMapping(value="/login")
		public String showWelcomePage(@RequestBody Login login)
		{
			
			if(login.getUsername().equals("Nilesh@123")&&login.getPassword().equals("Admin@1234"))
			{
				
				return "recep";
				
			}
			else if(login.getUsername().equals("Rahul@123")&&login.getPassword().equals("Admin@1234"))
			{
				
				return "waiter1";
				
			}
			else if(login.getUsername().equals("Vijay@123")&&login.getPassword().equals("Admin@1234"))
			{
				
				return "waiter2";
				
			}
			else if(login.getUsername().equals("Sanjeev@123")&&login.getPassword().equals("Admin@1234"))
			{
				
				return "chefdisplay";
				
			}
			else if(login.getUsername().equals("Rajiv@123")&&login.getPassword().equals("Admin@1234"))
			{
				
				return "chefdisplay1";
				
			}
			return "Invalid Credentials!! Try Again";
			
			}
			
		
		
		
	}
	