package chapter08.blackjack;

public class Deck {

    // cards
    static String[] CARDS = { "SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK"};


    String[] shuffledCards = new String[52];

    public void changeACard(int index, String code) {
        CARDS[index] = code;
    }
}
