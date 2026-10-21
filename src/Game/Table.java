package Game;

import Misctools.Space;

public class Table {
    private Space[][] board = new Space[8][8];

    //Constructor for all new tables
    //sets the spaces
    public Table() {
        char a = 'a';
        boolean color = true;
        for (int collumnn = 0; collumnn < 8; collumnn++) {
            char colc = (char)(a+collumnn);

            for (int row = 0; row < 8; row++) {
                board[collumnn][row] = new Space(colc, row+1, color);
                color = !color;
            }
        }
    }
}