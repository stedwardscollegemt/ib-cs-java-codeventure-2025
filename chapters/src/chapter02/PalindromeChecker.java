package chapter02;

/**
 * A program that compares two words and checks whether it reads the same backwards as forwards.
 */
public class PalindromeChecker {

    public static void main(String[] args) {
        
        // Display a title or welcome message to the user
        System.out.println("Let us do a super simple palindrome checker");
        
        // A String is an object that represents a number of character values.
        // It is the simplest object type we will learn about to store text.
        String myPalindromeExample = "wow";
        String myNotPolindromeExample = "erika";

        // Store wow in a wow variable, and wow backwards in another variable
        String wow = "wow";
        String wowBackwards = "wow";

        // Store erika in an erika variable, and erika backwards in another variable
        String erika = "erika";
        String erikaBackwards = "akire";

        // Create a boolean var isWowPalindrome
        boolean isWowPalindrome = wow.equals(wowBackwards);
        System.out.println("Is " + myPalindromeExample + " a palindrome? " + isWowPalindrome);

        // Create a boolean var isErikaPalindrome
        boolean isErikaPalindrome = erika.equals(erikaBackwards);
        System.out.println("Is " + myNotPolindromeExample + " a palindrome? " + isErikaPalindrome);
    }
}
