package com.arankin.MVC4.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.arankin.MVC4.Models.Book;
import com.arankin.MVC4.Respositories.*;

@Service //This annotation will allows Spring to inject this class as a dependency in any controller
public class BookService {

  // adding the book repository as a dependency
  private final BookRepository bookRepository;
  
 
  /*==============================*/
  //Constructor
  /*==============================*/  
  public BookService(BookRepository bookRepository) {
      this.bookRepository = bookRepository;
  }  

  /*==============================*/
  // Method: allBooks()
  /*==============================*/
  public List<Book> allBooks() {
      return bookRepository.findAll();
  }  

  /*==============================*/
  // Method: createBook()
  /*==============================*/ 
  public Book createBook(Book b) {
      return bookRepository.save(b); //Also used in updateBook method.
  }  

  /*==============================*/
  // Method: findBook()
  /*==============================*/
  public Book findBook(Long id) {
      Optional<Book> optionalBook = bookRepository.findById(id); 
      if(optionalBook.isPresent()) {
          return optionalBook.get();
      } else {
          return null;
      }
  }    

  /*==============================*/
  // Method: updateBook()
  /*==============================*/
  public Book  updateBook(Book b) {  	
      return bookRepository.save(b); 
  }

  /*==============================*/
  // Method: deleteBook() by book
  /*==============================*/
  public void  deleteBook (Book b) {  	
  if (b != null)	
       { bookRepository.delete(b); } 
  }  
 

  /*==============================*/
  // Method: deleteBook() by id
  /*==============================*/
  public void  deleteBook (Long id) {     		 
    Book b = findBook(id);
    if (b != null)	
    { bookRepository.delete(b); } 
   }   
}//BookService