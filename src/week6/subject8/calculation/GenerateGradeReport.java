package week6.subject8.calculation;

import week6.subject8.calculation.evaluation.BasicEvaluation;
import week6.subject8.calculation.evaluation.MajorEvaluation;
import week6.subject8.calculation.evaluation.PassFailEvaluation;

import java.nio.charset.StandardCharsets;

public class GenerateGradeReport {
    School school = School.getInstance();
    private StringBuffer stringBuffer = new StringBuffer();

    public String getReport() {

        for (Subject subject : school.getSubjectList()){
            stringBuffer.append("-----------------------------------\n");
            stringBuffer.append(subject.getSubjectName() + " 수강생 학점\n");
            stringBuffer.append(" 이름 | 학번 |중점과목| 점수 \n");
            stringBuffer.append("-----------------------------------\n");

            for (Student student : subject.getStudentList()){
                stringBuffer.append(student.getStudentName()+" | "
                        +student.getStudentId()+" | "
                        +student.getSubject().getSubjectName()+" | "
                        +student.getScoreList().get(subject.getSubjectId()).getPoint()+":"
                        +getGrade(subject, student)+" | \n");
                stringBuffer.append("-----------------------------------\n");

            }

        }
        return stringBuffer.toString();
    }

    public String getGrade(Subject subject, Student student){
        if (subject.getSubjectId() == student.getSubject().getSubjectId()){
            MajorEvaluation majorEvaluation = new MajorEvaluation();
            return majorEvaluation.getGrade(student.getScoreList().get(subject.getSubjectId()).getPoint());
        }
        else {
            if (subject.getSubjectId() == 1003){
                PassFailEvaluation passFailEvaluation = new PassFailEvaluation();
                return passFailEvaluation.getGrade(student.getScoreList().get(subject.getSubjectId()).getPoint());
            }
            BasicEvaluation basicEvaluation = new BasicEvaluation();
            return basicEvaluation.getGrade(student.getScoreList().get(subject.getSubjectId()).getPoint());
        }
    }
}
//public class GenerateGradeReport {
//
//    School school = School.getInstance();
//    private StringBuffer stringBuffer = new StringBuffer();
//
//    public String getReport() {
//
//        for (Subject subject : school.getSubjectList()){
//            stringBuffer.append("------------------------------------------\n");
//            stringBuffer.append(subject.getSubjectName() + " 수강생 학점\n");
//            stringBuffer.append("이름   |   학번   | 중점과목 |  점수  \n");
//            stringBuffer.append("------------------------------------------\n");
//
//            for (Student student : subject.getStudentList()){
//                stringBuffer.append(student.getStudentName() +" | "+student.getStudentId() + " | "+student.getSubject().getSubjectName()
//                + " | "+student.getScoreList().get(subject.getSubjectId()).getPoint() + ":" + getGrade(subject, student) + " | \n" );
//                stringBuffer.append("------------------------------------------\n");
//            }
//        }
//        return stringBuffer.toString();
//    }
//
//    public String getGrade(Subject subject, Student student) {
//        if (student.getSubject().getSubjectId() == subject.getSubjectId()) {
//            MajorEvaluation majorEvaluation = new MajorEvaluation();
//            return majorEvaluation.getGrade(student.getScoreList().get(subject.getSubjectId()).getPoint());
//        }
//        else {
//            if (subject.getSubjectId() == 1003) {
//                PassFailEvaluation passFailEvaluation = new PassFailEvaluation();
//                return passFailEvaluation.getGrade(student.getScoreList().get(subject.getSubjectId()).getPoint());
//            }
//            BasicEvaluation basicEvaluation = new BasicEvaluation();
//            return basicEvaluation.getGrade(student.getScoreList().get(subject.getSubjectId()).getPoint());
//        }
//    }
//
//
//}
