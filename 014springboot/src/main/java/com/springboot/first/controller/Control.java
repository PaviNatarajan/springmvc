package com.springboot.first.controller;

	import org.springframework.web.bind.annotation.ModelAttribute;  
	import org.springframework.web.bind.annotation.RequestMapping;  
	import org.springframework.web.bind.annotation.RequestMethod;  
	import org.springframework.web.servlet.ModelAndView;  
	import org.springframework.stereotype.Controller;  
	@Controller  
	public class Control {  
	    @RequestMapping("/")  
	    public String index(){  
	        return"index";  
	    }  
	    @RequestMapping(value="/save", method=RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute user_data user){  
	        ModelAndView modelAndView = new ModelAndView();  
	modelAndView.setViewName("user");      
	modelAndView.addObject("user", user);    
	return modelAndView;  
	    }  
	}  

