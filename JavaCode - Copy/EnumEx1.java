// Define the first class
class ClassOne {
    // Define the enums
    enum Color {
        RED, GREEN, BLUE
    }

    enum Size {
        SMALL, MEDIUM, LARGE
    }

    enum Shape {
        CIRCLE, SQUARE, TRIANGLE
    }

    // Define normal variables
    private String name;
    private int value;

    // Constructor
    public ClassOne(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}

// Define the second class
class ClassTwo {
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
    public ClassTwo(String model, double price) {
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

// Define the third class
class ClassThree {
    // Define the enums
    enum Status {
        ACTIVE, INACTIVE, PENDING
    }

    enum Priority {
        HIGH, MEDIUM, LOW
    }

    enum Role {
        ADMIN, USER, GUEST
    }

    // Define normal variables
    private String description;
    private boolean isEnabled;

    // Constructor
    public ClassThree(String description, boolean isEnabled) {
        this.description = description;
        this.isEnabled = isEnabled;
    }

    // Getter methods
    public String getDescription() {
        return description;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}

// Define the Runner class
public class EnumEx1 {
    public static void main(String[] args) {
        // Create objects of ClassOne
        ClassOne obj1 = new ClassOne("FirstObject", 10);

        // Create objects of ClassTwo
        ClassTwo obj2 = new ClassTwo("CarModel", 25000.50);

        // Create objects of ClassThree
        ClassThree obj3 = new ClassThree("This is a test", true);

        // Print the objects
        System.out.println("ClassOne - Name: " + obj1.getName() + ", Value: " + obj1.getValue());
        System.out.println("ClassTwo - Model: " + obj2.getModel() + ", Price: " + obj2.getPrice());
        System.out.println("ClassThree - Description: " + obj3.getDescription() + ", Is Enabled: " + obj3.isEnabled());
    }
}
