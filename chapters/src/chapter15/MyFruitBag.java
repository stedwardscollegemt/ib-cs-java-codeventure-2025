package chapter15;

import java.security.Key;
import java.util.ArrayList;

import helpers.Keyboard;

public class MyFruitBag {

    static ArrayList<Fruit> myFruitCollection = new ArrayList<Fruit>();

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Let us fill our bag with fruit!");
        boolean insertFruit = true;

        while(insertFruit) {
            System.out.println("Please add a fruit.");
            String name = Keyboard.readString();

            Fruit fruit = new Fruit(name);

            myFruitCollection.add(fruit);

            System.out.println("Ok, added fruit, would you like another?");
            char anotherFruit = Keyboard.readChar();
            if (anotherFruit == 'n') {
                insertFruit = false;
            }
        }

    }
    
}
