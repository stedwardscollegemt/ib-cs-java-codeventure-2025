package chapter05.hlextension;

public class PalindromeChecker {
    
    public static void main(String[] args) {
        
        String wordEvenLength = "abba";
        
        String wordOddLength = "aba";

        System.out.println(checkPalindrome("Erika", 0));

    }

    public static boolean checkPalindrome(String word, int pos) {

        // these are the base cases
        if (word.length() == 1 || pos == (word.length() / 2)) {
            System.out.println("[INFO] Base case 1 reached : Either the word is of length 1 or No more comparisons.");
            return true;
        }

        // this is the smallest action which we need to repeat
        char a = word.charAt(pos);
        char b = word.charAt((word.length() - 1 - pos));

        if (a != b) {
            System.out.println("[INFO] Base case 2 reached: Comparison failure.");
            return false;
        }

        // recursive case (self method call)
        System.out.println("[INFO] Recursive case for " + word + ": Reached pos " + (pos + 1));
        return checkPalindrome(word, (pos + 1));
    }
}
