package week4.subject5.ex3;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    final public void go(int time){
        showLevelMessage();
        run();
        for (int i = 0; i < time; i++){
            jump();
        }
        turn();
    }
}
