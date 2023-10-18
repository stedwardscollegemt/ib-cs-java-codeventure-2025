package chapter02;

/**
 * The { } are "scope"
 */
public class BuildingBlocks {

    public static void main(String[] args) {

        // 2.5
        // Declare and assign a constant for NO_OF_WEEK_DAYS
        final int NO_OF_WEEK_DAYS = 7;


        // 2.2, 2.3, 2.4, 2.6
        // The following data types are also referred to as "primitive data types"

        // Declaring a variable of data type integer and assigning a value
        double appleUnitPrice = 0.55; // price in dollars
        // Display "Apple Unit Price: $<appleUnitPrice>"
        System.out.println("Apple Unit Price: $" + appleUnitPrice);

        // Declaring a variable of data type int for applyQty and assign 10 as a value
        int appleQty = 10;

        // Display "Qty: 10"
        System.out.println("Qty: " + appleQty);
        
        // Declare a variable named amountDue and assign it to appleUnitPrice * appleQty
        double amountDue = appleUnitPrice * appleQty;
        
        // Display "Amount due: $<amountDue>"
        System.out.println("Amount due: " + amountDue);

        System.out.println("------------------------------------------------------------------------------------------");

        // Declaring a variable of data type float and assigning a value
        float temperature = 2.4f;
        // TODO: Increase the temperature by 5.7 degrees celcius
        
        // Display "Temperature: <temperature> degrees celcius"
        System.out.println("Temperature: " + temperature + " degrees celcius");
        System.out.println("------------------------------------------------------------------------------------------");

        // TODO: Declaring a variable of data type double and assigning a value
        
        // TODO: Decrease the balance by 4.95 dollars
        
        // TODO: Display "Account Balance: $<balance>"
        
        System.out.println("------------------------------------------------------------------------------------------");

        // Declaring a variable of data type char and assigning a value
        char scrabbleTile = 'E';

        // Declaring a variable of data type boolean and assigning a value
        boolean isHungry = true;
    }
}