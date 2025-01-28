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