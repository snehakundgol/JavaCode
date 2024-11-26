// Define enums
enum Color { RED, GREEN, BLUE, YELLOW, ORANGE }
enum Direction { NORTH, EAST, SOUTH, WEST }
enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY }
enum Status { SUCCESS, FAILURE, PENDING }
enum Level { LOW, MEDIUM, HIGH }

public class EnumExample {
    public static void main(String[] args) {
        // Declare and initialize enum variables
        Color favoriteColor = Color.BLUE;
        Direction travelDirection = Direction.EAST;
        Day today = Day.WEDNESDAY;
        Status currentStatus = Status.SUCCESS;
        Level batteryLevel = Level.MEDIUM;

        // Print the initialized values
        System.out.println("Favorite Color: " + favoriteColor);
        System.out.println("Travel Direction: " + travelDirection);
        System.out.println("Today: " + today);
        System.out.println("Current Status: " + currentStatus);
        System.out.println("Battery Level: " + batteryLevel);
    }
}
