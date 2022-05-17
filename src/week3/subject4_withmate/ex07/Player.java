package week3.subject4.ex07;

class Player {
    Playerlevel lv;

    public Player(){
        lv = new Beginner();
    }

    public void jump() {
        lv.jump();
    }

    public void run() {
        lv.run();
    }

    public void turn() {
        lv.turn();
    }

    public void play(int time) {
        lv.run();
        for (int i = 0; i < time; i++) {
            lv.jump();
        }
        lv.turn();
    }

    public void upgradeLevel() {
        this.lv = lv.upgradeLevel();
    }
}

class Playerlevel {

    protected Playerlevel(){};
    public void jump() {}
    public void run() {}
    public void turn() {}
    public void play(int time) {}
    public Playerlevel upgradeLevel() {
        return new Beginner();
    };
}

class Beginner extends Playerlevel {
    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    public Playerlevel upgradeLevel() {
        return new Advanced();
    }
}


class Advanced extends Playerlevel {
    @Override
    public void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public Playerlevel upgradeLevel() {
        return new Super();
    }
}

class Super extends Playerlevel {
    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    @Override
    public Playerlevel upgradeLevel() {
        System.out.println("최고 단계 입니다.");
        return this;
    }
}