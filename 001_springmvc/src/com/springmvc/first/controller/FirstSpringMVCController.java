package com.springmvc.first.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstSpringMVCController {
	 ArrayList<FirstSpringMVC> list=new ArrayList<FirstSpringMVC>();  
	/*@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	@RequestMapping("/message")
	public String sendMessage(Model m) {
		m.addAttribute("myMessage","Hello from spring MVC");
		m.addAttribute("myMessage1","Hello from spring MVC");
		return "kitchen";
	}
	@RequestMapping("/m1")
	public String sendMessage1(Model m1) {
		m1.addAttribute("m1", "hai Spring");
		return "kitchen";
	}
	@RequestMapping("/supermessage")
	public ModelAndView sendSuperMessage(ModelAndView mv) {
		mv.addObject("food", "hai");
		mv.setViewName("canteen");
		return mv;
	}*/
	@RequestMapping("/empform")
	public ModelAndView showform() {
		return new ModelAndView("empform","command",new FirstSpringMVC());
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("FirstSpringMVC") FirstSpringMVC FirstSpringMVC) {
		System.out.println(FirstSpringMVC.getId()+" "+FirstSpringMVC.getName()+" "+FirstSpringMVC.getSalary()+" "+FirstSpringMVC.getDesignation());
		 	
			list.add(new FirstSpringMVC(1,"rahul",35000f,"S.Engineer"));  
	        list.add(new FirstSpringMVC(2,"aditya",25000f,"IT Manager"));  
	       list.add(new FirstSpringMVC(3,"sachin",55000f,"Care Taker")); 
	       list.add(FirstSpringMVC) ;
		return new ModelAndView("redirect:/viewemp");
	}
	@RequestMapping("/viewemp")  
    public ModelAndView viewemp(){  
        //write the code to get all employees from DAO  
        //here, we are writing manual code of list for easy understanding  
      
        System.out.println(list.size());
          
        return new ModelAndView("viewemp","emplist",list);  
    }  


	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}







}
