package chapter03;

import java.util.Scanner;

/**
 * TODO: 
 * display in pseudocode (as comments) all the steps
 * to assemble a hamburger.
 * https://ib.compscihub.net/wp-content/uploads/2018/05/Pseudo-Code-IB-1.pdf 
 */
public class AssembleHamburger {
    public static void main(String[] args) {
        
        // Make a Scanner object and store it in input
        // This helps to get a yes/no from the user
        Scanner input = new Scanner(System.in);

        // TODO: Onboarding

        // Ask the user if they want to assemble a hamburger
        System.out.println("Do you want to assemble a burger? (y/n)");
        char response = input.next().charAt(0);
    }
}
