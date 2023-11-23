package chapter04;

import helpers.Keyboard;

public class NineLives {
    
    public static void main(String[] args) {
        
        // Display a title message with an introduction
        System.out.println("Hello there, let's play: Nine Lives.");
        System.out.println("------------------------------------");
        System.out.println("Instructions:");
        System.out.println("You have nine chances to guess a secret word.");
        System.out.println("We will give you some clues, but guessing the word will not be easy.");
        System.out.println("");
        System.out.println("");

        // Declare and assign a variable to store a word of type String
        String word = "catfish";

        // Declare and assign a variable to store lives left
        int lives = 9;

        // Declare and assign a variable to store isWordGuessed
        boolean isWordGuessed = false;

        while(lives > 0 && isWordGuessed == false) {
            
            // Display a clue to the user
            System.out.println("Hint: _ _ _ _ _ _ _");

            // Guess a word or a letter
            System.out.println("Have a guess...");
            String guess = Keyboard.readString();

            // Remove a life so that eventually the while loop will come to a stop
            lives = lives - 1;
        }
        
        if (lives == 0) {
            // Tell the user they lost, and reveal the word
            System.out.println("You have lost! The secret word is: " + word);
        }

        if (isWordGuessed) {
            // Tell the user they won!
            System.out.println("Wow. You managed to guess the word. Super!");
        }
    }
}
