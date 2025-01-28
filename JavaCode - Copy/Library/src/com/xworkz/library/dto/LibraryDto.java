package com.xworkz.library.dto;

import java.util.Objects;

public class LibraryDto {
	
	private String bookName;
    private String authorName;
    private String publicationDate;
    private String isbn;
    private String libraryName;
    private String address;
    private String librarianName;
    private String contactNumber;
	public LibraryDto(String bookName, String authorName, String publicationDate, String isbn, String libraryName,
			String address, String librarianName, String contactNumber) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publicationDate = publicationDate;
		this.isbn = isbn;
		this.libraryName = libraryName;
		this.address = address;
		this.librarianName = librarianName;
		this.contactNumber = contactNumber;
	}
	public LibraryDto() {
		
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLibrarianName() {
		return librarianName;
	}
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, authorName, bookName, contactNumber, isbn, librarianName, libraryName,
				publicationDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibraryDto other = (LibraryDto) obj;
		return Objects.equals(address, other.address) && Objects.equals(authorName, other.authorName)
				&& Objects.equals(bookName, other.bookName) && Objects.equals(contactNumber, other.contactNumber)
				&& Objects.equals(isbn, other.isbn) && Objects.equals(librarianName, other.librarianName)
				&& Objects.equals(libraryName, other.libraryName)
				&& Objects.equals(publicationDate, other.publicationDate);
	}
	@Override
	public String toString() {
		return "LibraryDto [bookName=" + bookName + ", authorName=" + authorName + ", publicationDate="
				+ publicationDate + ", isbn=" + isbn + ", libraryName=" + libraryName + ", address=" + address
				+ ", librarianName=" + librarianName + ", contactNumber=" + contactNumber + "]";
	}
}
