package week1.subject1.ex4;

public class Person {
    String name;
    int age;
    String gender;
    String married;
    int child;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "이름은 " + name + "이고 나이는 " + age + "살 입니다.\n성별은 "
                + gender + "이며, " + married + "입니다. 자녀는 " + child + "명이 있습니다.";
    }
}
