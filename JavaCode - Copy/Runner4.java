class MobilePhone 
{
    static String brand;
    static String operatingSystem;
    static double screenSize;

    String model;
    double price;

  
    static 
    {
        brand = "Oneplus";
        operatingSystem = "Android";
        screenSize = 6.5;
    }

    
    public MobilePhone(String model, double price) 
    {
        this.model = model;
        this.price = price;
    }
}

class Pencil 
{
    static String type;
    static String material;
    static String color;

    String brand;
    double length;

   
    static 
    {
        type = "Apsara";
        material = "Wood";
        color = "Silver";
    }

    
    public Pencil(String brand, double length) 
    {
        this.brand = brand;
        this.length = length;
    }
}


class Photo 
{
    static String resolution;
    static String format;
    static double size;

    String photographer;
    String location;

    
    static 
    {
        resolution = "1920x1080";
        format = "JPEG";
        size = 2.5; 
    }

    
    public Photo(String photographer, String location) 
    {
        this.photographer = photographer;
        this.location = location;
    }
}

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

public class Runner4 {
    public static void main(String[] args) {
       
        MobilePhone phone1 = new MobilePhone("Galaxy S21", 799.99);
        System.out.println("MobilePhone -> Brand: " + MobilePhone.brand + ", OS: " + MobilePhone.operatingSystem +
                ", Screen Size: " + MobilePhone.screenSize + ", Model: " + phone1.model + ", Price: " + phone1.price);

        
        Pencil pencil1 = new Pencil("Faber-Castell", 7.5);
        System.out.println("Pencil -> Type: " + Pencil.type + ", Material: " + Pencil.material + ", Color: " +
                Pencil.color + ", Brand: " + pencil1.brand + ", Length: " + pencil1.length);

       
        Photo photo1 = new Photo("John Doe", "New York");
        System.out.println("Photo -> Resolution: " + Photo.resolution + ", Format: " + Photo.format + ", Size: " +
                Photo.size + "MB, Photographer: " + photo1.photographer + ", Location: " + photo1.location);

       
        Camera camera1 = new Camera("EOS 90D", 1199.99);
        System.out.println("Camera -> Brand: " + Camera.brand + ", Type: " + Camera.type + ", Megapixels: " +
                Camera.megapixels + ", Model: " + camera1.model + ", Price: " + camera1.price);
    }
}
