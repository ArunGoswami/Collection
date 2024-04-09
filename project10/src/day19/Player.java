package day19;

public class Player {

    int playerId;
    String playerName;

    public void setPlayerData(int id, String name) {
        playerId = id;
        playerName = name;
    }

    public void getPlayerData() {
        System.out.println("Player id is " + playerId);
        System.out.println("Player name is " + playerName);
    }

    public static void main(String[] args) {
        Player rohit = new Player();
        rohit.setPlayerData(0, "Rohit Sharma");
        rohit.getPlayerData();
    }
}

