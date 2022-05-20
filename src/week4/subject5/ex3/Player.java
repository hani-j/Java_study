package week4.subject5.ex3;

public class Player {
    PlayerLevel playerLevel = new BeginnerLevel();

    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
    }

    public void play(int time) {
        playerLevel.go(time);
    }
}
