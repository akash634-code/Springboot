package com.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Component
public class BookaService {

	@Autowired
	private BookRepository bookrepository;
	/*private static List<Book> list=new ArrayList<>();
	
	static {
		list.add(new Book(12,"java","xyz"));
		list.add(new Book(13,"c langauage","abc"));
		list.add(new Book(15,"thriller","saksham"));
	}*/
	
	//get all books
	public List<Book> getallbooks()
	{
		List<Book> list = (List<Book>)this.bookrepository.findAll();
		return list;
	}
	
	//get single book
	public Book getbookbyid(int id)
	{ 
		Book book=null;
		try {
		//book=list.stream().filter(e->e.getId()==id).findFirst().get();
		book= this.bookrepository.findById(id);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return book;
		
	}
	
	//adding book
	public Book addBook(Book b)
	{
		Book result=bookrepository.save(b);
		//list.add(b);
		return result;
	}
	
	//delete book
	public void deleteBook(int bid)
	{
	/*list=	list.stream().filter(book->{
			if(book.getId()!= bid)
			{
				return true;
			}
			else {
				return false;
			}
				
		}).collect(Collectors.toList());*/
	bookrepository.deleteById(bid);
	}
	
	//upadte the book
	public void updateBook(Book book,int bookid)
	{
		/*list.stream().map(b->{
			if(b.getId()==bookid)
			{
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());*/
		book.setId(bookid);
		bookrepository.save(book);
	}
	
}
