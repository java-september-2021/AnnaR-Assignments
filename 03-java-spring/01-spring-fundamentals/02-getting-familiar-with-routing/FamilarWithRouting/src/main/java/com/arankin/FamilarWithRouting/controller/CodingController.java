package com.arankin.FamilarWithRouting.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {	
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String coding(Model viewModel) { //Model viewModel

       return "Hello Coding Dojo";
    }
	
	@RequestMapping(value="/python", method=RequestMethod.GET)
	public String index() { 

		return "Python/Django was awesome!";
    }
	
	@RequestMapping(value="/java", method=RequestMethod.GET)
	public String java() { //Model viewModel

		return "Java/Spring is better!";
    }
	
	
}// class CodingController
