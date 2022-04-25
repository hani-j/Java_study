package week1.subject2.ex4;

import week1.subject2.ex3.Student;

public class Bus {
    int num;
    int passenger;
    int income;
    final static int price = 1000;

    public Bus(int num) {
        this.num = num;
    }

    public void showBusInfo() {
        System.out.println(num + "번 버스의 승객은 " + passenger + "명 이고, 수입은 " + income + "원 입니다.");
    }
}
