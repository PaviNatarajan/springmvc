package com.springboot.watertank.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.watertank.entity.UseWater;
import com.springboot.watertank.repository.WaterRepository;

@RestController
@RequestMapping("/water")
public class WaterController {
	
	@Autowired
	private WaterRepository waterRepository;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to FREE Water at CTS!!!";
	}
	
	@RequestMapping("/free")
	public String welcomefree() {
		return "You win 1 ltr of free cocktail!!!";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addWater(@RequestBody UseWater usewater) {
		
		waterRepository.save(usewater);
		return "Saved the water in water tank: " + usewater.getQuantity() + " " + usewater.getContainer();
		
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteWater(@PathVariable Integer id) {
		
		waterRepository.deleteById(id);
		return "Emptied water in water tank";
		
	}
	
	@RequestMapping("/list")
	public List<UseWater> listall() {
	
		List<UseWater> usewater=new ArrayList<>(); 
		waterRepository.findAll().forEach(usewater::add);  
        return usewater;
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public String updatewater(@PathVariable Integer id, @RequestBody UseWater usewater) {
		//UseWater usewater=waterRepository.findById(id);
		usewater.setId(id);
		usewater.setContainer(usewater.getContainer());
		usewater.setQuantity(usewater.getQuantity());
		UseWater use=waterRepository.save(usewater);
		return "content updated";
	}
	
	

}