package com.arankin.DojoAndNinja.Controller;


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

	//import com.arankin.DojoAndNinja.*;
	import com.arankin.DojoAndNinja.Models.*;
	import com.arankin.DojoAndNinja.Services.*;

	@Controller
	public class HomeController {
		
		@Autowired
		private  final DojoNinjaServices services;

		public HomeController(DojoNinjaServices services) {
			this.services = services;
		}	
		
		//-------------------------
		//Dojo Controllers
		//-------------------------
		
		//Renders Index page
		@RequestMapping("/dojos/new")
		public String Index(@ModelAttribute("dojo") Dojo dj) {
			return "/dojos/index.jsp";
		}

		//The viewers on index is the model attributes for the form, this is to receive data
		@RequestMapping(value="/dojos", method=RequestMethod.POST)
		public String NewDojo(@Valid @ModelAttribute("dojo") Dojo dj, BindingResult result) {
			if(result.hasErrors() ) {
				return "index.jsp";
			}
			services.createDojo(dj);
			return "redirect:/dojos";
		}			
		
		//-------------------------
		//Renders list of Ninjas
		//-------------------------		
		@RequestMapping("/dojos/{id}")
		public String Show(@PathVariable("id") Long id, Model model) {
			model.addAttribute("Dojo", services.getDojo(id));
			return "/dojos/dojosNinjaList.jsp";
		}

		
		//-------------------------
		//Ninja Controllers
		//-------------------------
	    
	    @RequestMapping("/ninjas/new")
	    public String Create(@ModelAttribute("ninja") Ninja n, Model model) {
	    	List<Dojo> dojoList = services.dojoList();
			model.addAttribute("dojos", dojoList);

	        return "/ninjas/newNinja.jsp";
	    }
	    
	    @RequestMapping(value="/ninjas", method=RequestMethod.POST)
	    public String createNinja(@Valid @ModelAttribute("ninja") Ninja newNinja,  BindingResult result, Model model) {
	    	List<Dojo> dojoList = services.dojoList();
			model.addAttribute("dojos", dojoList);
			
	        if (result.hasErrors()) {
	            return "/ninjas/newNinja.jsp";
	        } else {
	        	services.createNinja(newNinja);
	        	
	            return "redirect:/ninjas/new";
	        }
	    }//create
	

}//HomeController
