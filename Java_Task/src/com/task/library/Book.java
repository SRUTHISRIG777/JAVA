package com.task.library;

public class Book {
	private int bookId;
	private String title;
	private int availableCopies;
	public Book(int bookId,String title,int availableCopies ) {
		this.bookId=bookId;
		this.title=title;
		this.availableCopies=availableCopies;
		
	}
	public int getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	public String borrowBook() {
		System.out.println("Attempting to borrow a book...");
		  if(this.availableCopies>0) {
			  return "Book returned successfully! Updated Available Copies: "+--this.availableCopies; 
          }
		  else {
			  return "Book is not available for borrowing.";
			  
		  }
	
		
			}
	public String returnBook() {
		System.out.println("Attempting to return a book...");
		return "Book returned successfully! Updated Available Copies:"+ ++this.availableCopies;
	}

}
