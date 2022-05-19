package week3.subject4_withmate.sub01;

public class VIPCustomer extends Customer {

    protected String agent;
    protected double saleRatio;

    public VIPCustomer(int id, String name) {
        super(id, name);
        this.grade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }

    public int calcPrice(int price) {
        this.bonusPoint += (int)(price * bonusRatio);
        return (int)(price - (price * saleRatio));
    }
}
