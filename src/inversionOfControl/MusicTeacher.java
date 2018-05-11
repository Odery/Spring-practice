package inversionOfControl;

public class MusicTeacher implements ITeacher {
    private TeacherBook notes;

    public MusicTeacher(TeacherBook notes) {
        this.notes = notes;
    }

    @Override
    public String getNote() {
        return notes.getNote() + " and more often!";
    }

    @Override
    public String getHomeWork() {
        return "Play Mozart son!";
    }
}
