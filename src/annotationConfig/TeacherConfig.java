package annotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import xmlConfig.ITeacher;
import xmlConfig.ITeacherBook;

@Configuration
@PropertySource("classpath:teacher.properties")
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
        return teacher;
    }
}
