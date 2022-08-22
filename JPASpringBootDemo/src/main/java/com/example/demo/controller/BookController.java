package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
@Controller
public class BookController {
	@Autowired
	BookService bookService;
	@RequestMapping("/all")
	public List<Book> displayAll() {
		return bookService.displayAll();
	}
	@PostMapping("/add")
	public String addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	@PutMapping("/update")
	public String updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	@DeleteMapping("/delete")
	public String deleteBook(@RequestParam int id) {
		return bookService.deleteBook(id);
	}
}
