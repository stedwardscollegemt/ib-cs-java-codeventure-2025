package chapter05.calculator;

/**
 * @Authors: Nikola and Abdu
 */
public class Television{
    
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