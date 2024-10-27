package chapter09.nov_2020_p2;

public class Vehicle {
    
    /**
     * ---------- ATTRIBUTES ----------------------
     */
    private String registration;
    private byte colour;
    
    protected boolean broken;

    public final static byte BLACK = 1;
    public final static byte WHITE = 2;
    public final static byte BLUE = 3;
    public final static byte RED = 4;
    public final static byte GREEN = 5;
    
    private final static double ADMIN_FEE = 5;

    /**
     * ---------- CONSTRUCTORS --------------------
     */
    public Vehicle() {}

    public Vehicle(String registration) {
        this.registration = registration;
    }

    public Vehicle(String registration, byte colour) {
        this.registration = registration;
        this.colour=colour;
    }

    /**
     * ---------- BEHAVIOUR (METHODS) -------------
     */
    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public void setColour(byte colour) {
        this.colour = colour;
    }

    public boolean getBroken() {
        return broken;
    }

    public String getRegistration() {
        return registration;
    }

    public byte getColour() {
        return colour;
    }

    public double pay(int hours) {
        //  if the vehicle has stayed for five hours or less; 
        if (hours <= 5) {
            return ADMIN_FEE;
        } else {
            return 0;
        }
    }
}
