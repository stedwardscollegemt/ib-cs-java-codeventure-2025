package chapter03;

import java.util.Scanner;

/**
 * Luca is offering the user a very strange vending machine.
 * @author Luca Lanfranco
 * 
 * Ms. C made a code review. Look at the TODOs. Do you agree with her suggestions?
 */
public class LucasVendingMachine {

  public static void main(String[] args) {

    // TODO: Really cool ASCII art title
    // https://ascii.today/

    // TODO: Format the menu nicely, with a price list
    System.out.println("Here is our menu:");
    System.out.println("1: Chips --------------------- 3.50");
    System.out.println("2: Coke ---------------------- 2.60");
    System.out.println("3: Canned Air ---------------- 1.23");
    System.out.println("4: Toasted Salmon ------------ 9.50");
    System.out.println("5: Electrified Beef ---------- 9.50");
    System.out.println("6: My Hopes n Dreams --------- 9.57");
    System.out.println("7: Undercooked Chicken ------- 4.50");
    System.out.println("8: A Harsh Truth ------------- FREE");
    System.out.println("9: Gum ----------------------- 0.75");
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please choose your snack :D");
    int number = input.nextInt();

    // The user must agree to make the purchase by confirming the right amount
    System.out.println("Please confirm your purchase by typing in the amount you will pay");
    double price = input.nextDouble();

    // Declare a variable for change
    double change = 0;

    switch(number) {
      case 1:
        if (price >= 3.50) {
          // calculate change
          change = price - 3.50;
          System.out.println("Enjoy your extra crunch chips :D");
          if (change > 0) {
            System.out.println("Here is your change: " + change);
          }
        } else {
          System.out.println("Here is a single chip for you. Get out!");
        }
        break;
      case 2:
        if (price >= 2.60) {
          System.out.println("Enjoy the fizzy feeling :D");
        } else {
          System.out.println("Fine, here is your Pepsi.");
        }
        break;
      case 3:
        if (price >= 1.23) {
          System.out.println("Tastes like... air.");
        } else {
          System.out.println("Go and suffocate.");
        }
        break;
      case 4:
        System.out.println("Something smells.... Fishy");
        break;
      case 5:
        // TODO: Ask the user to rate the shock from 1 to 5 
        System.out.println("Its flavour will shock you");
        break;
      case 6:
        System.out.println("Unfortunatley, they're shattered");
        break;
      case 7:
        // TODO: Fix food and safety violation
        System.out.println("Tastes like salmon, by that I mean salmonella");
        break;
      case 8:
        // TODO: Serve in separate statements: "The crushing realisation that well never be able to live our lives to the fullest, as we are chained to our self imposed obligations from society, only to eventually die and be raplaced"
        // TODO: Ask the user if they need therapy
        System.out.println("You need therapy");
        break;
      case 9:
        System.out.println("Yummy yummy in my gummy");
        break;
      default: 
          System.out.println("Thats not on the menu silly");
    }
    input.close();
  }
}