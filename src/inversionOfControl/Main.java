package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = new Student(context.getBean("mathTeacher", ITeacher.class));
        Student student2 = new Student(context.getBean("mathTeacher", ITeacher.class));

        System.out.println(student.getTeacher() == student2.getTeacher());
        System.out.println(student.getTeacher());
        System.out.println(student2.getTeacher());
        context.close();
    }
}
