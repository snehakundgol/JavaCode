package com.xworkz.project_online.things;


	public class Flipkart {
	   
	    private String productName;
	    private String category;
	    private double price;
	    private int quantity;
	    private double rating;

	    
	    public Flipkart(String productName, String category, double price, int quantity, double rating) {
	        this.productName = productName;
	        this.category = category;
	        this.price = price;
	        this.quantity = quantity;
	        this.rating = rating;
	    }

	    
	    @Override
	    public String toString() {
	        return "Flipkart Product Details: \n" +
	               "Product Name: " + productName + "\n" +
	               "Category: " + category + "\n" +
	               "Price: ₹" + price + "\n" +
	               "Quantity: " + quantity + "\n" +
	               "Rating: " + rating + "★";
	    }
	}

	
