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
    System.out.println("1: Chips");
    System.out.println("2: Coke");
    System.out.println("3: Canned air"); // TODO: Consistent UI Canned Air
    System.out.println("4: Toasted Salmon");
    System.out.println("5: Electrified Beef");
    System.out.println("6: My hopes and dreams"); // TODO: My Hopes n Dreams
    System.out.println("7: Undercooked chicken");
    // TODO: Title this "A Harsh Truth"
    System.out.println("8: The crushing realisation that well never be able to live our lives to the fullest, as we are chained to our self imposed obligations from society, only to eventually die and be raplaced");
    System.out.println("9: Gum");
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please choose your snack :D");
    int number = input.nextInt();

    // TODO: The user must agree to make the purchase by confirming the right amount

    switch(number) {
      case 1:
        // TODO: if the user paid the correct amount then serve, otherwise error out
        System.out.println("Enjoy your extra crunch chips :D");
        break;
      case 2:
        System.out.println("Enjoy the fizzy feeling :D");
        break;
      case 3:
        System.out.println("Tastes like..... air");
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
  }
}