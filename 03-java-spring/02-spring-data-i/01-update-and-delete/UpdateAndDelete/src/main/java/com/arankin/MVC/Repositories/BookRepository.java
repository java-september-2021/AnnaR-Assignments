package com.arankin.MVC.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arankin.MVC.Models.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Long>{//Book is the model, Long is for the key
       // this method retrieves all the books from the database
	    List<Book> findAll();
	    
	    // this method finds books with descriptions containing the search string
	    List<Book> findByDescriptionContaining(String search);
	    
	    // this method counts how many titles contain a certain string
	    Long countByTitleContaining(String search);
	    
	    // this method deletes a book that starts with a specific title
	    Long deleteByTitleStartingWith(String search);	    
	
}//BookRepository

