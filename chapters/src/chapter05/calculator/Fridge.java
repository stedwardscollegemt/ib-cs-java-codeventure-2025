package chapter05.calculator;

/**
 * @Author: Ms Camilleri Example
 */
public class Fridge {
    
    // variables with preset values
    int watts;
    
    int hoursPerDay;
    
    double kwPerHour;
    
    public void setKwPerHour() {
        
        kwPerHour = (watts / 1000) / hoursPerDay;
    }
    
}