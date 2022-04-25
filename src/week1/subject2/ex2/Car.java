package week1.subject2.ex2;

class CarNum {
    int num;

    public CarNum(int num) {
        this.num = num;
    }

    public CarNum onlyManage(int num) {
        this.num = num;
        return this;
    }
}

public class Car {
    String color;
    String gear;
    int door;
    private int id = 1234;
    private CarNum cn = new CarNum(1);

    public Car(String gear, int door) {
        this.gear = gear;
        this.door = door;
    }

    public Car(String color) {
        this("auto", 4);
        this.color = color;

    }

    public void printThis(){
        System.out.println(this);
    }

    public void setNum(int id, int num) {
        if (this.id == id)
        {
            cn.onlyManage(num);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "cn=" + cn.num +
                '}';
    }
}

// subject를 private 해놓고 get메서드를 통해 subject받아와 사용하기