package com.aneesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home() {
		
		ModelAndView view = new ModelAndView("Home");
		
		return view;
	}
	
	
	@RequestMapping(value="/About-us", method=RequestMethod.GET)
	public String showAboutUs()
	{
		return "About-us";
	}
	@RequestMapping(value="/ContactUs",method=RequestMethod.GET)
	public String showContactUs()
	{
		return "ContactUs";
	}
	@RequestMapping(value="/AdminHome", method=RequestMethod.GET)
	public String showAdminHome()
	{
		return "AdminHome";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLoginPage()
	{
		return "Login";
	}
	@RequestMapping(value="/UserHome", method=RequestMethod.GET)
	public String showUserHomePage()
	{
		return "UserHome";
	}
	@RequestMapping(value="/Home",method=RequestMethod.GET)
	public String showHomePage()
	{
		return "Home";
	}
	@RequestMapping(value="/OnePlus",method=RequestMethod.GET)
	public String showOnePlusPage()
	{
		return "OnePlus";
	}		
	@RequestMapping(value="/Iphone",method=RequestMethod.GET)
	public String showapple()
	{
		return "Iphone";
	}		
	@RequestMapping(value="/Xiaomi",method=RequestMethod.GET)
	public String showXiaomiPage()
	{
		return "Xiaomi";
	}		
}
