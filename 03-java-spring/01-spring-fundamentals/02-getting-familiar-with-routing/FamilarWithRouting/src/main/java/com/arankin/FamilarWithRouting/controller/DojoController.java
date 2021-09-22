package com.arankin.FamilarWithRouting.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {	
	
	@RequestMapping("/dojo")
	public String coding() { 

		return "Did you know that the dojo is awesome!";
    }
	
	
	@RequestMapping(value="dojo/{city}", method=RequestMethod.GET)
	public String index(@PathVariable("city") String city) { 

		switch(city) {
		
		case "Burbank": 
			  return "Burbank Dojo is located in Southern California.";
		case "san-jose": 
			  return "SJ dojo is the headquarters";	
			  
		default:
			  return String.format("%s is awesome",  city);
		}	
    }
	
}//class DojoController

