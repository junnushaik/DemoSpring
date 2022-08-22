package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@Service
public class BookService {
	@Autowired
	BookRepo bookRepo;
	public List<Book> displayAll() {
		return bookRepo.findAll();
	}
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		 bookRepo.save(book);
		 return "Addedd Successfully";
	}
	public String updateBook(Book book) {
		// TODO Auto-generated method stub
		String res =" ";
		try {
		Book b = bookRepo.findById(book.getIsbn()).get();
		if(b!=null && book.getIsbn() == b.getIsbn()) {
		bookRepo.save(book);
		res = "Successfully Updated";
		}
		}
		catch(Exception e){
			res = "Problem occured";
		}
		return res;
	}
	public String deleteBook(int id) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(id);
		return "Successfully deleted";
	}
}
