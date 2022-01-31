package com.projet1.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet1.test.entity.Book;
import com.projet1.test.repository.IRepositoryBook;

@Service
public class ServiceBook implements IServiceBook{

	@Autowired
	private IRepositoryBook books;
	
	@Override
	public Book createBook(Book book) {
		Book newBook = new Book();
		if (book.getAuthor() != null) {
			newBook.setAuthor(book.getAuthor());
		}
		if (book.getName() != null) {
			newBook.setName(book.getName());
		}
		return books.save(newBook);
	}

	@Override
	public Book updateBook(Book book) {
		if (books.findById(book.getId()) != null) {
			Book result = books.findById(book.getId()).get();
			if (book.getAuthor() != null) {
				result.setAuthor(book.getAuthor());
			}
			if (book.getName() != null) {
				result.setName(book.getName());
			}
			return books.save(result);
		} else {
			return null;
		}
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> listBook = books.findAll();
		return listBook;
	}

	@Override
	public Book getBook(long id) {
		if (books.findById(id) != null) {
			return books.findById(id).get();
		}
		else return null;
	}

	@Override
	public void removeBook(Long id) {
		books.deleteById(id);
	}

}
