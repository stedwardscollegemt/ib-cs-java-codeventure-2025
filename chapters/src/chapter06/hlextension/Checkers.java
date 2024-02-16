package chapter06.hlextension;

public class Checkers {

    // create a global two-dimensional array for my grid
    static char[][] board = new char[8][8];
    static char BLACK = 'B';
    static char WHITE = 'W';
    
    public static void main(String[] args) {
        init();
        displayBoard();
    }

    public static void init() {
        // placing black play pieces
        for (int row = 0; row < 3; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if (row % 2 == 0 && col % 2 == 1) {
                    board[row][col] = BLACK;
                } else if (row % 2 == 1 && col % 2 == 0) {
                    board[row][col] = BLACK;
                }
            }
        }

        // placing white play pieces
        for (int row = 5; row < 8; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if (row % 2 == 0 && col % 2 == 1) {
                    board[row][col] = WHITE;
                } else if (row % 2 == 1 && col % 2 == 0) {
                    board[row][col] = WHITE;
                }
            }
        }
    }

    public static void displayBoard() {
        for (int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                System.out.print("| " + board[row][col] + "| ");
            }
            System.out.println("");
        }
    }
}
