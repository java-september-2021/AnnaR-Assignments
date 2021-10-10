package com.arankin.DojoOverflow.Controller;


import java.util.List;

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

@Controller
public class OverflowQuestionController {
	private final QuestionTagsServices service;
	
	//Constructor
	public OverflowQuestionController(QuestionTagsServices service) {
		this.service = service;
	}
	
	
	@GetMapping("/")
	public String Index(Model viewModel) {		
		List<Question> qlist = service.displayAll();
		viewModel.addAttribute("ListOfQuestions", qlist);
		return "dashboard.jsp";
	}
	
	
	@GetMapping("/new")
	public String NewQuestionRenderPage(@ModelAttribute("NewQuestion") NewQuestion newQuest) {
		return "newQuestion.jsp";
	}
	
	
	@GetMapping("/{id}")
	public String questProfile(@PathVariable("id") Long id, @ModelAttribute("newAnswer") Answer ans, Model viewModel) {
		viewModel.addAttribute("question", this.service.getQuestion(id));
		return "questProfile.jsp";
	}
	
	
	@PostMapping("/")
	public String createNewQuestion(@Valid @ModelAttribute("NewQuestion") NewQuestion newQuest, BindingResult result) {
		if(result.hasErrors())
			return "newQuestion.jsp";
		this.service.createQuestion(newQuest);
		return "redirect:/";
	}
	
	
	@PostMapping("/answers")
	public String CreateAnswer(@Valid @ModelAttribute("newAnswer") Answer newAnswr, BindingResult result) {
		if(result.hasErrors())
			return "questProfile.jsp";
		Answer newAnswer = this.service.createAnswer(newAnswr);
		return "redirect:/" + newAnswer.getQuestion().getId();
	}
}//OverflowQuestionController	




