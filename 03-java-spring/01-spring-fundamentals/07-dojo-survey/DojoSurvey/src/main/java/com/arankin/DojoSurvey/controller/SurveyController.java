package com.arankin.DojoSurvey.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SurveyController {

	@RequestMapping("/")
	public String index(Model viewModel) { //Model viewModel
        return "indexSurvey.jsp";
    }
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String survey (@RequestParam(value="yourName") String yourName, @RequestParam(value="comments") String comments,  Model modelView, RedirectAttributes redirectAttributes, @RequestParam(value="dojoLocation") String dojoLocation,  @RequestParam(value="favLanguage") String favLanguage) {
		String[] location = {"Bellevue","Boise","Chicago","Dallas","LA","San Jose","Online" };
		String[] language = {"C++","HTML","Java","JavaScript","Ruby","Jquery","Flask","React","Python"};
		modelView.addAttribute("yourName",yourName);
		modelView.addAttribute("dojoLocation",location);
		modelView.addAttribute("favLanguage",language);
		modelView.addAttribute("Comments",comments);
	
		String cmt2 = comments;
		modelView.addAttribute("Comments2",cmt2);

		return "indexSurvey.jsp";
	}
		
	@RequestMapping("/results")
	public String surveyResults() {
		return "surveyResults.jsp";
	}
	

}//SurveyController



