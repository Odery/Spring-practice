package annotationConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlConfig.ITeacher;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        ITeacher teacher = context.getBean("javaTeacher", ITeacher.class);
        ITeacher teacher2 = context.getBean("javaTeacher", ITeacher.class);

        System.out.println("Objects the same?: " + (teacher == teacher2));
        System.out.println("Cell in memory: " + teacher);
        System.out.println("Cell in memory: " + teacher2);
        context.close();
    }

}
