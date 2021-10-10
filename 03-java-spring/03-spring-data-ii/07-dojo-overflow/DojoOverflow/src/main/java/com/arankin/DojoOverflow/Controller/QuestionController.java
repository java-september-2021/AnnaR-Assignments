package com.arankin.DojoOverflow.Controller;


	import javax.validation.Valid;
	
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;

	import com.arankin.DojoOverflow.Models.*;
	import com.arankin.DojoOverflow.Services.*;

	//@Controller

    //public class OverflowController {
	public class QuestionController {
		//private final AppService service;
		private final QuestionTagsServices service;
		
		//Constructor
		public QuestionController(QuestionTagsServices service) {
			this.service = service;
		}
		
		
		@GetMapping("/")
		public String dashboardRenderPage(Model viewModel) {
			viewModel.addAttribute("questions", this.service.displayAll());
			return "index.jsp";
		}
		
		
		@GetMapping("/new")
		public String New(@ModelAttribute("newQuest") NewQuestion newQuest) {
			return "new.jsp";
		}
		
		
		@GetMapping("/{id}")
		public String Show(@PathVariable("id") Long id, @ModelAttribute("ans") Answer ans, Model model) {
			model.addAttribute("question", this.service.getQuestion(id));
			return "show.jsp";
		}
		
		
		@PostMapping("/")
		public String Create(@Valid @ModelAttribute("newQuest") NewQuestion newQuest, BindingResult result) {
			if(result.hasErrors())
				return "newQuestion.jsp";
			this.service.createQuestion(newQuest);
			return "redirect:/";
		}
		
		
		@PostMapping("/answers")
		public String CreateAnswer(@Valid @ModelAttribute("ans1") Answer ans1, BindingResult result) {
			if(result.hasErrors())
				return "show.jsp";
			Answer newAnswer = this.service.createAnswer(ans1);
			return "redirect:/" + newAnswer.getQuestion().getId();
		}
	}//OverflowController	
	

