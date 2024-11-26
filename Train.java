// Define the second class
class Train {
    // Define the enums
    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    enum VehicleType {
        CAR, TRUCK, MOTORCYCLE
    }

    // Define normal variables
    private String model;
    private double price;

    // Constructor
    public Train(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
