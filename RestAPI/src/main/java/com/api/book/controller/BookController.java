package com.api.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.Book;
import com.api.book.services.BookaService;

@RestController
public class BookController {
	
	@Autowired
private BookaService bookservice;
	
	//get all book handler
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getbooks()
	{
		List<Book> list = this.bookservice.getallbooks();
		if(list.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
		}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getbook(@PathVariable("id") int id)
	{
	Book book= this.bookservice.getbookbyid(id);
	   if(book== null) {
		   
return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	   }
	   return ResponseEntity.of(Optional.of(book));
	}
	
	@PostMapping("/books")
	public ResponseEntity<Book> addbook(@RequestBody Book book)
	{ 
		Book b=null;
	try {
		b= this.bookservice.addBook(book);
		return ResponseEntity.of(Optional.of(b));
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		
	}
	}
	
	
	//delete book handler
	@DeleteMapping("/books/{bookid}")
	public ResponseEntity<Void> deleteBook(@PathVariable("bookid")int bookid)
	{
		try {
	this.bookservice.deleteBook(bookid);
	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
		catch(Exception e)
		{
			e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	//update the data
		@PutMapping("/books/{bookid}")
		public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable("bookid") int bookid)
		{
			try {
			this.bookservice.updateBook(book,bookid);
			return ResponseEntity.ok().body(book);
		}
			catch(Exception e)
			{
				e.printStackTrace();
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			 
				
			}
		}
}
