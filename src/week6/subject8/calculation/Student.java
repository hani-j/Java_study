package week6.subject8.calculation;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private int studentId;
    private String studentName;
    private Subject subject;
    private HashMap<Integer, Score> scoreList = new HashMap();

    public Student(int studentId, String studentName, Subject subject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subject = subject;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public HashMap<Integer, Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(HashMap<Integer, Score> scoreList) {
        this.scoreList = scoreList;
    }

    public void addSubjectScore(Score score) {
        scoreList.put(score.getSubject().getSubjectId(), score);
    }
}
