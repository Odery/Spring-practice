package annotationConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlConfig.ITeacher;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        ITeacher teacher = context.getBean("javaTeacher", ITeacher.class);

        System.out.println(teacher.getName());
    }

}
