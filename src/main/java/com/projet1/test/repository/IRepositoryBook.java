package com.projet1.test.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projet1.test.entity.Book;


public interface IRepositoryBook extends JpaRepository<Book, Long>{
	
	Book findByName(String name);
	Book findByAuthor(String author);

}
