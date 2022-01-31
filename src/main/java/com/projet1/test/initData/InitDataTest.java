package com.projet1.test.initData;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.projet1.test.entity.Book;
import com.projet1.test.repository.IRepositoryBook;

@Component
public class InitDataTest implements CommandLineRunner{

	@Autowired
	IRepositoryBook books;
	
	@Override
	public void run(String... args) throws Exception {
/*		List <Book> bookList = books.findAll();
		int i = 0;
		while (i < 11) {
			Book book = new Book("book " + i, "author " + i);
			bookList.add(book);
		} */
		
/*		Book book = new Book("la petite sirène", "douglass");
		books.save(book); */
		
	}

}
