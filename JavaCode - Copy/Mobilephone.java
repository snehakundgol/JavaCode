class MobilePhone 
{
    static String brand;
    static String operatingSystem;
    static double screenSize;

    String model;
    double price;

  
    static 
    {
        brand = "Samsung";
        operatingSystem = "Android";
        screenSize = 6.5;
    }

    
    public MobilePhone(String model, double price) 
    {
        this.model = model;
        this.price = price;
    }
}