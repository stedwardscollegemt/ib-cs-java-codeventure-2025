package chapter15;

import java.util.ArrayList;
import java.util.Iterator;

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

            // add is a standard operation in a collection
            myFruitCollection.add(fruit);

            System.out.println("Ok, added fruit, would you like another?");
            char anotherFruit = Keyboard.readChar();
            if (anotherFruit == 'n') {
                insertFruit = false;
            }
        }

        // Study guide - be able to go through a collection and put items in an array
        Fruit[] myFruitArray = new Fruit[myFruitCollection.size()];
        Iterator<Fruit> iterator = myFruitCollection.iterator();
        int count = 0;
        // hasNext is a standard operation in a collection
        while(iterator.hasNext()) {
            // next is a standard operation in a collection
            Fruit nextFruit = iterator.next();
            myFruitArray[count] = nextFruit;
            count = count + 1;
        }
    }
}
