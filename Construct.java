public class Construct {
    // Class attribute(s)
    int x;
    String Name;

    // Class constructor
    public Construct() {
        x = 5;
    }
    // Alternative class constructor with single parameter
    public Construct(int y) {
        x = y;
    }
    // Alternative class constructor with two parameters
    public Construct(int y, String name) {
        Name = name;
    }

    public static void main(String[] args) {
        Construct defaultConstruct = new Construct();
        System.out.println("Default construct's x equals: " + defaultConstruct.x);
        Construct customConstruct = new Construct(12);
        System.out.println("Custom construct's x equals: " + customConstruct.x);
        Construct customConstruct2 = new Construct(24, "Lu");
        System.out.println("Custom construct's x equals: " + customConstruct2.x + " and name is: " + customConstruct2.Name);
    }
}
