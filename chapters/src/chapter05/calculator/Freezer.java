package chapter05.calculator;

/**
 * @Authors: Alessandro and Mariia
 */
public class Freezer{
    
    int watts;
    
    int hoursPerDay;
    
    double kwPerHour;
    
    public void setKwPerHour() {
        
        kwPerHour = (watts / 1000) / hoursPerDay;
    }
    
}