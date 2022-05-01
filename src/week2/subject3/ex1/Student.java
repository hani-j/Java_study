package week2.subject3.ex1;

public class Student {
    private static int serialNum = 1000;
    int studentID;
    String studentName;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // 클래스 이름으로 직접 호출
    public static int getSerialNum() {
        return serialNum;
    }

    public void printInfo() {
        System.out.println("학번 : " + studentID);
        System.out.println("이름 : " + studentName);
    }
}

