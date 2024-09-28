package chapter08.blackjack;

import helpers.Keyboard;

public class Main {
    
    public static void main(String[] args) {

        /**
         * Display a title
         */
        System.out.println("*** Welcome to BlackJack for THREE Players ***");
        System.out.println("**********************************************");

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name of Player " + (i+1));
            Keyboard.readString();
        }


        // unique memory reference, state, behaviour
        Player p1 = new Player();
        System.out.println(p1.playerCount);
        Player p2 = new Player();
        System.out.println(p1.playerCount);
        System.out.println(p2.playerCount);

        System.out.println(Player.playerCount);

    }
}