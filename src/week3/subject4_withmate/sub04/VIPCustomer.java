package week3.subject4_withmate.sub04;

public class VIPCustomer extends Customer {

    protected String agent;
    protected double saleRatio;

    public VIPCustomer(int id, String name, String agent) {
        super(id, name);
        this.grade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        this.agent = agent;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo()+" 담당 상담원 번호는 "+this.agent+"입니다.";
    }

    public int calcPrice(int price) {
        this.bonusPoint += (int)(price * bonusRatio);
        return (int)(price - (price * saleRatio));
    }
}
