package week3.subject4.ex05;

public class VIPCustomer extends GoldCustomer {
    protected double agentID;

    public VIPCustomer(int id, String name, int agentID) {
        super(id, name);
        this.grade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        this.agentID = agentID;
    }

    public String showCustomerInfo() {
        return  (this.name + "님의 등급은 " + this.grade + "이며, 보너스 포인트는 " + this.bonusPoint + "입니다. 담당 상담원 번호는 " + this.agentID + "입니다.");
    }

    public int calcPrice(int price) {
        this.bonusPoint += (int)(price * bonusRatio);
        return (int)(price - (price * saleRatio));
    }
}
