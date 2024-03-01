package chapter06.hlextension;

/**
 * Developed by HL Cohort 2025 when they were Year 12.
 * Authors: Mariia, Joe, Jay, Abdu <3
 */
public class Checkers {

    // create a global two-dimensional array for my grid
    static char[][] board = new char[8][8];
    static char BLACK = 'B';
    static char WHITE = 'W';
    static char KING_BLACK = 'K';
    static char QUEEN_WHITE = 'Q';
    static int capturedWhite = 0;
    
    public static void main(String[] args) {
        init();
        displayBoard();

        // testing that we can move W at board[5,0]
        moveWhite(5, 0, true);
        displayBoard();

        // testing that we can move W at board[5,0]
        moveWhite(5, 0, true);
        displayBoard();

        // testing that B can capture W
        moveWhite(4, 1, true);
        displayBoard();

        // moveBlack(2, 3, false);
        // displayBoard();
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
        System.out.println("--0---1---2---3---4---5---6---7--");
        System.out.println("---------------------------------");
        for (int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if (board[row][col] == BLACK || board[row][col] == WHITE) {
                    System.out.print("| " + board[row][col] + " ");
                } else {
                    System.out.print("|   ");
                }
                if (col == board[0].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println("");
        }
        System.out.println("---------------------------------");
    }

    public static void moveWhite(int currentRow, int currentCol, boolean rightFlag) {
        int targetRow = currentRow - 1;
        int targetCol = 0;

        if (rightFlag) {
            targetCol = currentCol + 1;
        } else {
            targetCol = currentCol - 1;
        }

        if (isMoveValid(currentRow, currentCol, targetRow, targetCol)) {
            // proceed with the game
            board[targetRow][targetCol] = WHITE;
            board[currentRow][currentCol] = ' ';
        } else if (isCapturePossible(currentRow, currentCol, targetRow, targetCol, WHITE)) {
            // todo: capture black piece
        }

        // promote piece to Queen
        if (targetRow == 0) {
            board[targetRow][targetCol] = QUEEN_WHITE;
        }
    }

    public static void moveBlack(int currentRow, int currentCol, boolean rightFlag) {
        int targetRow = currentRow + 1;
        int targetCol = 0;

        if (rightFlag) {
            targetCol = currentCol + 1;
        } else {
            targetCol = currentCol - 1;
        }

        if (isMoveValid(currentRow, currentCol, targetRow, targetCol)) {
            // proceed with the game
            board[targetRow][targetCol] = BLACK;
            board[currentRow][currentCol] = ' ';
        } else {
            targetRow = currentRow + 2;
            if (rightFlag) {
                targetCol = currentCol + 2;
            } else {
                targetCol = currentCol - 2;
            }
            if (isCapturePossible(currentRow, currentCol, targetRow, targetCol, BLACK)) {
                // capture white piece
                // step 1.
                board[targetRow][targetCol] = BLACK;
                board[currentRow][currentCol] = ' ';
                if (rightFlag) {
                    board[currentRow + 1][currentCol + 1] = ' ';
                } else {
                    board[currentRow + 1][currentCol - 1] = ' ';
                }
                capturedWhite = capturedWhite + 1;
            }
        }

        // promote piece to King
        if (targetRow == 7) {
            board[targetRow][targetCol] = KING_BLACK;
        }
    }

    public static boolean isMoveValid(int currentRow, int currentCol, int targetRow, int targetCol) {
        // make sure indices are not out of bounds
        boolean isWithinBounds = (targetRow < 8 && targetRow >= 0) && (targetCol < 8 && targetCol >= 0);
        // make sure it is empty
        boolean isEmpty = board[targetRow][targetCol] != WHITE && board[targetRow][targetCol] != BLACK;

        return isWithinBounds && isEmpty;
    }

    public static boolean isCapturePossible(int currentRow, int currentCol, int targetRow, int targetCol, char piece) {
        boolean isCapturePossible = false;
        if (piece == WHITE) {
            // todo: condition for isCapturePossible
        } else if (piece == BLACK) {
            // todo: condition for isCapturePossible
        }
        return isCapturePossible;
    }
}
