package com.arankin.HelloHuman.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;


@RestController
//@Controller
@RequestMapping("/")
public class HomeController3 {

	@RequestMapping("/")
	public String hello() {
		return "Hello Human! ";
	}//hello

	@RequestMapping("/index/")
	public String index(@RequestParam(value="q", required=false) String userName, Model modelViewer) {
		modelViewer.addAttribute("userName", userName);
		System.out.println( "userName is: " + userName);
		return "userName is: " + userName;
		//return "index.jsp";
	}//index

	
	@RequestMapping("/users/{fname} {lname}")
	public String showName(@PathVariable("fname") String userFName, @PathVariable("lname") String userLName, Model modelViewer) {
		modelViewer.addAttribute("userFName", userFName);
		modelViewer.addAttribute("userLName", userLName);
		System.out.println( "user name is: " + userFName + " " + userLName);
		
		return "user name is: " + userFName + " " + userLName;
		//return "index2.jsp";
	}

//	
//	@RequestMapping("/random") public String respone () { 
//		return  "Spring Boot is great! So easy to just respond with strings.?"; 
//	}
//	 

}