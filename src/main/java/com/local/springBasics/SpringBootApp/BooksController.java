package com.local.springBasics.SpringBootApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BooksController {	
	@GetMapping("/book")
	public List<Book> getBooksList(){
		
	
		return Arrays.asList(new Book(05,"Harry pottr and ky"),
				new Book(05,"eclipse pott"),
				new Book(05,"Harry p"),
				new Book(05,"Hay ofgjf"));
	}

}
