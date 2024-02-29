package chapter05.calculator;

public class ElecricityCalculator {

    public static void main(String[] args) {
        
        // todo: have an array of devices
        String[] devices = {"Fridge", "Dishwasher", "Television", "Freezer"};
        
        // todo: the simple user interface and flow
        System.out.println("this is a Elecricity Calculator");
        boolean again = true;
        while(again){// todo: ask the user if they want to continue 
            double Watts;
            System.out.println("enter the watts");
            Watts = Keyboard.readDouble();
            
            int hoursPerDay;
            System.out.println("enter the hours u use per day");
            hoursPerDay = Keyboard.readInt();
            
            double kwPerHourPrice;
            System.out.println("enter the price for an hour");
            kwPerHourPrice = Keyboard.readDouble();
            
            // todo: ask the user to select a device
            System.out.println("what device u want to check?");
            for( int i = 0; i < devices.length; i++){
                System.out.print( i + devices[i]);
            }
            String response = Keyboard.readString();
            if(response.equals("Fridge")){
                Fridge f = new Fridge(Watts, hoursPerDay);
                // todo: we call all the methods for the report
                double kph = f.setKwPerHour();
                System.out.println(calc10Mins(kph, kwPerHourPrice));
                System.out.println(calcPerDay(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(calcPerMonth(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(calcPerYear(kph, hoursPerDay, kwPerHourPrice));
                
            }
            if(response.equals("Dishwasher")){
                Dishwasher d = new Dishwasher(Watts, hoursPerDay);
                // todo: we call all the methods for the report
                double kph = d.setKwPerHour();
                System.out.println(calc10Mins(kph, kwPerHourPrice));
                System.out.println(calcPerDay(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(calcPerMonth(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(calcPerYear(kph, hoursPerDay, kwPerHourPrice));
            }        
            if(response.equals("Television")){
                Television t = new Television(Watts, hoursPerDay);
                // todo: we call all the methods for the report
                double kph = t.setKwPerHour();
                System.out.println(calc10Mins(kph, kwPerHourPrice));
                System.out.println(calcPerDay(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(calcPerMonth(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(calcPerYear(kph, hoursPerDay, kwPerHourPrice));
            }        
            if(response.equals("Freezer")){
                Freezer fr = new Freezer(Watts, hoursPerDay);
                // todo: we call all the methods for the report
                double kph = fr.setKwPerHour();
                System.out.println(calc10Mins(kph, kwPerHourPrice));
                System.out.println(calcPerDay(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(calcPerMonth(kph, hoursPerDay, kwPerHourPrice));
                System.out.println(calcPerYear(kph, hoursPerDay, kwPerHourPrice));
            }
            System.out.println("Again?");
            String answer = Keyboard.readString();
            if(answer.equals("no")){
                again = false;
            }
        }
    }
}
