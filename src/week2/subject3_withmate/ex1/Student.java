package week2.subject3_withmate.ex1;

public class Student {
    static int serialNum = 1000;
    String studentName;
    int studentID = 0;

    public Student() {
        studentID = ++serialNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        return serialNum;
    }
}
