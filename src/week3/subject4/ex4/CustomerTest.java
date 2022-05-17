<<<<<<< HEAD
package week3.subject4.ex4;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

//        Customer customerLee = new Customer(10010, "이순신");
//        Customer customerShin = new Customer(10020, "신사임당");
//        GOLDCustomer customerHong = new GOLDCustomer(10030, "홍길동");
//        GOLDCustomer customerLeeY = new GOLDCustomer(10040, "이율곡");
//        VIPCustomer customerKim = new VIPCustomer(10030, "김유신");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(10010, "이순신"));
        customers.add(new Customer(10020, "신사임당"));
        customers.add(new GOLDCustomer(10030, "홍길동"));
        customers.add(new GOLDCustomer(10040, "이율곡"));
        customers.add(new VIPCustomer(10030, "김유신"));

        System.out.println("====== 고객 정보 출력 ======");
        for (Customer c : customers){
            System.out.println(c.showCustomerInfo());
        }

        System.out.println("====== 할인율과 보너스 포인트 계산 ======");
        for (Customer c : customers){
            System.out.println(c.customerName+" 님이" + c.calcPrice(10000)+"원 지불하셨습니다.");
            System.out.println(c.customerName+" 님의 현재 보너스 포인트는 "+c.bonusPoint+"점입니다.");
        }

        //System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo + "원 입니다.");
    }
}
=======
package week3.subject4.ex4;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

//        Customer customerLee = new Customer(10010, "이순신");
//        Customer customerShin = new Customer(10020, "신사임당");
//        GOLDCustomer customerHong = new GOLDCustomer(10030, "홍길동");
//        GOLDCustomer customerLeeY = new GOLDCustomer(10040, "이율곡");
//        VIPCustomer customerKim = new VIPCustomer(10030, "김유신");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(10010, "이순신"));
        customers.add(new Customer(10020, "신사임당"));
        customers.add(new GOLDCustomer(10030, "홍길동"));
        customers.add(new GOLDCustomer(10040, "이율곡"));
        customers.add(new VIPCustomer(10030, "김유신"));

        System.out.println("====== 고객 정보 출력 ======");
        for (Customer c : customers){
            System.out.println(c.showCustomerInfo());
        }

        System.out.println("====== 할인율과 보너스 포인트 계산 ======");
        for (Customer c : customers){
            System.out.println(c.customerName+" 님이" + c.calcPrice(10000)+"원 지불하셨습니다.");
            System.out.println(c.customerName+" 님의 현재 보너스 포인트는 "+c.bonusPoint+"점입니다.");
        }

        //System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo + "원 입니다.");
    }
}
>>>>>>> cdc1ad2d2b62ce326919794251ba36959e4a6689
