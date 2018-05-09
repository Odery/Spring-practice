package inversionOfControl;

public class Student {
    private ITeacher teacher;

    //Dependency Injection (DI)
    public Student (ITeacher teacher){
        this.teacher = teacher;
    }

    public void printHomeWork(){
        System.out.println(teacher.getHomeWork());
    }
}
