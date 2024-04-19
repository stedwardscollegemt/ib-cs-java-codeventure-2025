package chapter05.calculator;

/**
 * Authors: Joe and Luca
 */
public class UtilityPriceCalculations {
    
    public static double calc10Mins(double kwPerHour, double pricePerKwHr) {
        // todo: the logic of this function
        double kwPer10Minutes = Double.valueOf(kwPerHour) / 6;
        double pricePerKw10Minutes = pricePerKwHr / 6;
        double price = pricePerKw10Minutes / kwPer10Minutes;
        return price;
    }

    public static double calcPerDay(double kwPerHour, int hoursPerDay, double pricePerKwHr) {
        
        // todo: the logic of this function
        double pricePerDay = pricePerKwHr * hoursPerDay;
        return pricePerDay; 
    }
    
    public static double calcPerMonth(double kwPerHour, int hoursPerDay, double pricePerKwHr) {
        
        double pricePerDay = calcPerDay(kwPerHour, hoursPerDay, pricePerKwHr);
        double pricePerMonth = pricePerDay * 30;
        return pricePerMonth;
    }
    
    public static double calcPerYear(double kwPerHour, int hoursPerDay, double pricePerKwHr) {
        
        double pricePerMonth = calcPerMonth(kwPerHour, hoursPerDay, pricePerKwHr);
        double PricePerYear = pricePerMonth * 12;
        return PricePerYear;
    }
}
