package com.tts.utility;

public class Book {
	

	    String title;
	    boolean borrowed;

	    public Book() {
	    	
	    }
	    // Creates a new Book
	    public Book(String bookTitle) {
	        title = bookTitle;
	    }
	   
	    // Marks the book as rented
	    public void borrowed() {
	        // Implement this method
	    	borrowed = true;
	    }
	   
	    // Marks the book as not rented
	    public void returned() {
	        // Implement this method
	    	borrowed = false;
	    }
	   
	    // Returns true if the book is rented, false otherwise
	    public boolean isBorrowed() {
	        // Implement this method
	    	return borrowed == true? true:false;
	    }
	   
	    // Returns the title of the book
	    public String getTitle() {
	        // Implement this method
	    	return title;
	    }
	    
	    public void rented() {
	        // Implement this method
	    	borrowed = true;
	    }
	   

	   
}
