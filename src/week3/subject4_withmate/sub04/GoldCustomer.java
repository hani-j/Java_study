package week3.subject4_withmate.sub04;

public class GoldCustomer extends Customer {

    protected double saleRatio;

    public GoldCustomer(int id, String name) {
        super(id, name);
        this.grade = "GOLD";
        this.bonusRatio = 0.02;
        this.saleRatio = 0.1;
    }

    @Override
    public String showCustomerInfo() {
        return  super.showCustomerInfo();
    }

    public int calcPrice(int price) {
        this.bonusPoint += (int)(price * bonusRatio);
        return (int)(price - (price * saleRatio));
    }
}
