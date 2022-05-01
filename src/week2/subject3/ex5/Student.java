package week2.subject3.ex5;

import java.util.ArrayList;

public class Student {
    int num;
    int total = 0;
    int studentID;
    String studentName;
    ArrayList<Subject> subject = new ArrayList<>();

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void addSubject(String subjectName, int subjectScore) {
       subject.add(new Subject(subjectName, subjectScore));
    }

    public void showStudentInfo() {
        for (Subject i : subject) {
            System.out.println("학생 " + studentName + "의 " + i.subjectName
                    + " 과목 성적은 " + i.subjectScore + "입니다.");
            total += i.subjectScore;
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }
}
