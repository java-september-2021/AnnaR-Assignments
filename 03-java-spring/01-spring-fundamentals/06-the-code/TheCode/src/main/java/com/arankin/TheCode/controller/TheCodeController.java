package com.arankin.TheCode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {
	

//	@RequestMapping("/")
//	public String mainIndex() {
//		return "indexMain.jsp";
//	}
	
    @RequestMapping("/")
    public String index(@ModelAttribute("errors") String errors) {
        System.out.println(errors);
        return "indexMain.jsp";
    }

	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process (@RequestParam(value="inputdata") String inputdata, RedirectAttributes redirectAttributes ) {
			
		if(inputdata.equals("bushido")) { 
			return "redirect:/code";
		 }
		else  {
			redirectAttributes.addFlashAttribute("errorMsg", "You need to train harder");		  
		    return "redirect:/";
			
		 }
	}
	@RequestMapping("/code")
	public String Code() {		
		return "theCode.jsp";
	
	}
	

}//TheCodeController
