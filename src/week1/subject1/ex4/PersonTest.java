package week1.subject1.ex4;

public class PersonTest {
    public static void main(String[] args) {
        Person jane = new Person("제인");

        jane.age = 30;
        jane.gender = "여성";
        jane.married = "기혼자";
        jane.child = 1;

        System.out.println(jane);
    }
}
