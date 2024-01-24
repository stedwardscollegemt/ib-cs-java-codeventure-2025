package chapter06.simple_array_algorithms;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        // display title + introduction
        System.out.println("******* A Simple Array Sum Program *******");
        System.out.println("------------------------------------------");
        System.out.println("Give us 10 numbers and we calc the sum.");
        System.out.println("");
        
        // declare an array of integer values called numbers
        int[] numbers = new int[10];

        // ask the user to give you numbers and put them in the array
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (index < 10) {
            System.out.println("Give us a number: ");
            numbers[index] = sc.nextInt();
            index = index + 1;
        }
        sc.close();

        // use a for loop to calculate the sum
        int sum = 0;
        for (index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index]; // recurring total
        }

        // display the sum
        System.out.println("The sum is: " + sum);
    }
}
