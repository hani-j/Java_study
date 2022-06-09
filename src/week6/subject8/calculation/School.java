package week6.subject8.calculation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class School {
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Subject> subjectList = new ArrayList<>();

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    private static School instance = new School();

    private School() {
    }

    public static School getInstance(){
        if (instance == null)
            instance = new School();
        return instance;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void addSubject(Subject subject){
        subjectList.add(subject);
    }
}
