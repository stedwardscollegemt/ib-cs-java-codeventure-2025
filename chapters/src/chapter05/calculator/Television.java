package chapter05.calculator;

/**
 * @Authors: Nikola and Abdu
 */
public class Television{
    
    int watts;
    
    int hoursPerDay;
    
    double kwPerHour;
    
    public void setKwPerHour() {
        
        kwPerHour = (watts / 1000) / hoursPerDay;
    }
}