package chapter06.simple_array_algorithms;

import java.util.Scanner;

public class ArrayLinearSearch {

    public static void main(String[] args) {

        // created a fixed array of integers
        int[] myNumbers = {10, 14, 19, 26, 27, 31, 33, 35, 42, 44};

        // display we have a secret array of numbers, type a number, and we tell you
        System.out.println("We have a secret array of number, try and guess a number");

        // todo: Grab a number as user input
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        int index = 0;

        // sequentially visit each element and compare it to a targetmy
        while(index <= 9) {
            // stop search if the target is equal to visited element
            if (myNumbers[index] == guess) {
                System.out.println("Oh wow, you guessed one of the numbers!");
                input.close();
                return;
            }
            index = index + 1;
        }

        System.out.println("Oh no, you did not guess a number. Sorry!");

        // close resources
        input.close();
    } 
}
