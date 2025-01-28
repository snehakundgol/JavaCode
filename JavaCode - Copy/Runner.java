// Define the Runner class
public class Runner {
    public static void main(String[] args) {
        // Create objects of ClassOne
        Bottle obj1 = new Bottle("FirstObject", 10);

        // Create objects of ClassTwo
        Train obj2 = new Train("CarModel", 25000.50);

        // Create objects of ClassThree
        Task obj3 = new Task("This is a test", true);

        // Print the objects
        System.out.println("Bottle - Name: " + obj1.getName() + ", Value: " + obj1.getValue());
        System.out.println("Train - Model: " + obj2.getModel() + ", Price: " + obj2.getPrice());
        System.out.println("Task - Description: " + obj3.getDescription() + ", Is Enabled: " + obj3.isEnabled());
    }
}