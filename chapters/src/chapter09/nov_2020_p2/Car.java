package chapter09.nov_2020_p2;

/**
 * extends - is-a type of
 */
public class Car extends Vehicle {
    
    private double hourlyFee = 3.5;

    public double pay(int hours) {
        double carFee = hourlyFee * hours;
        carFee = carFee + super.pay(hours);
        return carFee;
    }

    public void printDetails() {
        System.out.println("Registration: " + getRegistration());
        System.out.println("Colour      : " + getColour());
        System.out.println("Broken      : " + getBroken());
    }

    public void hadAccident() {
        broken = true;
    }
}
