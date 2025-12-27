package com.task.library;

public class LibrarySystem {

	public static void main(String[] args) {
	Book b1=new Book(1,"atomic habits",2);
	System.out.println("book details:");
	System.out.println();
	System.out.println("Book ID:"+b1.getBookId());
	System.out.println();
	System.out.println("Title: "+b1.getTitle());
	System.out.println();
	System.out.println("available copies: "+b1.getAvailableCopies());
	System.out.println();
	int i=5;
	while(i>0) {
		if(i>2) {
	        
	        	System.out.println(b1.borrowBook());
		}
		else {
			System.out.println(b1.returnBook());
		}
		i--;
	 }
		
	
	

	}

}
