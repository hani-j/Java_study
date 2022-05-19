package week3.subject4_withmate.sub03;

public class Customer {
    protected int id;
    protected String name;
    protected String grade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.grade = "SILVER";
        this.bonusRatio = 0.01;
    }

    public String showCustomerInfo() {
        return  (this.name + "님의 등급은 " + this.grade + "이며, 보너스 포인트는 " + this.bonusPoint + "입니다.");
    }

    public int calcPrice(int price) {
        this.bonusPoint += (int)(price * bonusRatio);
        return price;
    }
}
