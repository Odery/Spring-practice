package inversionOfControl;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(new MathTeacher());
        student.printHomeWork();
    }
}
