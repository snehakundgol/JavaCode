package com.xworkz.project_online.things;

public class Bottle {

    private String material;
    private String color;
    private double capacity; 
    private boolean isReusable;
    private double price;

    public Bottle(String material, String color, double capacity, boolean isReusable, double price) 
    {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.isReusable = isReusable;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isReusable() {
        return isReusable;
    }

    public void setReusable(boolean isReusable) {
        this.isReusable = isReusable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bottle {" +
                "Material='" + material + '\'' +
                ", Color='" + color + '\'' +
                ", Capacity=" + capacity + " liters" +
                ", Reusable=" + (isReusable ? "Yes" : "No") +
                ", Price=$" + price +
                '}';
    }

    
}