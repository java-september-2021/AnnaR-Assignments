package com.arankin.DojoSurvey.controller;

import java.time.LocalDate;
//import java.util.Map;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SurveyController {
	
	
	//----------------------------------------------------------------//
	// Method: index()
	// Endpoint: "/"  is the root
	// Description: 
	// Displays an empty form. The form (indexSurvey.jsp) is filled 
	// out and submitted. Inside of indexSurvey.jsp, the form tag 
	// contains: method="post" and action="/resuts".  Based on this 
	// information, the Controller knows to look at method 
	// surveyFormInpu() next. 
	//----------------------------------------------------------------//
	@RequestMapping("/")
	public String index(Model viewModel) { //Model viewModel
		
//		String[] loc = {"Bellevue","Boise","Chicago","Dallas","LA","San Jose","Online" };
//		String[] lang = {"C++","HTML","Java","JavaScript","Ruby","Jquery","Flask","React","Python"};
		//need model and push loc and lang to jsp via model
        return "indexSurvey.jsp";
    }
	

	//----------------------------------------------------------------//
	// Method surveyFormInput()
	// Endpoint: "/results" with a Post
	// Description: Captures the data received from indexSurvey.jsp 
    // into a HttpSession (this stores information into the 'cloud') and
	// then redirect it to the endpoint "/show" which calls the 
	// survey method.
	//----------------------------------------------------------------//
	@RequestMapping(value="/results",  method=RequestMethod.POST)//posting to the dbase
	public String surveyFormInput(@RequestParam(value="yourName") String yourName, @RequestParam(value="comments") String comments, @RequestParam(value="dojoLocation") String dojoLocation,  @RequestParam(value="favLanguage") String favLanguage, HttpSession session) {
		session.setAttribute("yourName", yourName);
		session.setAttribute("dojoLocation",dojoLocation);
		session.setAttribute("favLanguage",favLanguage);
		session.setAttribute("Comments",comments);
		return "redirect:/show";
	}//surveyFormInput
	
	

	//----------------------------------------------------------------//
	// Method survey()
	// Endpoint: "/show" 
	// Description: Captures the data received from the HttpSession
    // and puts it into a viewModel to display it on the page 
	// "surveyResults.jsp".
	//----------------------------------------------------------------//
	@RequestMapping(value="/show")
	public String survey ( Model modelView, HttpSession session) {		
		modelView.addAttribute("yourName", session.getAttribute("yourName"));
		modelView.addAttribute("dojoLocation",session.getAttribute("dojoLocation"));
		modelView.addAttribute("favLanguage",session.getAttribute("favLanguage"));
		modelView.addAttribute("Comments",session.getAttribute("Comments"));

		return "surveyResults.jsp";
	}
		

}//SurveyController



