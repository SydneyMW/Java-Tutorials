// ABSTRACT CLASS
abstract class Human {
    public String name = "human";
    // abstract method; fill in inherited classes
    public abstract void goToWork();
}

// SUBCLASS
class Student extends Human {
    public int graduationYear = 2024;
    // Implement constructors
    public Student() {

    }
    public Student(String Name) {
        name = Name;
    }
    // Must implement the abstract method goToWork()
    public void goToWork() {
        System.out.println(this.name + " is headed to school");
    }
}

// SUBCLASS
class Employee extends Human {
    // Implement constructors
    public Employee() {

    }
    public Employee(String Name) {
        name = Name;
    }
    // Must implement the abstract method goToWork()
    public void goToWork () {
        System.out.println(this.name + " is headed to work");
    }
}