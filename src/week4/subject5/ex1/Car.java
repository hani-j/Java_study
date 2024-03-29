package week4.subject5.ex1;

public abstract class Car {
    public void startCar(){
        System.out.println("시동을 켭니다");
    }
    public abstract void drive();
    public abstract void stop();
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    // 템플릿 메서드
    public void run(){
        startCar();
        drive();
        stop();
        turnOff();
    };
}
