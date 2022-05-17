package week3.subject4.ex05;

public class Customer {
    protected int id;
    protected String name;
    protected String grade;
    protected int bonusPoint;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.grade = "SILVER";
    }

    public String showCustomerInfo() {
        return  (this.name + "님의 등급은 " + this.grade + "이며, 보너스 포인트는 " + this.bonusPoint + "입니다.");
    }

    public int calcPrice(int i) {
        this.bonusPoint += (int)(i * 0.01);
        return i;
    }
}
