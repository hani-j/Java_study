package week3.subject4.ex05;

public class GoldCustomer extends Customer {
    protected double bonusRatio;
    protected double saleRatio;

    public GoldCustomer(int id, String name) {
        super(id, name);
        this.grade = "Gold";
        this.bonusRatio = 0.02;
        this.saleRatio = 0.1;
    }

    public String showCustomerInfo() {
        return  (this.name + "님의 등급은 " + this.grade + "이며, 보너스 포인트는 " + this.bonusPoint + "입니다.");
    }

    public int calcPrice(int price) {
        this.bonusPoint += (int)(price * bonusRatio);
        return (int)(price - (price * saleRatio));
    }
}
