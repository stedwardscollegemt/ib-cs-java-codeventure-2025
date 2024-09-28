package chapter07.book_example;

public class Book {
    
    /**
     * ---- Member Variables [Data] ----------------------
     */
    String title;

    char coverType = 'H';

    boolean containsWords = true;

    int currentPage = 0;

    public Book(String titleIn, char coverTypeIn) {
        title = titleIn;
        coverType = coverTypeIn;
    }

    /**
     * ---- Member Methods [Actions] ---------------------
     */
    public void flipNextPage() {
        // write code to increment currentPage
        currentPage = currentPage + 1;
    }
}
