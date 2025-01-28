package com.xworkz.project_online.things;

public class Chair {

    private String material;
    private String color;
    private double weight; 
    private boolean hasArmrests;
    private double price;

    public Chair(String material, String color, double weight, boolean hasArmrests, double price) 
    {
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.hasArmrests = hasArmrests;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasArmrests() {
        return hasArmrests;
    }

    public void setHasArmrests(boolean hasArmrests) {
        this.hasArmrests = hasArmrests;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chair {" +
                "Material='" + material + '\'' +
                ", Color='" + color + '\'' +
                ", Weight=" + weight + " kg" +
                ", Has Armrests=" + (hasArmrests ? "Yes" : "No") +
                ", Price=$" + price +
                '}';
    }

    
}
