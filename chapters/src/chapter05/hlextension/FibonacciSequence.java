package chapter05.hlextension;

public class FibonacciSequence {

    public static void main(String[] args) {
        int n = 4;

        int nthTerm = fibo(n);
        System.out.println("The " + n + "th term is " + nthTerm);
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
