package com.spring.core;

public class Book {
	private int bookId;
	private String bookName;
	public Book(int bookId, String bookName) {  //constructor injection
		this.bookId = bookId;
		this.bookName = bookName;
		
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	public Book() {}
}
