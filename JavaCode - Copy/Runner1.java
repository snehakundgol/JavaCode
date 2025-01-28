public class Runner1 {
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
