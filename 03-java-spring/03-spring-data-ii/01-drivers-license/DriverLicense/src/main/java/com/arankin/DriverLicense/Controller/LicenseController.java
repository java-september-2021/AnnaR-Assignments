package com.arankin.DriverLicense.Controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arankin.DriverLicense.Models.*;
import com.arankin.DriverLicense.Respositories.PersonAndLicenseServices;
import com.arankin.DriverLicense.Services.*;

@Controller
public class LicenseController {
        @Autowired
		private  PersonAndLicenseServices service;


    	/*=====================================*/
    	//Construction
    	/*=====================================*/ 
		public LicenseController(PersonAndLicenseServices s) {
			this.service = s;
		}

		
//		/*=====================================*/
//		// Method: index() 
//		/*=====================================*/		
//		@RequestMapping("/persons")
//		public String index(@ModelAttribute("person") Person p) {
//			return "/persons/index.jsp";
//		}
		

		/*=====================================*/
		// Method:  renderPersonPage()
		/*=====================================*/		
		@RequestMapping("/persons/new")
	    public String renderPersonPage(@ModelAttribute("person") Person p) {
	        return "/persons/index.jsp";
	    }
		

		/*=====================================*/
		// Method: NewPerson() 
		/*=====================================*/	    
	    @RequestMapping(value="/persons", method=RequestMethod.POST)
		public String NewPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
			if(result.hasErrors() ) {
				return "index.jsp";
			}
			service.createPerson(person);
			return "redirect:/persons/new";
		}			
		

		/*=====================================*/
		// Method: renderLicensePage() 
		/*=====================================*/		
		@RequestMapping("/licenses/new")
	    public String renderLicensePage(@ModelAttribute("license") License l, Model model) {
	    	List<Person> noLicense = service.getPeopleWithNoLicense();
			model.addAttribute("persons", noLicense);

	        return "/licenses/newLicense.jsp";
	    }
	    

		/*=====================================*/
		// Method: createLicense() 
		/*=====================================*/	    
	    @RequestMapping(value="/licenses", method=RequestMethod.POST)
	    public String createLicense(@Valid @ModelAttribute("license") License newLicense,  BindingResult result, Model model) {
	    	List<Person> noLicense = service.getPeopleWithNoLicense();
			model.addAttribute("persons", noLicense);
			
	        if (result.hasErrors()) {
	            return "/licenses/newLicense.jsp";
	        } else {
	        	service.createLicense(newLicense);
	        	
	            return "redirect:/licenses/new";
	        }
	    }//create
	    		

		/*=====================================*/
		// Method: selectedPerson() 
		/*=====================================*/	    
	    @RequestMapping("/persons/{id}/selectedPerson")
		public String selectedPerson(@ModelAttribute("license") @PathVariable("id") Long id, Model model) {
			Person p = new Person();
			p = service.getPerson(id);
			model.addAttribute("person", p);
			
			return "/persons/selectedPerson.jsp";
}

	
}//LicenseController