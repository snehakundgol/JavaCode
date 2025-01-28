package com.xworkz.project_online.things;

public class Laptop 
{
	private String brand;
    private String model;
    private double price;
    private int ramSize; 
    private int storageSize; 

    public Laptop(String brand, String model, double price, int ramSize, int storageSize) 
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    @Override
    public String toString() 
    {
		return "Laptop Details: \n" + "Brand: " + brand + "\n" + "Model: " + model + "\n"
				+ "Price: " + price + "\n" + "RAM Size: " + ramSize + "\n" + "Storage Size: " + storageSize;
	}
}

