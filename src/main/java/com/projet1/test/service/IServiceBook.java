package com.projet1.test.service;

import java.util.List;

import com.projet1.test.entity.Book;

public interface IServiceBook {
	
	Book createBook(Book book);
	Book updateBook(Book book);
	List<Book> getAllBooks();
	Book getBook(long id);
	void removeBook(Long id);

}
