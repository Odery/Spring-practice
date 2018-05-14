package annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import xmlConfig.ITeacher;
import xmlConfig.ITeacherBook;

@Component
public class JavaTeacher implements ITeacher {
    private ITeacherBook book;
    @Value("${teacher1.name}")
    private String name;

    @Override
    public String getNote() {
        return book.getNote();
    }

    @Autowired
    @Qualifier("javaBook")
    public void setTeacherBook(ITeacherBook book) {
        this.book = book;
    }

    @Override
    public String getHomeWork() {
        return "Learn Spring MVC next!";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}