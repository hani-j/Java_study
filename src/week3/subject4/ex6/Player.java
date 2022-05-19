package week3.subject4.ex6;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    int level;

    public void upgradeLevel(int level) {
        this.level = level;
    }
}