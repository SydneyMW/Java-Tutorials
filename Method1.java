public class Method1 {
    static void myMethod() {
        // static: method belongs to main class and is not an object of main class
        // void: method does not return any value
        System.out.println("myMethod has been called!");
    }

    public static void main(String[] args) {
        System.out.println("main has been called!");
        System.out.println("...Calling myMethod");
        myMethod();
        System.out.println("...Calling myMethod again");
        myMethod();
        System.out.println("...Calling myMethod YET AGAIN");
        myMethod();
    }
}
