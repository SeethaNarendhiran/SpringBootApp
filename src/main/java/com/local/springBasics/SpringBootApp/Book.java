package com.local.springBasics.SpringBootApp;

public class Book {

	int bookId;
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	String bookName;
	
	public Book(int id,String name){
		this.bookId= id;
		this.bookName = name;
	}
}
