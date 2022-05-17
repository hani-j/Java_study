package week3.subject4.ex04;

public class GoldCustomer extends Customer{

    public GoldCustomer(int id, String name) {
        super(id, name);
        this.grade = "Gold";
    }

    public String showCustomerInfo() {
        return  (this.name + "님의 등급은 " + this.grade + "이며, 보너스 포인트는 " + this.bonusPoint + "입니다.");
    }

    public int calcPrice(int i) {
        this.bonusPoint += (int)(i * 0.02);
        return (int)(i * 0.9);
    }
}
