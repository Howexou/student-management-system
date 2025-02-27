class UndergraduateStudent extends Student {
    private String undergraduate;

    public UndergraduateStudent(String name, String studentID, int age, String undergraduate) {
        super(name, studentID, age);
        this.undergraduate = undergraduate;
    }

    public String getUndergraduate() {
        return undergraduate;
    }

    public void setUndergraduate(String undergraduate) {
        this.undergraduate = undergraduate;
    }

    @Override
    public double getAverageGrade() {
        double sum = 0;
        for (double grade : getGrades()) {
            sum += grade;
        }
        return sum / getGrades().size();
    }
}