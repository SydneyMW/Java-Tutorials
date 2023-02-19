public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        computerScienceStudent csStudent = new computerScienceStudent();
        economicsStudent econStudent = new economicsStudent();
        student.doHomework();
        csStudent.doHomework();
        econStudent.doHomework();
    }
}
