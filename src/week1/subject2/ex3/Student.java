package week1.subject2.ex3;

class Subject {
    String subject;
    int score;

    public Subject(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }
}

public class Student {
    int studentID;
    String studentName;
    Subject korean;
    Subject math;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void setKorean(String subject, int score) {
        korean = new Subject(subject, score);
    }

    public void setMath(String subject, int score) {
        math = new Subject(subject, score);
    }

    public void showStudentInfo() {
        System.out.println("학생 " + studentName + "의 총점은 " +(korean.score + math.score) + "입니다.");
    }
}
