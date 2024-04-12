package chapter08.hl_stacks.pancakes;

import helpers.Keyboard;

public class PancakeMain {
    public static void main(String[] args) {
        
        // todo: instansiate a PancakeStack

        // todo: ask the user how many pancakes they want, must be between 2 and 5

        // todo: loop between 0 up to not including number, and push

        // todo: confirm to user that pancake stack is ready to eat

        // ask the user if they now want to eat the pancake
        char response = 'y';
        do {
            System.out.println("Do you want to eat? (y/n)");
            response = Keyboard.readChar();
    
            if (response == 'y') {
                System.out.println("Here, have a pancake!");
                // todo: write code to pop a pancake
                // todo: write code to eat pancake
            }
        } while (response == 'y' /** todo: and stack is not empty */);
        
        // end the program with a message
        System.out.println("I really hope you enjoyed your pancakes! Come again soon.");
    }
}
