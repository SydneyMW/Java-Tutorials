public class Main {
    // Static method: can be accessed without creating an object of the class
    static void myStaticMethod() {
        System.out.println("Static method accessed without an object instance");
    }
    // Public method: can only be accessed by an object of the class
    public void myPublicMethod() {
        System.out.println("Public method accessed from an instance of an object");
    }
    // Main method
    public static void main(String[] args) {
        // Call static method
        myStaticMethod();
        // Create object
        Main myObj = new Main();
        // Call public method from object
        myObj.myPublicMethod();
    }
}
