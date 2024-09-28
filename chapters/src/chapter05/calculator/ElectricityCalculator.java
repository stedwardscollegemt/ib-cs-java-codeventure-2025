package chapter05.calculator;

import helpers.Keyboard;

public class ElectricityCalculator {

public static void main(String[] args) {
        boolean again = true;
         // have an array of devices
        String[] devices = {"Fridge", "Dishwasher", "Television", "Freezer"};

        double kph = 0;
        int watts = 0;
        int hoursPerDay;
        double kwPerHourPrice;
        String answer;

        // the simple user interface and flow
        System.out.println("This is a Elecricity Calculator!");
        
        while (again) { // ask the user if they want to continue 

            // ask the user to select a device
            System.out.println("What device u want to check?");
            for( int i = 0; i < devices.length; i++){
                System.out.print( i + ". " + devices[i] + " | ");
            }
            answer = Keyboard.readString();

            System.out.println("Enter the watts:");
            watts = Keyboard.readInt();
            
            System.out.println("Enter the hours you use per day:");
            hoursPerDay = Keyboard.readInt();
            
            System.out.println("Enter the price for an hour");
            kwPerHourPrice = Keyboard.readDouble();
            
            if(answer.equals("Fridge")) {
                // We created an object instance of the Fridge class
                Fridge fridgeInstance = new Fridge();
                fridgeInstance.watts = watts;
                // We call all the methods for the report
                kph = fridgeInstance.calcKwPerHour();
                // Static access to methods via the UtilityPriceCalculations class
                System.out.println(UtilityPriceCalculations.calc10Mins(kph, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerDay(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerMonth(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerYear(kph, hoursPerDay, kwPerHourPrice));  
            }
            
            if(answer.equals("Dishwasher")){
                Dishwasher dishwasherInstance = new Dishwasher();
                dishwasherInstance.watts = watts;
                // We call all the methods for the report
                kph = dishwasherInstance.calcKwPerHour();
                // Static access to methods via the UtilityPriceCalculations class
                System.out.println(UtilityPriceCalculations.calc10Mins(kph, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerDay(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerMonth(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerYear(kph, hoursPerDay, kwPerHourPrice));
            }

            if(answer.equals("Television")){
                Television televisionInstance = new Television();
                // We call all the methods for the report
                televisionInstance.watts = watts;
                kph = televisionInstance.calcKwPerHour();
                // Static access to methods via the UtilityPriceCalculations class
                System.out.println(UtilityPriceCalculations.calc10Mins(kph, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerDay(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerMonth(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerYear(kph, hoursPerDay, kwPerHourPrice));
            }        
            if(answer.equals("Freezer")){
                Freezer freezerInstance = new Freezer();
                // We call all the methods for the report
                freezerInstance.watts = watts;
                kph = freezerInstance.calcKwPerHour();
                // Static access to methods via the UtilityPriceCalculations class
                System.out.println(UtilityPriceCalculations.calc10Mins(kph, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerDay(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerMonth(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(UtilityPriceCalculations.calcPerYear(kph, hoursPerDay, kwPerHourPrice));
            }
            
            System.out.println("Would you like to add another device? (yes/no)");
            answer = Keyboard.readString();   
            if(answer.equals("no")){
                again = false;
            }
        }

        System.out.println("Program ended by the user.");
    }
}
