package chapter05.hlextension;

public class FibonacciSequence {

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("The Fibonacci Sequence");
        System.out.println("----------------------");
        
        int n = 7;
        int start = 0;

        while (start <= n) {
            int nthTerm = fibo(start);
            System.out.println("The " + start + "th term is " + nthTerm + ".");
            start++;
        }
    }

    public static int fibo(int n) {
        // the two base cases
        if (n == 0 || n == 1) {
            return n;
        } else {
            // recursive case
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
