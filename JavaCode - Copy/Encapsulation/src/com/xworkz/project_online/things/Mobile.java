package com.xworkz.project_online.things;

public class Mobile {
	
    private String brand;
    private String model;
    private double price;
    private int storageCapacity; 
    private int batteryCapacity; 

    public Mobile(String brand, String model, double price, int storageCapacity, int batteryCapacity) 
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storageCapacity = storageCapacity;
        this.batteryCapacity = batteryCapacity;
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

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Mobile {" +
                "Brand='" + brand + '\'' +
                ", Model='" + model + '\'' +
                ", Price=$" + price +
                ", Storage Capacity=" + storageCapacity + " GB" +
                ", Battery Capacity=" + batteryCapacity + " mAh" +
                '}';
    }

    
}
