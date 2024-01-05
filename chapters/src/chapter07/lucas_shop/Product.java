package chapter07.lucas_shop;

public class Product {
    
    // ----- Data ---------------------------------------
    String name;

    double price;

    int qty;

    String description;

    String errorMessage;

    // ----- Actions ------------------------------------
    
    // we need to learn about Java methods to do these
    // here we give two examples of class methods
    
    public void displayProduct() {
        System.out.println(String.format("%-10s", name) + " $" + price); 
    }

    public void displayReceiptLine() {
        if (qty > 0) {
            System.out.println(String.format("%-10s", qty + "@" + name + ": ") + (price * qty));
        }
    }
}
