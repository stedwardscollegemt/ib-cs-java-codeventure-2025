package tests;

import helpers.ArrayHelper;

public class ArrayHelperTests {

    public static void main(String[] args) {
        System.out.println("****Unit Tests For ArrayHelpers.java****\n");
        testSum();
        testRandomElement();
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

    public static void testContains() {
        // set-up
        int[] testData = {1, 3, 5, 9, 10568};
        int testValue = 9;
        boolean expected = true;

        // run the actual method
        boolean actual = ArrayHelper.contains(testData, testValue);

        // assertion
        if (expected == actual) {
            System.out.print(".");
        } else {
            System.out.print("F");
        }
    }

    public static void testRandomElement() {
        // set-up
        int[] testData = {1, 3, 5, 9, 10568};
        int randomMin = 0;
        int randomMax = testData.length - 1;
        
        // run the actual method
        int randomIndex = ArrayHelper.randomElement(testData);
        int randomElement = testData[randomIndex];

        // run multiple times
        int[] actualRolls = new int[testData.length];
        for(int i = 0; i < actualRolls.length; i++) {
            actualRolls[i] = ArrayHelper.randomElement(testData);
        } 

        // assertion 1
        boolean isPass = true;
        if (randomIndex >= randomMin && randomIndex <= randomMax) {
            // do nothing
        } else {
            isPass = false;
        }

        // assertion 2
        if(randomElement == testData[randomIndex]) {
            // do nothing
        } else {
            isPass = false;
        }

        // assertion 3
        for (int i = 0; i < actualRolls.length; i++) {
            for (int j = 1; j < actualRolls.length; j++) {
                if (actualRolls[i] != actualRolls[j]) {
                    // do nothing
                } else {
                    isPass = false;
                }
            }
        }

        if (isPass == true) {
            System.out.print(".");
        } else {
            System.out.print("F");
        }
    }
}
