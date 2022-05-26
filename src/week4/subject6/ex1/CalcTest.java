package week4.subject6.ex1;

public class CalcTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        Calc calc = new Calculator();
        System.out.println("a + b = "+calc.add(a, b));
        System.out.println("a - b = "+calc.substract(a, b));
        System.out.println("a * b = "+calc.times(a, b));
        System.out.println("a / b = "+calc.divide(a, b));
    }
}
