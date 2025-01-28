package com.xworkz.crud_operation.things;

abstract class Business 
{
    private String businessName;
    private String ownerName;
    private String location;
    private int establishedYear;
    private double annualRevenue;

    public Business(String businessName, String ownerName, String location, int establishedYear, double annualRevenue) 
    {
        this.businessName = businessName;
        this.ownerName = ownerName;
        this.location = location;
        this.establishedYear = establishedYear;
        this.annualRevenue = annualRevenue;
    }
    
    public static void staticMethod1() {
        System.out.println("Static Method 1: Business Overview");
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2: Industry Trends");
    }

    public static void staticMethod3() {
        System.out.println("Static Method 3: Government Regulations");
    }

    public static void staticMethod4() {
        System.out.println("Static Method 4: Market Analysis");
    }

    public void instanceMethod1() {
        System.out.println("Instance Method 1: Business Operations");
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2: Financial Planning");
    }

    public void instanceMethod3() {
        System.out.println("Instance Method 3: Employee Management");
    }

    public void instanceMethod4() {
        System.out.println("Instance Method 4: Marketing Strategies");
    }

    public abstract void abstractMethod1(); 
    public abstract void abstractMethod2(); 
    public abstract void abstractMethod3(); 
    public abstract void abstractMethod4();
    
    public void displayBusinessDetails() 
    {
        System.out.println("Business Name: " + businessName);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Location: " + location);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Annual Revenue: $" + annualRevenue);
    }
}
