package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	int isbn;
	String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int isbn, String author) {
		super();
		this.isbn = isbn;
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + "]";
	}
	
}
	