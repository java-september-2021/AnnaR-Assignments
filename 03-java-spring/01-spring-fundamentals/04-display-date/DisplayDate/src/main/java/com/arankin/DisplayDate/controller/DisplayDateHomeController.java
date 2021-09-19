package com.arankin.DisplayDate.controller;

import java.util.*;
import java.time.*;
import java.text.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DisplayDateHomeController {
	
		@RequestMapping("/")
		public String index(Model viewModel) { //Model viewModel
//			viewModel.addAttribute("dateLink", "<h3><a href=\"url\">Date Template</a></h3>");
//			viewModel.addAttribute("timeLink", "<h3><a href=\"url\">Time Template</a></h3>");
	        return "index.jsp";
	    }
		@RequestMapping("/date2")
	    public String date(Model viewModel) {
			LocalDate currentDate = LocalDate.now();
			String dateStrg = currentDate.getDayOfWeek() + ", the " + currentDate.getDayOfMonth() + " of " + currentDate.getMonth() + ", " + currentDate.getYear();

			viewModel.addAttribute("dateValue", dateStrg);
	        return "date.jsp";
	    }
		@RequestMapping("/time2")
		public String time(Model viewModel) {
			Date time = new Date ();
			String timeToStr = DateFormat.getInstance().format(time);  
			timeToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(time);  			  	  
			viewModel.addAttribute("timeValue", timeToStr);
	        return "time.jsp";
	    }	
}//DisplayDate_HomeController
