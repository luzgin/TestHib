package reports;

public class ExamResult {

    private String firstname;
    private String subjectName;
    private int grade;

    public ExamResult(String firstname, String subjectName, int grade) {
        this.firstname = firstname;
        this.subjectName = subjectName;
        this.grade = grade;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
