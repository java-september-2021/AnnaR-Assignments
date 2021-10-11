package com.arankin.authentication.Controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.arankin.authentication.Services.*;
import com.arankin.authentication.Models.*;


@Controller
public class UserController {
	@Autowired
    private  final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/registration") //To render the registration page
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    	
    	if(result.hasErrors()) { //If there are errors, re-render this page to show the errors else do below code.
			return "registrationPage.jsp";		
    	}
    	
		User usr = this.userService.registerUser(user); //If no errors then call registerUser method, this returns the id as well
		
		session.setAttribute("userId", usr.getId()); //This method grab the new User id for the session		
		System.out.println("Inside Registration:  Id is: " + session.getAttribute("userId"));
		return "redirect:/home";
		
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model viewModel, HttpSession session) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    	
    	boolean isAuthenticated = userService.authenticateUser(email, password);
    	
    	if(isAuthenticated) {
    		User usr = this.userService.findByEmail(email);
    	    session.setAttribute("userId", usr.getId());
			return "redirect:/home";
    	}
    	else{  
    		viewModel.addAttribute("error", "Invalid Credentials.  Please try again." );
    		return "homePage.jsp";   		
    	}
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model viewModel) {
        Long userID = (Long) session.getAttribute("userId");
        System.out.println("Inside Home:  Id is: " + userID);
        User usr = this.userService.findUserById(userID); //locate the user by its id
        
        viewModel.addAttribute("user", usr);
        return "homePage.jsp";
    }
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}