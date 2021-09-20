
package com.arankin.Countr.controller;

import javax.servlet.http.HttpSession;

//import java.util.*;
//import java.sql.Date;
//import java.text.*;
//import java.time.LocalDate;
//import java.util.Calendar;
//import java.time.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class CounterController {

	//Initialize
	private void access(HttpSession session) {
		if (session.getAttribute("access") == null) {
			session.setAttribute("access", 0);
		}		
	}//access
	
	@RequestMapping("/")
	public String counter(HttpSession session) {
		access(session);
		int cntr = (int) session.getAttribute("access");
		cntr = cntr + 1;
		
		session.setAttribute("access", cntr);
		return "welcome.jsp";			
	}//counter	
	
	@RequestMapping("/showCount")
	public String showCount(HttpSession session) {
		access(session);
		return "counter.jsp";			
	}//showCount	
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";			
	}//showCount	
		
}//CounterController