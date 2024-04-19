package chapter05.calculator;

/**
 * @Authors: Alessandro and Mariia
 */
public class Freezer{
    
    int watts;
    
    int hoursPerDay;
    
    double kwPerHour;
    
    /**
     * --- Actions (Member Methods) --------------------------------
     */
    public double calcKwPerHour() {
        kwPerHour = (watts / 1000) / hoursPerDay;
        return kwPerHour;
    }
}