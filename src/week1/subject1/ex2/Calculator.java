package week1.subject1.ex2;

public class Calculator {
    int num1;
    int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void Sum() {
        System.out.println(num1 + num2);
    }
    public void Sub() {
        System.out.println(num1 - num2);
    }
    public void Mul() {
        System.out.println(num1 * num2);
    }
    public void Div() {
        System.out.println(num1 / num2);
    }
}
