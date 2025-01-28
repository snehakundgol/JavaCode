package com.xworkz.crud_operation.things;

import java.util.Objects;

public class SnacksDetails 
{	
	    private int id;
	    private String name;
	    private double price;
	    private int quantity;
	    private int noOfSnacks;
	    
	    public SnacksDetails(int id, String name, double price, int quantity, int noOfSnacks ) 
	    {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	        this.noOfSnacks = noOfSnacks;
	    }

		public SnacksDetails() {
			System.out.println("This is default constructor");
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getNoOfSnacks() {
			return noOfSnacks;
		}

		public void setNoOfSnacks(int noOfSnacks) {
			this.noOfSnacks = noOfSnacks;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, name, noOfSnacks, price, quantity);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SnacksDetails other = (SnacksDetails) obj;
			return id == other.id && Objects.equals(name, other.name) && noOfSnacks == other.noOfSnacks
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
					&& quantity == other.quantity;
		}

		@Override
		public String toString() {
			return "SnacksDetails [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
					+ ", noOfSnacks=" + noOfSnacks + "]";
		}
}
