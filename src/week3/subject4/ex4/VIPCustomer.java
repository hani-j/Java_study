package week3.subject4.ex4;

public class VIPCustomer extends Customer {
    String membership = "VIP";

    public VIPCustomer(int id, String customerName) {
        super(id, customerName);
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price*0.05;
        return (int)(price*0.9);
    }

    @Override
    public String showCustomerInfo() {
        return customerName+"의 등급은 "+membership+"이며, 보너스 포인트는 " +bonusPoint+"입니다";
    }
}
