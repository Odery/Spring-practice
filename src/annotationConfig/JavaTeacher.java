package annotationConfig;

import org.springframework.stereotype.Component;
import xmlConfig.ITeacher;

@Component("javaTeacher")
public class JavaTeacher implements ITeacher {
    private String name;

    @Override
    public String getNote() {
        return "no notes!";
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
