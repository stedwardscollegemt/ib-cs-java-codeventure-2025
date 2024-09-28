package chapter07.book_example;

public class MyLibrary {

    public static void main(String[] args) {

        int totalBooks = 0;

        // create an array that can hold 50 books

        
        
        // create 10 Book instances for my library
        Book cSharpBook = new Book("An Introduction to C#", 'P');
        Book fSharpBook = new Book("F# to the Stars", 'P');

        // display unique memory reference of my instances
        System.out.println(cSharpBook);
        System.out.println(fSharpBook);

        // display the titles of my books
        System.out.println(cSharpBook.title);
        System.out.println(fSharpBook.title);

        // ask the user to search for a book using the linear search
        


    }
}
