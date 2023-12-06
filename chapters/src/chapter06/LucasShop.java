package chapter06;

import java.util.Scanner;

public class LucasShop {
    
    public static void main(String[] args) {

        // creating a Scanner object to accept user input
        Scanner input = new Scanner(System.in);

        // create an array to store 9 product prices
        // here we are telling Java to reserve 9 contiguous memory locations
        // to access any one of these locations we need to use "productPrices"
        double[] productPrices = new double[9];

        // we are using a technique called parallel arrays
        // 
        int[] productQtys = new int[9];

        // a variable to keep track of total spent
        double totalSpent = 0;

        // welcome message
        System.out.println("Welcome to my shop. You spend as much as you want... as long as you spend it!");
        // user instruction
        System.out.println("Please insert balance: \n\n");
        double balance = input.nextDouble();

        // display the products and set the prices for them
        System.out.println("Have a look at our products:");

        // product one is stored at the 0th index
        System.out.println("1: Couch: $1,500");
        productPrices[0] = 1500.00;

        // todo: for the rest of the products (1 - 8)

        while (balance > 0) {  
            System.out.println("Balance = $" + balance);
            System.out.println("Please choose an number, or type 10 to leave");
            int number = input.nextInt();

            switch(number) {
                case 1: {
                    // to access a value in an array we use [ ] and specify the position/index
                    if (balance >= productPrices[0]) {
                        System.out.println("Comfy Couch Comes Caring Cooly.");
                        balance = balance - productPrices[0];
                        productPrices[0] = productPrices[0] + 1;
                        totalSpent = totalSpent + productPrices[0];
                    } else System.out.println("Couches Can't Come Carelessly.");
                    break;
                }
            }
        }
    }
}
