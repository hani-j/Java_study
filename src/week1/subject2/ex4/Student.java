package week1.subject2.ex4;

public class Student {
    String name;
    int grade;
    int cash;

    public Student(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public void takeBus(Bus bus) {
        bus.passenger += 1;
        bus.income += Bus.price;
        cash -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.passenger += 1;
        subway.income += Subway.price;
        cash -= 1200;
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + cash + "원 입니다.");
    }
}
