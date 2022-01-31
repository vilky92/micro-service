package com.projet1.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet1.test.entity.Book;
import com.projet1.test.service.IServiceBook;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/book")
public class ControllerBook {
	
	@Autowired
	IServiceBook bookService;
	
	
	@PostMapping("/post")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable long id) {
		return bookService.getBook(id);
	}
	
	@GetMapping("/getAll")
	public List<Book> getAllBook() {
		return bookService.getAllBooks();
	}
	
	@PutMapping("/put")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable long id) {
		bookService.removeBook(id);
	}
}
