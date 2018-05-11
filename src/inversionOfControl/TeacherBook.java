package inversionOfControl;

public class TeacherBook implements ITeacherBook {
    @Override
    public String getNote() {
        return "You must study harder!";
    }
}
