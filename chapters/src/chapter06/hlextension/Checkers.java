package chapter06.hlextension;

public class Checkers {

    // create a global two-dimensional array for my grid
    static char[][] board = new char[8][8];
    static char BLACK = 'B';
    static char WHITE = 'W';
    
    public static void main(String[] args) {
        init();
        displayBoard();

        // testing that we can move W at board[5,0]
        System.out.println("---------------------------------------------------");
        moveWhite(5, 0, true);
        System.out.println("Before: " + board[5][0] + "  After: " + board[4][1]);
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
                System.out.print("| " + board[row][col] + " | ");
            }
            System.out.println("");
        }
    }

    public static void moveWhite(int currentRow, int currentCol, boolean rightFlag) {
        // todo: some validation
        int targetRow = currentRow - 1;
        int targetCol = 0;

        if (rightFlag) {
            targetCol = currentCol + 1;
        } else {
            targetCol = currentCol - 1;
        }

        if (isWhiteMoveValid(targetRow, targetCol)) {
            // proceed with the game
            board[targetRow][targetCol] = WHITE;
            board[currentRow][currentCol] = ' ';
        }
    }

    public static void attackWhite() {

    }

    public static boolean isWhiteMoveValid(int targetRow, int targetCol) {
        // make sure indices are not out of bounds
        boolean isWithinBounds = (targetRow < 8 && targetRow >= 0) && (targetCol < 8 && targetCol >= 0);
        boolean isEmpty = board[targetRow][targetCol] != WHITE && board[targetRow][targetCol] != BLACK;
        return isWithinBounds && isEmpty;
    }

    public static void moveBlack(int currentRow, int currentCol, boolean rightFlag) {

    }
}
