package com.projet1.test.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String author;

	@Override
	public int hashCode() {
		return Objects.hash(author, id, name);
	} 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name);
	}

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	
	public Book() {
		super();
	}

}
