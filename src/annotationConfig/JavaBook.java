package annotationConfig;

import org.springframework.stereotype.Component;
import xmlConfig.ITeacherBook;

@Component
public class JavaBook implements ITeacherBook {
    @Override
    public String getNote() {
        return "Spring in fraction!";
    }
}
