package inversionOfControl;

public class MathTeacher implements ITeacher {
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
}
