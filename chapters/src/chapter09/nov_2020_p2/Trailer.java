package chapter09.nov_2020_p2;

public class Trailer extends Vehicle {
    
    private double hourlyFee = 6.5;

    public double pay(int hours) {
        double trailerFee = hourlyFee * hours;
        trailerFee = trailerFee + super.pay(hours);
        return trailerFee;
    }
}
