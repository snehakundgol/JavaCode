package com.xworkz.library.runner;

import com.xworkz.library.dto.LibraryDto;
import com.xworkz.library.service.LibraryServiceImplementation;

public class LibraryRunner {
	
	public static void main(String[] args) 
	{
        LibraryDto library = new LibraryDto();
        
        library.setBookName("JAVA");
        library.setAuthorName("XYZ");
        library.setPublicationDate("20/10/1988");
        library.setIsbn("9780061122415");
        library.setLibraryName("Central Library");
        library.setAddress("BTM, Banglore");
        library.setLibrarianName("BTM Library");
        library.setContactNumber("9876543210");

        System.out.println("Library details are: "+library);
    }
}


