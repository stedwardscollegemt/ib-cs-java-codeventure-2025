package chapter02;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Display a title or welcome message to the user
        System.out.println("Let us do a super simple palindrome checker");
        String myPalindromeExample = "wow";
        String myNotPolindromeExample = "erika";

        // Store wow in a wow variable, and wow backwards in another variable
        String wow = "wow";
        String wowBackwards = "wow";

        // Store erika in an erika variable, and erika backwards in another variable
        String erika = "erika";
        String erikaBackwards = "akire";

        // TODO: Create a boolean var isWowPalindrome
        // TODO: Create a boolean var isErikaPalindrome
        boolean isWowPalindrome = wow.equals(wowBackwards);
        System.out.println(isWowPalindrome);

    }
}
