package chapter09.nov_2020_p2;

public class Motorbike extends Vehicle {
    
    double hourlyFee = 2.5;

    public double pay(int hours) {
        double mbFee = hourlyFee * hours;
        mbFee = mbFee + super.pay(hours);
        return mbFee;
    }
}
