package chapter05.hlextension;

public class PalindromeChecker {
    
    public static void main(String[] args) {
        
        String wordEvenLength = "abba";
        
        String wordOddLength = "aba";

        System.out.println(checkPalindrome(wordOddLength, 0));
        System.out.println(checkPalindrome(wordEvenLength, 0));

        System.out.println(checkPalindrome("Erika", 0));


    }

    public static boolean checkPalindrome(String word, int pos) {

        // these are the base cases
        if (word.length() == 1 || pos == (word.length() / 2)) {
            return true;
        }

        if (word.length() % 2 == 1 && (word.length() - 1 - pos) <= word.length() / 2) {
            return true;
        }

        // this is the smallest action which we need to repeat
        char a = word.charAt(pos);
        char b = word.charAt((word.length() - 1 - pos));

        if (a != b) {
            return false;
        }

        // recursive case (self method call)
        return checkPalindrome(word, (pos + 1));
    }
}
