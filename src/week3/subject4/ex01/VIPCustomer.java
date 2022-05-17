package week3.subject4.ex01;

public class VIPCustomer extends Customer{

    public VIPCustomer(int id, String name) {
        super(id, name);
        this.grade = "VIP";
    }

    public String showCustomerInfo() {
        return  (this.name + "님의 등급은 " + this.grade + "이며, 보너스 포인트는 " + this.bonusPoint + "입니다.");
    }
}
