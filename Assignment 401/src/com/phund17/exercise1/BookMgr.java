package com.phund17.exercise1;
/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Assignment 401
 */
public class BookMgr {
	private Book[] arrBook;

	public BookMgr() {
		arrBook = new Book[30];
	}

	public void addBook(String nameBook, int isbn, String author, String publisher) {
		arrBook[isbn] = new Book(nameBook, isbn, author, publisher);
	}

	public void printBook() {
		System.out.println("List Book !");
		for (int i = 0; i < arrBook.length; i++) {
			//arrHS[i].inTT();
			System.out.println(arrBook[i]);// in 1 doi tuong co MGT T7
		}
	}

}
