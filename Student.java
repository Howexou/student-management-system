

class Student {

    private String name;
    private String studentID;
    private int age;
    private List<Double> grades;

    public Student(String name, String studentID, int age) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
        this.grades = new ArrayList<>();
    }
}