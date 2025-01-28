class Person {
    // Instance variables
    private String name;
    private int age;
    private String city;
    private String country;
    private String profession;
    private double salary;

    // Constructor 1: No arguments
    public Person() {
        this("Unknown", 0, "Unknown", "Unknown", "Unknown", 0.0);
        System.out.println("Default constructor called.");
    }

    // Constructor 2: Two arguments
    public Person(String name, int age) {
        this(name, age, "Unknown", "Unknown", "Unknown", 0.0);
        System.out.println("Constructor with 2 arguments called.");
    }

    // Constructor 3: Four arguments
    public Person(String name, int age, String city, String country) {
        this(name, age, city, country, "Unknown", 0.0);
        System.out.println("Constructor with 4 arguments called.");
    }

    // Constructor 4: All arguments
    public Person(String name, int age, String city, String country, String profession, double salary) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
        this.profession = profession;
        this.salary = salary;
        System.out.println("Constructor with all arguments called.");
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Profession: " + profession);
        System.out.println("Salary: $" + salary);
    }
}

public class Runner {
    public static void main(String[] args) {
        // Create objects using different constructors
        Person person1 = new Person();
        person1.displayDetails();

        System.out.println();

        Person person2 = new Person("Alice", 25);
        person2.displayDetails();

        System.out.println();

        Person person3 = new Person("Bob", 30, "New York", "USA");
        person3.displayDetails();

        System.out.println();

        Person person4 = new Person("Charlie", 35, "London", "UK", "Engineer", 75000.00);
        person4.displayDetails();
    }
}
