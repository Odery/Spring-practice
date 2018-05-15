package annotationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xmlConfig.ITeacher;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeacherConfig.class);
        ITeacher teacher = context.getBean("javaTeacher", ITeacher.class);

        System.out.println(teacher.getNote());
        System.out.println(teacher.getName());
        context.close();
    }

}
