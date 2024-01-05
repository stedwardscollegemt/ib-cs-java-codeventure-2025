package chapter07.lucas_shop;

import java.util.Scanner;

public class LucasShop {
    public static void main(String[] args) {
        // creating a Scanner object to accept user input
        Scanner input = new Scanner(System.in);

        // create an array to store 9 products
        // here we are telling Java to reserve 9 contiguous memory locations
        // to access any one of these locations we need to use "products"
        Product[] products = new Product[9];

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
        products[0] = new Product();
        products[0].name = "Couch";
        products[0].price = 1500.00;
        products[0].description = "Comfy couch comes caring cooly.";
        products[0].errorMessage = "Couches can't come carelessly.";
        System.out.print("1. "); products[0].displayProduct();

        // todo: for the rest of the products (1 - 8)

        while (balance > 0) {  
            System.out.println("Balance = $" + balance);
            System.out.println("Please choose an number, or type 10 to leave");
            int number = input.nextInt();

            switch(number) {
                case 1: {
                    // to access a value in an array we use [ ] and specify the position/index
                    if (balance >= products[0].price    ) {
                        System.out.println(products[0].description);
                        balance = balance - products[0].price;
                        products[0].qty = products[0].qty + 1;
                        totalSpent = totalSpent + products[0].price;
                    } else System.out.println(products[0].errorMessage);
                    break;
                }
                // todo: rest of the cases (2 - 9)
                case 10: {
                    balance = 0;
                }
            }
        }

        // display the receipt
        System.out.println("Thank you for buying at Luca's shop!");
        System.out.println("Here's your  receipt:");
        products[0].displayReceiptLine();
        // todo: rest of the products (1 - 8)
        System.out.println("======================================");
        System.out.println("Total: $" + totalSpent);

        // close resources
        input.close();
    }
}
