package chapter04;

import java.util.Scanner;

/**
 * Code Anything Thursdays #2 By Luca Lanfranco
 * I decided to upgrade LucasVendingMachine from Chapter 3.
 * In my program, I invite a user to spend a specified amount of money in my shop.
 * The user is free to keep buying items until money is spent, but watch out,
 * a nasty surprise is in store if a user picks an item which is too expensive!
 */
public class LucasShop {
    public static void main(String[] args) {

        // creating a Scanner object to accept user input
        Scanner input = new Scanner(System.in);

        // variables to keep track of the products I sell
        // in my shop I am selling 9 items
        int productOnePrice = 0;
        int productOneQty = 0;
        int productTwoPrice = 0;
        int productTwoQty = 0;
        int productThreePrice = 0;
        int productThreeQty = 0;
        int productFourPrice = 0;
        int productFourQty = 0;
        int productFivePrice = 0;
        int productFiveQty = 0;
        int productSixPrice = 0;
        int productSixQty = 0;
        int productSevenPrice = 0;
        int productSevenQty = 0;
        int productEightPrice = 0;
        int productEightQty = 0;
        int productNinePrice = 0;
        int productNineQty = 0;

        // a variable to keep track of total spent
        int totalSpent = 0;

        // welcome message
        System.out.println("Welcome to my shop. You spend as much as you want... as long as you spend it!");
        // user instruction
        System.out.println("Please insert balance: \n\n");
        int balance = input.nextInt();

        // display the products and set the prices for them
        System.out.println("Have a look at our products:");
        // productOne
        System.out.println("1: Couch: $500");
        productOnePrice = 500;
        // productTwo
        System.out.println("2: Bed: $600");
        productTwoPrice = 600;
        // productThree
        System.out.println("3: Least overpriced iPhone: $10,000");
        productThreePrice = 10000;
        // productFour
        System.out.println("4: Forbidden drink (aka a lavalamp): $30");
        productFourPrice = 30;
        // productFive
        System.out.println("5: Shack in the forest: $15,000");
        productFivePrice = 15000;
        // productSix
        System.out.println("6: Paperclip: $1,000,000");
        productSixPrice = 1000000;
        // productSeven
        System.out.println("7: Luca's Can o' Beans (may cause pain, headaches, bleeding, seizures, death and severe hunger): $15");
        productSevenPrice = 15;
        // productEight
        System.out.println("8: Mysterious orb: $1");
        productEightPrice = 1;
        // productNine
        System.out.println("9: Alessandro: $10");
        productNinePrice = 10;

        // the shopping spree
        while (balance > 0) {  
            System.out.println("Balance = $" + balance);
            System.out.println("Please choose an number, or type 10 to leave");
            int number = input.nextInt();
            switch(number) {
                case 1:
                    if (balance >= productOnePrice) {
                        System.out.println("Comfy Couch Comes Caring Cooly.");
                        balance = balance - productOnePrice;
                        productOneQty = productOneQty + 1;
                        totalSpent = totalSpent + productOnePrice;
                    } else System.out.println("Couches Can't Come Carelessly.");
                    break;
                case 2:
                    if (balance >= productTwoPrice) {
                        System.out.println("Nap time!");
                        balance = balance - productTwoPrice;
                        productTwoQty = productTwoQty + 1;
                        totalSpent = totalSpent + productTwoPrice;
                    } else System.out.println("No time for nap time");
                    break;
                case 3:
                    if (balance >= productThreePrice) {
                        System.out.println("Charger sold seperately");
                        balance = balance - productThreePrice;
                        productThreeQty = productThreeQty + 1;
                        totalSpent = totalSpent + productThreePrice;
                    } else System.out.println("Get an Android instead... Peasant");
                    break;
                case 4: 
                    if (balance >= productFourPrice) {
                        System.out.println("You're not gonna drink that right?");
                        balance = balance - productFourPrice;
                        productFourQty = productFourQty + 1;
                        totalSpent = totalSpent + productFourPrice;
                    } else System.out.println("It's forbidden for a reason");
                    break;
                case 5:
                    if (balance >= productFivePrice) {
                        System.out.println("The Industrial Revolution and its consequences have been a disaster for the human race");
                        balance = balance - productFivePrice;
                        productFiveQty = productFiveQty + 1;
                        totalSpent = totalSpent + productFivePrice;
                    } else System.out.println("Damn you capitalism!");
                    break;
                case 6:
                    if (balance >= productSixPrice) {
                        System.out.println("What am i  supposed to say?");
                        balance = balance - productSixPrice;
                        productSixQty = productSixQty + 1;
                        totalSpent = totalSpent + productSixPrice;
                    } else System.out.println("Imagine being too broke to buy a paperclip XDDDD");   
                    break;
                case 7:
                    if (balance >= productSevenPrice) {
                        System.out.println("At least it's gluten free");
                        balance = balance - productSevenPrice;
                        productSevenQty = productSevenQty + 1;
                        totalSpent = totalSpent + productSevenPrice;
                    } else System.out.println("Maybe it's for the better");
                    break;
                case 8:
                    if (balance >= productEightPrice) {
                        System.out.println("ball");
                        balance = balance - productEightPrice;
                        productEightQty = productEightQty + 1;
                        totalSpent = totalSpent + productEightPrice;
                    } else System.out.println("This cant actually show up, so thanks for reading the code :)");
                    break;
                case 9:
                    if (balance >= productNinePrice) {
                        System.out.println("Spghetti flavoured");
                        balance = balance - productNinePrice;
                        productNineQty = productNineQty + 1;
                        totalSpent = totalSpent + productNinePrice;
                    } else System.out.println("Get a Joe instead");
                    break;
                case 10: 
                    balance = balance - balance;
            }
        }

        // display the receipt
        System.out.println("Thank you for buying at Luca's shop :D");
        System.out.println("Here's your  receipt:");
        System.out.println(productOneQty + "@Couches: $" + (productOnePrice * productOneQty));
        System.out.println(productTwoQty + "@Beds: $" + (productTwoPrice * productTwoQty));
        System.out.println(productThreeQty + "@iPhones: $" + (productThreePrice * productThreeQty));
        System.out.println(productFourQty + "@Lavalamps: $" + (productFourPrice * productFourQty));
        System.out.println(productFiveQty + "@Shacks: $ " + (productFivePrice * productFiveQty));
        System.out.println(productSixQty + "@Paperclips: $" + (productSixPrice * productSixQty));
        System.out.println(productSevenQty + "@Cans o' beans: $" + (productSevenPrice * productSevenQty));
        System.out.println(productEightQty + "@Orbs: $" + (productEightPrice * productEightQty));
        System.out.println(productNineQty + "@Alessandros: $" + (productNinePrice * productNineQty));
        System.out.println("======================================");
        System.out.println("Total: $" + totalSpent);

        // close resources
        input.close();
    }
}