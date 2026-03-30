package com.spring.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("library.xml");
		Library lib = (Library) context.getBean("lib");
		List<Book> book =  (List<Book>) lib.getBook();
		for(Book b : book)
			System.out.println(b);

	}

}
