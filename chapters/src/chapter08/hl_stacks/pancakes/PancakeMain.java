package chapter08.hl_stacks.pancakes;

import helpers.Keyboard;

public class PancakeMain {
    public static void main(String[] args) {
        
        // instansiate a PancakeStack
        PancakeStack myPancakeStack = new PancakeStack("Chocolate Spread");

        // ask the user how many pancakes they want, must be between 2 and 5
        System.out.println("How many pancakes do you want?");
        int numberOfPancakes = Keyboard.readInt();

        // loop between 0 up to number of pancakes, and push
        for (int i = 0; i < numberOfPancakes; i++) {
            Pancake p = new Pancake();
            myPancakeStack.push(p);
        }

        // confirm to user that pancake stack is ready to eat
        System.out.println("Your pancakes are ready.");

        // ask the user if they now want to eat the pancake
        char response = 'y';
        do {
            System.out.println("Do you want to eat? (y/n)");
            response = Keyboard.readChar();
    
            if (response == 'y') {
                System.out.println("Here, have a pancake!");
                Pancake p = myPancakeStack.pop();
                p.eat();
                System.out.println("You ate your pancake!");
            }
        } while (response == 'y' && !myPancakeStack.isEmpty());
        
        // end the program with a message
        System.out.println("I really hope you enjoyed your pancakes! Come again soon.");
    }
}
