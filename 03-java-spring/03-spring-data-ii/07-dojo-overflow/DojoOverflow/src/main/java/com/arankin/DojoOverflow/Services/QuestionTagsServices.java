package com.arankin.DojoOverflow.Services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.arankin.DojoOverflow.Models.*;
import com.arankin.DojoOverflow.Repositories.*;

@Service
public class QuestionTagsServices {
	
private QuestionRepository questRepos;
private AnswerRepository answerRepos;
private TagRepository tagRepos;

public QuestionTagsServices(QuestionRepository questRepos, AnswerRepository answerRepos, TagRepository tagRepos) {
	this.questRepos = questRepos;
	this.tagRepos = tagRepos;
	this.answerRepos = answerRepos;
}

public List<Question> displayAll() {
	return this.questRepos.findAll();
}


public Question getQuestion(Long id) {
	return this.questRepos.findById(id).orElse(null);
}


public void createQuestion(NewQuestion nQuest) {
String currentQuestion = nQuest.getQuestion();
List<Tag> newQuestTag = new ArrayList<Tag>();

  //Grab each tag attached to the new question if they exist
  for(String subject: nQuest.splitTags()) {
	  Tag tag = this.tagRepos.findBySubject(subject).orElse(null);
	
	  //If no tags exist
	  if(tag == null) {
		tag = new Tag(subject);
		this.tagRepos.save(tag);
	  }
	
	  //Add if particular tag is not already in the list
	  if(newQuestTag.contains(tag) == false)
		newQuestTag.add(tag);
   }
    
  	Question newQuest = new Question(newQuestTag,currentQuestion);
  	 this.questRepos.save(newQuest);
}


public Answer createAnswer(Answer ans) {
	return this.answerRepos.save(ans);
}
}//QuestionTagsServices

