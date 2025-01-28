
class Bottle {
    
    enum Color {
        RED, GREEN, BLUE
    }

    enum Size {
        SMALL, MEDIUM, LARGE
    }

    enum Shape {
        CIRCLE, SQUARE, TRIANGLE
    }

   
    private String name;
    private int value;

   
    public Bottle(String name, int value) {
        this.name = name;
        this.value = value;
    }

   
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
    }