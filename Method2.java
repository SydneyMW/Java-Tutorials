public class Method2 {
    // Print name String
    static void myMethod(String printName) {
        System.out.println("......myMethod received " + printName);
    }
    // Add 5 to x
    static int plusFive(int x) {
        System.out.println("......plusFive received " + x);
        return 5 + x;
    }
    // Add x and y
    static int mySum(int x, int y) {
        System.out.println("......mySum received " + x + " and " + y);
        return x + y;
    }
    // Operator overload for Int and Double addition
    static int plusMethod(int x, int y) {
        System.out.println("......plusMethod received integers " + x + " and " + y);
        return x + y;
    }
    static double plusMethod(double x, double y) {
        System.out.println("......plusMethod received doubles " + x + " and " + y);
        return x + y;
    }

    // Factorial recursive function
    static int factorial(int x) {
        if (x < 1) {  // base case x < 1
            throw new RuntimeException("Invalid integer for factorial computation");
        } else if (x == 1) {  // base case x = 1
            return x;
        } else {
            return x * factorial(x-1);
        }
    }
    public static void main(String[] args) {
        String name1 = "Sydney";
        String name2 = "Lucia";
        String name3 = "Dulce";

        System.out.println("Sending name1 to myMethod");
        myMethod(name1);
        System.out.println("Sending name2 to myMethod");
        myMethod(name2);
        System.out.println("Sending name3 to myMethod");
        myMethod(name3);

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        System.out.println("Sending num1 to plusFive");
        int num1_5 = plusFive(num1);
        System.out.println("......Received " + num1_5);
        System.out.println("Sending num2 to plusFive");
        int num2_5 = plusFive(num2);
        System.out.println("......Received " + num2_5);
        System.out.println("Sending num3 to plusFive");
        int num3_5 = plusFive(num3);
        System.out.println("......Received " + num3_5);

        System.out.println("Sending num1 and num2 to mySum");
        int sum_1_2 = mySum(num1, num2);
        System.out.println("......Received sum " + sum_1_2);

        System.out.println("Sending integers 2 and 5 to plusMethod");
        int intSum = plusMethod(2,5);
        System.out.println("......Received sum " + intSum);
        System.out.println("Sending doubles 2.4 and 5.3 to plusMethod");
        double doubleSum = plusMethod(2.4,5.3);
        System.out.println("......Received sum " + doubleSum);

        System.out.println("Sending integer 10 to factorial");
        int factPos = factorial(10);
        System.out.println("......Received answer " + factPos);
        System.out.println("Sending integer -10 to factorial");
        //int factNeg = factorial(-10);
        //System.out.println("......Received answer " + factNeg);

        
    }   
}
