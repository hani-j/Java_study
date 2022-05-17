<<<<<<< HEAD
package week3.subject4.ex1;

public class Customer {

    private int id;
    protected String customerName;
    protected String membership = "SILVER";
    int bonusPoint;

    public Customer(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public String showCustomerInfo(){
        return customerName+"의 등급은 "+membership+"이며, 보너스 포인트는 " +bonusPoint+"입니다";
    }
}
=======
package week3.subject4.ex1;

public class Customer {

    private int id;
    protected String customerName;
    protected String membership = "SILVER";
    int bonusPoint;

    public Customer(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public String showCustomerInfo(){
        return customerName+"의 등급은 "+membership+"이며, 보너스 포인트는 " +bonusPoint+"입니다";
    }
}
>>>>>>> cdc1ad2d2b62ce326919794251ba36959e4a6689
