package week3.subject4.ex07_h;

public class Player {
    PlayerLevel pl;

    public Player() {
        pl = new Beginner();
    }

    public void play(int time){
        pl.play(time);
    }

    public void upgradeLevel() {
        pl =  pl.upgradeLevel();
    }


}

class PlayerLevel{

    public void jump(){}
    public void run(){}
    public void turn(){}

    public void play(int time) {
        run();
        for(int i =0; i<time; i++) {
            jump();
        }
        turn();
    }
    public PlayerLevel upgradeLevel() {
        return new Beginner();
    }

}

class Beginner extends PlayerLevel {
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }
    public void run() {
        System.out.println("천천히 달립니다.");
    }
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }
    public PlayerLevel upgradeLevel() {
        return new Advanced();
    }
}

class Advanced extends PlayerLevel {
    public void jump() {
        System.out.println("높이 jump 합니다.");
    }
    public void run() {
        System.out.println("빨리 달립니다.");
    }
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }
    public PlayerLevel upgradeLevel() {
        return new Super();
    }
}

class Super extends PlayerLevel {
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }
}

