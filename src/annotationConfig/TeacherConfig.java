package annotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xmlConfig.ITeacher;
import xmlConfig.ITeacherBook;

@Configuration
public class TeacherConfig {

    @Bean
    public ITeacherBook javaBook() {
        return new JavaBook();
    }

    @Bean
    public ITeacherBook cppBook() {
        return new CppBook();
    }

    @Bean
    public ITeacher javaTeacher() {
        JavaTeacher teacher = new JavaTeacher();
        teacher.setTeacherBook(javaBook());
        return teacher;
    }
}
