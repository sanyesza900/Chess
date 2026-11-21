package Game;
import Misctools.Space;
import Pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public class Table {
    private Space[][] board = new Space[8][8];
    private Map<Space, Piece> piecesOnSpace = new HashMap<>();
    private Piece[] backrow = new Piece[8];

    //Constructor for all new tables
    //sets the spaces
    public Table() {
        char firstc = 'a';
        boolean color = true;
        for (int collumnn = 0; collumnn < 8; collumnn++) {
            color = !color;
            char colc = (char)(firstc+collumnn);

            for (int row = 0; row < 8; row++) {
                board[row][collumnn] = new Space(colc, 8-row, color);
                color = !color;
            }
        }
    }

    //Assignes pieces to a space
    //Test
    public void setupTable() {

        char firstc = 'a';
        boolean color = true;
        for (int collumnn = 0; collumnn < 8; collumnn++) {
            color = !color;
            char colc = (char)(firstc+collumnn);

            for (int row = 0; row < 8; row++) {
                Space ns = new Space(colc, 8-row, color);

                piecesOnSpace.put(ns, )
                color = !color;
            }
        }
    }

    //for testing
    public void printTable() {
        for (int i = 0; i<8; i++) {
            for (int j = 0; j<8; j++) {
                board[i][j].printSpace();
            }
            System.out.println();
        }
    }


}