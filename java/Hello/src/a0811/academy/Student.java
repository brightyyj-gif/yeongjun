package a0811.academy;

public class Student {

    private String name;
    private String course;
    private String phone;
    private int grade;
    private boolean enrolled;

    public Student() {
    }

    public Student(String name, String course, String phone, int grade) {
        this.name = name;
        this.course = course;
        this.phone = phone;
        this.grade = grade;
        this.enrolled = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public void enroll() {
        this.enrolled = true;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 과목=" + course + ", 연락처=" + phone + ", 점수=" + grade
                + (enrolled ? "수강중" : "미수강");
    }
}
