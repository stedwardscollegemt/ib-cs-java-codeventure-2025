package chapter05.calculator;

/**
 * @Author: Ms Camilleri Example
 */
public class Fridge {
    
    /**
     * --- Data (Member Variables) --------------------------------
     */
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