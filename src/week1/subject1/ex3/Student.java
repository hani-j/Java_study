package week1.subject1.ex3;

public class Student {
    int id;
    String name;
    int grade;

    public Student() {
    }

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("학번 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade + "학년");
    }
}

