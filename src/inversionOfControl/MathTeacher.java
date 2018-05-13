package inversionOfControl;

public class MathTeacher implements ITeacher {
    private String name;
    private TeacherBook notes;

    @Override
    public String getNote() {
        return notes.getNote();
    }

    @Override
    public String getHomeWork() {
        return "Do some logarithms & integrals";
    }

    public void setNotes(TeacherBook notes) {
        this.notes = notes;
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
