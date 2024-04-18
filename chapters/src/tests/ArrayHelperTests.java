package tests;

import helpers.ArrayHelper;

public class ArrayHelperTests {

    public static void main(String[] args) {
        System.out.println("****Unit Tests For ArrayHelpers.java****\n");
        testSum();
    }

    public static void testSum() {
        // set-up
        int[] testData = {1, 3, 5, 9, 10568};
        int expected = 10586;

        // run the actual method
        int actual = ArrayHelper.sum(testData);

        // assertion
        if (expected == actual) {
            System.out.print(".");
        } else {
            System.out.print("F");
        }
    }
}
