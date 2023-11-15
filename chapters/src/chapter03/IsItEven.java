package chapter03;

import java.util.Scanner;

/**
 * A very simple program that checks whether
 * a number inputted by the user is even or odd.
 * 
 * @author Luca Lanfranco
 */
public class IsItEven {
    public static void main(String[] args) {
        
        // Make a Scanner object and store it in input
        // This helps to get a number from the user
        Scanner input = new Scanner(System.in);

        // Onboarding the user
        System.out.println("Welcome, this program checks whether your number is odd or even.");
        
        // The number typed in by the user
        // is stored as an integer
        // Display an instruction to the user
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        
        // Mod operator to get remainder
        if (number % 2 == 0) {
            // After div by 2, rem is 0, so even
            System.out.println("even");
        }
        else {
            // After div by 2, rem is 1, so odd
            System.out.println("odd");
        }

        input.close();
    }
}