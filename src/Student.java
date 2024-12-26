public class Student {
    private String lastName;
    private String firstName;
    private int schoolNumber;
    private int score;

    public Student(String lastName, String firstName, int schoolNumber, int score) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.schoolNumber = schoolNumber;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }
}
