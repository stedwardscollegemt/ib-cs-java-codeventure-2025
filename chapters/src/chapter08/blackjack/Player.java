package chapter08.blackjack;

public class Player {
    
    // static data
    static int playerCount = 0;
    
    /**
     * -------- Data (Attributes) --------------------------
     */
    int id;

    Chip[] chips;

    String name;

    /**
     * -------- Constructor --------------------------
     */
    public Player() { }

    public Player(String nameIn) {
        playerCount = playerCount + 1;
        id = playerCount;
        name = nameIn;
    }

     /**
     * -------- Methods (Behaviour) --------------------------
     */
    public void tap() {}

    public void hold() {}

    public boolean hasChips() {
        return false;
    }
}
