package chapter03;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        // Display a title for your BMI Calculator
        System.out.println("******************************");
        System.out.println("**** BMI Calculator Intro ****");
        System.out.println("******************************");

        // Ask the user to input their personal details (height in m, weight in kg)
        Scanner input = new Scanner(System.in);

        // Enter height
        System.out.println("Please enter your height in m: ");
        double heightIn = input.nextDouble();

        // Enter weight
        System.out.println("Please enter your weight in kg: ");
        double weightIn = input.nextDouble();

        // Use the input values to calculate the BMI
        // bmi = kg / (m * m)
        double bmi = weightIn / (heightIn * heightIn);

        // if bmi < 18.5 then "Underweight" etc...
        if (bmi < 18.5) {
            System.out.println("Your BMI is: " + bmi + ", this means Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your BMI is: " + bmi + ", this means Healthy.");
        } else {
            System.out.println("Your BMI is: " + bmi + ", this means Overweight.");
        }
    }
}
