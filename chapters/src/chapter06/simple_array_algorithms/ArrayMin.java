package chapter06.simple_array_algorithms;

import java.util.Scanner;

/**
 * An adaptation of the linear search.
*/
public class ArrayMin {
    
    public static void main(String[] args) {

        // display title + introduction
        System.out.println("*** Array Minimum Search ***");

        // created a fixed array of integers
        int[] myNumbers = {10, 14, 19, 26, 27, 31, 33, 35, 42, 44};

        // display we have a secret array of numbers, type a number, and we tell you
        System.out.println("We have a secret array of numbers, try and guess the smallest number");

        // grab a number as user input
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        int index = 0;

        int smallest = myNumbers[0];
        
        // sequentially visit each element and compare it to a targetmy
        while(index <= 9) {
            // stop search if the target is equal to visited element
            if (myNumbers[index] < smallest) {
                smallest = myNumbers[index];
            }
            index = index + 1;
        }

        if (guess == smallest) {
            System.out.println("Oh wow! You have guessed the smallest number!");
        } else {
            System.out.println("Oh no, you did not guess the smallest number. It was: " + smallest);
        }

        // close resources
        input.close();
    }
}
