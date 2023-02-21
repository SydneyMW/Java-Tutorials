class QuickStart {
    public static void main (String[] args) {
        // Printing
        System.out.println("This will print with newline");
        System.out.print("This will print without newline");
        System.out.print("...So this ends up concatenated");
        System.out.print("\nWe can print numbers like 12+4 = ");
        System.out.println(12+4);
        // Declaring Variables
        String myString = "Name";
        char myChar = 's';
        boolean myBool = true;
        int x, y, z;
        char ascii = 65;
        x = y = z = 50;
        int myInt = 12;
        float myFloat = 12.f;

        // Type Casting Variables
        double myDouble = myInt;
        int myIntCast = (int) myDouble;
        System.out.println("Basic type definitions:");
        System.out.println("...Print String \"String\": " + myString);
        System.out.println("...Print char 's': " + myChar);
        System.out.println("...Print ascii char using number 65: " + ascii);
        System.out.println("...Print boolean true: " + myBool);
        System.out.println("...Print int 12: " + myInt);
        System.out.println("...Print float 12.0: " + myFloat);
        System.out.println("Multiple definitions at once:");
        System.out.println("...Mutliple ints x, y, z declared: "+x+", "+y+", "+z);
        System.out.println("Type Casting");
        System.out.println("...Wide cast double from int: " + myDouble);
        System.out.println("...Narrow cast int from double: " + myIntCast);
        System.out.println("Wide casting goes small to large: byte -> short -> char -> int -> long -> float -> double");
        System.out.println("Narrow casting goes large to small: double -> float -> long -> int -> char -> short -> byte");
        
        // Math Functions
        int a = Math.max(5,10);
        int b = Math.min(5,10);
        double c = Math.sqrt(64);
        double abs = Math.abs(-4.7);
        double rand = Math.random();
        int rand100 = (int)(Math.random() * 101);
        System.out.println("Math.max(5,10): " + a + " and Math.min(5,10): " + b);
        System.out.println("Math.sqrt(64): " + c);
        System.out.println("Math.abs(-4.7): "+abs);
        System.out.println("Math.random(): " + rand);
        System.out.println("(int)(Math.random() * 101): " + rand100);

        // If Else Statements
        x = 20;
        System.out.println("x equals " + x);
        if (x < 18) {
            System.out.println("x < 18 is true, it is daytime");
        } else {
            System.out.println("x < 18 is NOT true, it is evening");
        }

        // If Else Shorthand
        int time = 20;
        String result = (time < 18)? "Good day." : "Good evening.";
        System.out.println(result);

        // If Else If Else Statements
        x = 20;
        System.out.println("x equals " + x);
        if (x < 10) {
            System.out.println("x < 10");
        } else if (x < 25) {
            System.out.println("10 <= x < 25");
        } else {
            System.out.println("x >= 25");
        }

        // Switch Statements
        int weekday = 4;
        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Happy Weekend!");
        }
        
        // While Loops
        int i = 0;
        System.out.println("Print with i++ [[WHILE]] i < 5");
        while (i < 5) {
            System.out.print(i++);
        }
        System.out.println("\nNow print with ++i [[WHILE]] i < 5");
        i = 0;
        while (i < 5) {
            System.out.print(++i);
        }

        // Do While Loops (execute the block once before checking condition for repeats)
        i = 0;
        System.out.println("\nNow [[DO]] print with i++ [[WHILE]] i < 5");
        do {
            System.out.print(i++);
        }
        while (i < 5);

        // For Loops
        System.out.println("\nNow print [[FOR]] j in 0 to 5");
        for (int j = 0; j < 5; j++) {
            System.out.print(j);
        }
        System.out.println("\nNow print [[FOR]] j+2 in 0 to 10");
        for (int j = 0; j <= 10; j = j + 2) {
            System.out.print(j);
        }
        
        // For Each Loops
        System.out.println("\nNow use for each loop to print car elements");
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        for (String car : cars) {
            System.out.println("Car: " + car);
        }

        // Break in Loop (skips rest of loop)
        System.out.println("Now use break in i = 4 of loop for i in 0:10");
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
              break;
            }
            System.out.print(j);
        }

        // Continue in Loop (skips remainder of current iteration)
        System.out.println("\nNow use continue in i = 4 of loop for i 0:10");
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
              continue;
            }
            System.out.print(j);
        }

        // Arrays
        String[] strArray = {"String0","String1","String2","String3","String4"};
        int[] numArray = {0,1,2,3,4};
        System.out.println("String array element 2: " + strArray[2]);
        System.out.println("Num array element 2: " + numArray[2]);
        strArray[2] = "newString";
        System.out.println("Change element 2 to be newString: " + strArray[2]);
        System.out.println("Number of strings in strArray: " + strArray.length);
        for (int j = 0; j < strArray.length; j++) {
            System.out.println(strArray[j]);
        }

        // Multidimensional Arrays
        int[][] myNums = {{1,2,3,4}, {5,6,7}};
        System.out.println("Third elem in second arr of {{1,2,3,4}, {5,6,7}}, arr[1][2]: " + myNums[1][2]);
        System.out.println("Double loop to print out elems of {{1,2,3,4}, {5,6,7}}:");
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j]);
            }
        }
    }
}