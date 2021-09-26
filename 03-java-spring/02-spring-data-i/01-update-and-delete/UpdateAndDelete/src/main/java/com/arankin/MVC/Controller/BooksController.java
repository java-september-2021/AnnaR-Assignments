package com.arankin.MVC.Controller;

import com.arankin.MVC.Models.Book;
import com.arankin.MVC.Services.BookService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class BooksController {
	 private final BookService bookService;

	 /*==============================*/
	 //Constructor
	 /*==============================*/ 	     
	 public BooksController(BookService bookService) {
	        this.bookService = bookService;
	 }
	    
	 /*==============================*/
	 //Method: index()
	 /*==============================*/ 	    
	 @RequestMapping("/books")
	 public String index(Model model) {
	        List<Book> books = bookService.allBooks();
	        model.addAttribute("books", books);
	        return "/books/index.jsp";
	 }	    
	    
	 /*==============================*/
	 //Method: newBook()
	 /*==============================*/ 	
	 @RequestMapping("/books/new")
	 public String newBook(@ModelAttribute("book") Book book) {
	        return "/books/new.jsp";
	  }
	    
	 /*==============================*/
	 //Method: create()
	 /*==============================*/ 	
	 @RequestMapping(value="/books", method=RequestMethod.POST)
	 public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/books/new.jsp";
	        } else {
	            bookService.createBook(book);
	            return "redirect:/books";
	        }
	 }//create

	    
	 /*==============================*/
	 //Method: show()
	 /*==============================*/ 		    
	 @RequestMapping(value="/books/{id}/show", method=RequestMethod.GET)
	 public String show(@PathVariable("id") Long id, Model model) {
	        Book bookToShow = new Book();	        
	        
	        //search for book
	        bookToShow =  bookService.findBook(id);	        
	        model.addAttribute("book", bookToShow);
	    	model.addAttribute("book.title", bookToShow.getTitle());
	    	model.addAttribute("book.description", bookToShow.getDescription());
	    	model.addAttribute("book.language", bookToShow.getLanguage());
	    	model.addAttribute("book.numberOfPages", bookToShow.getNumberOfPages());
	    	model.addAttribute("book.id", bookToShow.getId());	    	
			return "/books/show.jsp";
    }//show	  
	    

	 /*==============================*/
	 //Method: edit()
	 /*==============================*/ 	
	 @RequestMapping("/books/{id}/edit")
	 public String edit(@PathVariable("id") Long id, Model model) {
	        Book book = bookService.findBook(id);
	        model.addAttribute("book", book);
	        return "/books/edit.jsp";
	 }
	    

	 /*==============================*/
	 //Method: update()
	 /*==============================*/ 		    
	 @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
	 public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/books/edit.jsp";
	        } else {
	            bookService.updateBook(book);
	            return "redirect:/books";
	        }
	  }	    


	 /*==============================*/
	 //Method: destroy()
	 /*==============================*/ 	
	 @RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
	 public String destroy(@PathVariable("id") Long id) {
	    	//Book book = bookService.findBook(id);
	        bookService.deleteBook(id);
	        return "redirect:/books";
	  }	    
}//BooksController

