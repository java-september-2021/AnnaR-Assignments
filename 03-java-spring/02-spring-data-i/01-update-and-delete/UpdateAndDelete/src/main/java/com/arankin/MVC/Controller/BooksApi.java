package com.arankin.MVC.Controller;

import com.arankin.MVC.Models.Book;
import com.arankin.MVC.Services.BookService;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BooksApi {

	private final BookService bookService;

    /*==============================*/
    //Constructor
    /*==============================*/ 
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
		
	}
	
    /*==============================*/
    // Method: index()
    /*==============================*/ 	
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    
    /*==============================*/
    // Method: create()
    /*==============================*/   
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
 
    
    /*==============================*/
    // Method: show()
    /*==============================*/
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }

    
   /*==============================*/
   // Method: update()
   /*==============================*/
   @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
   public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {

        Book bookToUpdate = new Book();
        
        //locate the book
        bookToUpdate =  bookService.findBook(id);
        
        //update its data
        if (bookToUpdate != null) {
        bookToUpdate.setTitle(title);
        bookToUpdate.setDescription(desc);
        bookToUpdate.setLanguage(lang);
        bookToUpdate.setNumberOfPages(numOfPages);                
        }        	
        bookToUpdate = bookService.updateBook(bookToUpdate);
            return bookToUpdate;       
   }  
        
   
   /*==============================*/
   // Method: destroy()
   /*==============================*/   
   @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
   public void destroy(@PathVariable("id") Long id) {
        Book bookToDelete = new Book();
            
        //locate the book
        bookToDelete =  bookService.findBook(id);
        bookService.deleteBook(bookToDelete);
   }
	
}//class BookApi
