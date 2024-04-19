package chapter05.calculator;

/**
 * Authors: Aleks and Ivan
 */
public class Dishwasher {
    
    // variables with preset values
    int watts;
    
    int hoursPerDay;
    
    double kwPerHour;
    
    public double calcKwPerHour() {
        kwPerHour = (watts / 1000) / hoursPerDay;
        return kwPerHour;
    }
}