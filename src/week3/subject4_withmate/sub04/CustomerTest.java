package week3.subject4_withmate.sub04;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList <Customer> list = new ArrayList<Customer>();

        list.add(new Customer(10010, "이순신"));
        list.add(new Customer(10020, "신사임당"));
        list.add(new GoldCustomer(10030, "홍길동"));
        list.add(new GoldCustomer(10040, "이율곡"));
        list.add(new VIPCustomer(10050, "김유신", "12345"));

        System.out.println("====== 고객 정보 출력 ======");
        for (Customer c : list)
            System.out.println(c.showCustomerInfo());

        System.out.println("====== 할인율과 보너스 포인트 계산 ======");
        int price = 10000;
        for (Customer c : list){
            System.out.println(c.name + "님이 " + c.calcPrice(price) + "원 지불하셨습니다.");
            System.out.println(c.name + "님의 현재 보너스 포인트는 " + c.bonusPoint + "점 입니다.");
        }
    }
}