package com.xworkz.library.service;

public class LibraryServiceImplementation 
{

	    public boolean validateBookName(String bookName) {
	        if (bookName == null || bookName.isEmpty()) {
	            System.out.println("Invalid Book Name: Book name cannot be empty.");
	            return false;
	        }
	        System.out.println("Valid Book Name");
	        return true;
	    }

	   
	    public boolean validateAuthorName(String authorName) {
	        if (authorName == null || authorName.isEmpty()) {
	            System.out.println("Invalid Author Name: Author name cannot be empty.");
	            return false;
	        }
	        System.out.println("Valid Author Name");
	        return true;
	    }

	    public boolean validatePublicationDate(String publicationDate) {
	        if (publicationDate == null || !publicationDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
	            System.out.println("Invalid Publication Date: Use format DD/MM/YYYY.");
	            return false;
	        }
	        System.out.println("Valid Publication Date");
	        return true;
	    }
	    
	    public boolean validateIsbn(String isbn) {
	        if (isbn == null || !isbn.matches("\\d{13}")) {
	            System.out.println("Invalid ISBN: ISBN must be a 13-digit number.");
	            return false;
	        }
	        System.out.println("Valid ISBN");
	        return true;
	    }

	 
	    public boolean validateLibraryName(String libraryName) {
	        if (libraryName == null || libraryName.isEmpty()) {
	            System.out.println("Invalid Library Name: Library name cannot be empty.");
	            return false;
	        }
	        System.out.println("Valid Library Name");
	        return true;
	    }

	    public boolean validateAddress(String address) {
	        if (address == null || address.isEmpty()) {
	            System.out.println("Invalid Address: Address cannot be empty.");
	            return false;
	        }
	        System.out.println("Valid Address");
	        return true;
	    }

	 
	    public boolean validateLibrarianName(String librarianName) {
	        if (librarianName == null || librarianName.isEmpty()) {
	            System.out.println("Invalid Librarian Name: Librarian name cannot be empty.");
	            return false;
	        }
	        System.out.println("Valid Librarian Name");
	        return true;
	    }

	    public boolean validateContactNumber(String contactNumber) {
	        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
	            System.out.println("Invalid Contact Number: It must be a 10-digit number.");
	            return false;
	        }
	        System.out.println("Valid Contact Number");
	        return true;
	    }
}


