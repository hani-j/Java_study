package week3.subject4.ex2;

public class Customer {

    private int id;
    protected String customerName;
    protected String membership = "SILVER";
    int bonusPoint;

    public Customer(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public int calcPrice(int price){
        bonusPoint += price*0.01;
        return price;
    }

    public String showCustomerInfo(){
        return customerName+"의 등급은 "+membership+"이며, 보너스 포인트는 " +bonusPoint+"입니다";
    }
}
