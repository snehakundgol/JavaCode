package com.xworkz.project_online.things;

public class Book 
{
	private String bookName;
	private int noOfBooks;
	private String bookColor;
	private String authorName;
	private int bookPrice;

	public Book(String bookName, int noOfBooks, String bookColor, String authorName, int bookPrice) 
	{
		this.bookName = bookName;
		this.noOfBooks = noOfBooks;
		this.bookColor = bookColor;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}

	public String getbookName() { 
		return bookName;
	}

	public int noOfBooks() { 
		return noOfBooks;
	}

	public String bookColor() { 
		return bookColor;
	}

	public String authorName() { 
		return authorName;
	}

	public int bookPrice() { 
		return bookPrice;
	}

	
	public void setbookName(String bookName) { 
		this.bookName = bookName;
	}

	public void setnoOfBooks(int noOfBooks) { 
		this.noOfBooks = noOfBooks;
	}

	public void setbookColor(String bookColor) { 
		this.bookColor = bookColor;
	}

	public void setauthorName(String authorName) { 
		this.authorName = authorName;
	}

	public void setbookPrice(int bookPrice) { 
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book Details: \n" + "Book Name: " + bookName + "\n" + "Number Of Books: " + noOfBooks + "\n"
				+ "Book Color: " + bookColor + "\n" + "Author Name: " + authorName + "\n" + "Book Price: " + bookPrice;
	}

}
