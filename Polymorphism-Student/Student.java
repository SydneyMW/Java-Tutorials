//package Polymorphism-Student;

// Parent class has default method
class Student {
    public void doHomework() {
        System.out.println("Doing homework");
    }
}

class computerScienceStudent extends Student {
    public void doHomework() {
        System.out.println("Doing programming assignments");
    }
}

class economicsStudent extends Student {
    public void doHomework() {
        System.out.println("Doing readings");
    }
}
