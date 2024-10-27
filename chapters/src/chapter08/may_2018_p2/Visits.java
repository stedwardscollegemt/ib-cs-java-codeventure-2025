package chapter08.may_2018_p2;

public class Visits {
    
    private String hotelCode;
    
    private int days;

    public Visits(String h, int d) {
        hotelCode = h;
        days = d;
    }

    // In Java, it is good practice, to heavily control writing rights, but
    // allow reading writes, by writing these simple methods, which we call
    // getter methods or accessor methods.
    public int getDays() {
        return days;
    }

    public String getHotelCode() {
        return hotelCode;
    }
}
