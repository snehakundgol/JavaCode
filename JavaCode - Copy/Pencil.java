class Pencil 
{
    static String type;
    static String material;
    static String color;

    String brand;
    double length;

   
    static 
    {
        type = "HB";
        material = "Wood";
        color = "Yellow";
    }

    
    public Pencil(String brand, double length) 
    {
        this.brand = brand;
        this.length = length;
    }
}
