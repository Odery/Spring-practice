package xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = new Student(context.getBean("mathTeacher", ITeacher.class));

        context.close();
    }
}
