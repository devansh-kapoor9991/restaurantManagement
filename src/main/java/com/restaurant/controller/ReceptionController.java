package com.restaurant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.dao.Jdbcimpl;
import com.restaurant.model.Seating;



@Controller 
public class ReceptionController {
	String a;
	@Autowired
	Jdbcimpl jdbc;
	
	public void jdbcsetter(Jdbcimpl jdbc) {
		this.jdbc = jdbc;
	}
	
	public ReceptionController() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@RequestMapping(value="/recep", method = RequestMethod.GET)
	public ModelAndView showreceptionpage(ModelAndView mv){
		List<Seating> seats=new ArrayList<Seating>(); 
		seats=jdbc.getAllSeating();
		

		mv.setViewName("receptionist");
		mv.addObject("seatList", seats);

		return mv;
	}
	@RequestMapping(value="/recep1",method = RequestMethod.POST)
	public String showupdatedReception(@RequestParam String checkbox) 
	{
		
		jdbc.changeStatus(Integer.parseInt(checkbox));
		System.out.println("hello"+checkbox);
		
		return "redirect:/recep";
		

	}
	@RequestMapping(value="/waiter1")
	public String showwaiter1() 
	{
		return "waiter1";
	}
	@RequestMapping(value="/waiter2")
	public String showwaiter2() 
	{
		return "waiter2";
	}
	@RequestMapping(value="/home")
	public String showhomepage() 
	{
		return "home";
	}
	@RequestMapping(value="/menu")
	public String showMenu(ModelMap model)
	{
		return "menu";
	}
		
		
	
	
}
