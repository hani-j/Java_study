package week4.subject6.ex3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buy = customer;
        buy.order();

        Sell sell = customer;
        sell.order();

        if (sell instanceof Customer){
            Customer customer2 = (Customer) sell;
            customer2.buy();
            customer2.sell();
        }
        customer.order();
    }
}
