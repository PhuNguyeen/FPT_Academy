package com.phund17.exercise1;

/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Assignment 401
 */
public class Book {

	String nameBook;
	int isbn;
	String author;
	String publisher;

	public Book(String nameBook, int isbn, String author, String publisher) {
		super();
		this.nameBook = nameBook;
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [Name Book: " + nameBook + ", ISBN: " + isbn + ", Author: " + author + ", Publisher: " + publisher
				+ "]";
	}

}
