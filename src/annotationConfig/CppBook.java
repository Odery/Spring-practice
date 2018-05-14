package annotationConfig;

import org.springframework.stereotype.Component;
import xmlConfig.ITeacherBook;

@Component
public class CppBook implements ITeacherBook {
    @Override
    public String getNote() {
        return "Learn MFC!!!";
    }
}
