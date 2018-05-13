package inversionOfControl;

public class MusicTeacher implements ITeacher {
    private String name;
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
