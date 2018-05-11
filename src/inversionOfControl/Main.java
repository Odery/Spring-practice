package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = new Student(context.getBean("musicTeacher", ITeacher.class));

        student.printHomeWork();
        student.printTeacherNotes();

        context.close();
    }
}
