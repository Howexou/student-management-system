

public class GraduateStudent extends Student {
    private String graduate;

    public GraduateStudent(String name, String studentID, int age, String graduate) {
        super(name, studentID, age);
        this.graduate = graduate;
    }

    public String getGraduate() {
        return graduate;
    }
    
    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }

}