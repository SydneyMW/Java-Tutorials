public class HumanMain {
    public static void main(String[] args) {
        Employee unknown = new Employee();
        Employee lu = new Employee("Lu");
        Student syd = new Student("Syd");
        Student student = new Student();
        unknown.goToWork();
        syd.goToWork();
        lu.goToWork();
        unknown.goToWork();
        student.goToWork();
        syd.goToWork();
    }
}
