package week1.subject2.ex2;

public class ThisTest {
    public static void main(String[] args) {
        Car car1 = new Car("blue");

        System.out.println(car1);

        car1.setNum(1234, 2);
        System.out.println(car1);
    }
}
