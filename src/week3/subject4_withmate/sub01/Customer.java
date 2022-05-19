package week3.subject4_withmate.sub01;

public class Customer {
    protected int id;
    protected String name;
    protected String grade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.grade = "SILVER";
        this.bonusRatio = 0.01;
    }

    public String showCustomerInfo() {
        return  (this.name + "님의 등급은 " + this.grade + "이며, 보너스 포인트는 " + this.bonusPoint + "입니다.");
    }

    public int calcPrice(int price) {
        this.bonusPoint += (int)(price * bonusRatio);
        return price;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
