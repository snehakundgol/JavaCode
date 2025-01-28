class Camera 
{
    static String brand;
    static String type;
    static double megapixels;

    String model;
    double price;

    
    static 
    {
        brand = "Canon";
        type = "DSLR";
        megapixels = 24.1;
    }

    
    public Camera(String model, double price) 
    {
        this.model = model;
        this.price = price;
    }
}