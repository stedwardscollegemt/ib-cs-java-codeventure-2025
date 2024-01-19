package chapter05.hlextension;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("My Factorial Calculator");
        System.out.println("-----------------------");
        
        int n = 8;
        int factorial = fact(n);

        System.out.println(n + "! equates to " + factorial);
    }

    public static int fact(int n) {
        // the two base cases
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // recursive case
            return n * fact(n - 1);
        }
    }
}
