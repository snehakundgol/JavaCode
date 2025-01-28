package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Book;

public class BookRunner 
{
		public static void main(String[] args) 
		{
		Book book = new Book("JAVA", 12, "Black", "Herbert Schildt", 999);
 		System.out.println(book);

		}
}