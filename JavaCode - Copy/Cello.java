// Class 1: MobilePhone
class MobilePhone {
    static String brand;
    static String operatingSystem;
    static double screenSize;

    String model;
    double price;

    // Static block to initialize static variables
    static {
        brand = "Samsung";
        operatingSystem = "Android";
        screenSize = 6.5;
    }

    // Constructor to initialize non-static variables
    public MobilePhone(String model, double price) {
        this.model = model;
        this.price = price;
    }
}

// Class 2: Pencil
class Pencil {
    static String type;
    static String material;
    static String color;

    String brand;
    double length;

    // Static block to initialize static variables
    static {
        type = "HB";
        material = "Wood";
        color = "Yellow";
    }

    // Constructor to initialize non-static variables
    public Pencil(String brand, double length) {
        this.brand = brand;
        this.length = length;
    }
}

// Class 3: Photo
class Photo {
    static String resolution;
    static String format;
    static double size;

    String photographer;
    String location;

    // Static block to initialize static variables
    static {
        resolution = "1920x1080";
        format = "JPEG";
        size = 2.5; // size in MB
    }

    // Constructor to initialize non-static variables
    public Photo(String photographer, String location) {
        this.photographer = photographer;
        this.location = location;
    }
}

// Class 4: Camera
class Camera {
    static String brand;
    static String type;
    static double megapixels;

    String model;
    double price;

    // Static block to initialize static variables
    static {
        brand = "Canon";
        type = "DSLR";
        megapixels = 24.1;
    }

    // Constructor to initialize non-static variables
    public Camera(String model, double price) {
        this.model = model;
        this.price = price;
    }
}

// Runner Class
public class Runner {
    public static void main(String[] args) {
        // Create objects for MobilePhone
        MobilePhone phone1 = new MobilePhone("Galaxy S21", 799.99);
        System.out.println("MobilePhone -> Brand: " + MobilePhone.brand + ", OS: " + MobilePhone.operatingSystem +
                ", Screen Size: " + MobilePhone.screenSize + ", Model: " + phone1.model + ", Price: " + phone1.price);

        // Create objects for Pencil
        Pencil pencil1 = new Pencil("Faber-Castell", 7.5);
        System.out.println("Pencil -> Type: " + Pencil.type + ", Material: " + Pencil.material + ", Color: " +
                Pencil.color + ", Brand: " + pencil1.brand + ", Length: " + pencil1.length);

        // Create objects for Photo
        Photo photo1 = new Photo("John Doe", "New York");
        System.out.println("Photo -> Resolution: " + Photo.resolution + ", Format: " + Photo.format + ", Size: " +
                Photo.size + "MB, Photographer: " + photo1.photographer + ", Location: " + photo1.location);

        // Create objects for Camera
        Camera camera1 = new Camera("EOS 90D", 1199.99);
        System.out.println("Camera -> Brand: " + Camera.brand + ", Type: " + Camera.type + ", Megapixels: " +
                Camera.megapixels + ", Model: " + camera1.model + ", Price: " + camera1.price);
    }
}
