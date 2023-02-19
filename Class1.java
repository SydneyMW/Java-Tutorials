// file corresponds to class called Class1
public class Class1 {

    // for each instance of Class1, the object will have method .x which equals 5
    int x = 5;

    // file execution begins in main() function
    public static void main(String[] args) {
        
        // Construct objects in Class1, access x
        Class1 obj1 = new Class1();
        System.out.println("Object1 of Class1 has x attribute: " + obj1.x);
        Class1 obj2 = new Class1();
        System.out.println("Object2 of Class1 has x attribute: " + obj2.x);

        // Construct objects in Class2, access y
        Class2 obj3 = new Class2();
        System.out.println("Object3 of Class2 has y attribute: " + obj3.y);
        Class2 obj4 = new Class2();
        System.out.println("Object4 of Class2 has y attribute: " + obj4.y);

        // Modify attributes
        obj4.y = 12;
        System.out.println("Object4 of Class2 now has y attribute: " + obj4.y);

        // Assign attributes when not specified automatically
        Class3 obj5 = new Class3();
        System.out.println("Object5 of Class3 has no y attribute: " + obj5.y);
        obj5.y = 24;
        System.out.println("Object5 of Class3 now has y attribute: " + obj5.y);

        // Assign "final" attributes which cannot be modified (immutable)
        Class4 obj6 = new Class4();
        System.out.println("Object6 of Class4 has final x attribute: " + obj6.x);
        // obj6.x = 24; would generate an error
    }
}
