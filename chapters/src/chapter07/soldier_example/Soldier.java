package chapter07.soldier_example;

public class Soldier {

    // ----- Data ---------------------------------------

    String id; // stores a unique identifier for the soldier

    int health;

    String currentWeapon;

    String troop;

    String[] profile; // name, surname, age, weakness, strength, interests

    String[] weapons;


    // ----- Actions ------------------------------------
    public void reduceHealth(int damage) {
        health = health - damage;
    }
    
}
