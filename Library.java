package com.tts.utility;

import java.util.ArrayList;

public class Library extends Book{
	
	public Library(String Address) {
		super();
		this.Address = Address;
		// TODO Auto-generated constructor stub
	}

	String Address;
	//Book book;
	ArrayList<Book> books = new ArrayList<>();
   
	
    public void addBook(Book title) {
    	//book  = title;
    	//book.borrowed = false;
    	books.add(title);
    }
    
    
    static void printOpeningHours() {
    	System.out.println("Libraries are open daily from 9am to 5pm.");
    }
    
    
    public void printAddress() {
    	System.out.println(Address);
    }
   
    
    
    public void printAvailableBooks() {
      
      if(!books.isEmpty())
      {	  
    	  for(Book b : books){
    		  if (!b.isBorrowed()) {
    			  System.out.println(b.getTitle());
    		  }
    	  } 
      }
      else {
    	  System.out.println("No books in catalog");
      }
    	
    }
    
    
    
    public void borrowBook(String book) {
    	
    	
    	if(!books.isEmpty()) {
    		
    		for(Book b : books) {
    			if(b.title.equals(book)) {
    				if(!b.isBorrowed()) {
    					b.rented();
    					System.out.println("You successfully borrowed "+book);
    					return;
    				}
    			else
    				{
    					System.out.println("Sorry, '" + book + "' book is already borrowed.");
    					return;
    				}
    				
    			}
    			
    		}
    		System.out.println("Sorry, '" + book + "' is not in our catalog. ");
    	}
    	else {
    		System.out.println("Catalog is empty.");
    	}
    }
    
    
    
    public void returnBook(String book) {
    	
    		
    		for(Book b : books) {
    			if(b.title.equals(book)) {
    					b.returned();
    					System.out.println("You successfully returned " +book);
    				    return;
    			}	
    		}
    	
    }
    
    
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
        
        
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("Titanic");
        System.out.println();
        secondLibrary.borrowBook("The Lord of the Rings");
        
        
        secondLibrary.addBook(new Book("Le Petit Prince"));
        secondLibrary.addBook(new Book("The Da Vinci Code"));
        secondLibrary.addBook(new Book("A Tale of Two Cities"));
        
        System.out.println("Borrowing A Tale of Two Cities");
        secondLibrary.borrowBook("A Tale of Two Cities");
        secondLibrary.borrowBook("A Tale of Two Cities");
        secondLibrary.borrowBook("Titanic");
        System.out.println();
        
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
        
        System.out.println("Returning A Tale of Two Cities");
        secondLibrary.returnBook("A Tale of Two Cities");
        System.out.println();
        
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
    }
       
 }

