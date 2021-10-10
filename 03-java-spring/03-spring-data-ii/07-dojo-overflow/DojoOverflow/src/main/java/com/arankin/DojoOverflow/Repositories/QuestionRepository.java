package com.arankin.DojoOverflow.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.arankin.DojoOverflow.Models.*;

public interface QuestionRepository extends CrudRepository<Question, Long>{
	List<Question> findAll();
}