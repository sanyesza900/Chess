package Game;
import Misctools.Space;
import Pieces.*;

import java.util.HashMap;
import java.util.Map;

public class Table {
    private HashMap<Integer, Space> board = new HashMap<>();
    private Set white = new Set(false);
    private Set black = new Set(true);

    //Constructor for all new tables
    //sets the spaces and pieces on the table
    public Table() {
        int id = 1;
        boolean color = false;
        for (int row = 8; row >= 1; row--) {
            char firstc = 'a';
            int order = 0;
            color = !color;

            for (int collumn = 0; collumn < 8; collumn++) {
                char colc = (char) (firstc + collumn);
                color = !color;

                Space ns = new Space(colc, row, color, id);
                board.put(id, ns);
                id++;

                switch(row) {
                    case 1 -> white.Backrow.get(order).setPos(ns);
                    case 2 -> white.Frontrow.get(order).setPos(ns);
                    case 7 -> black.Frontrow.get(order).setPos(ns);
                    case 8 -> black.Backrow.get(order).setPos(ns);
                }
                order++;
            }
        }
    }


    //for testing
    public void printBoard() {
        int line = 1;
        for (int i : board.keySet()) {
            System.out.print(i + " ");
            ///System.out.printf(board.get(i).getName());
            if (line == 8) {
                System.out.println();
                line = 0;
            }
            line++;
        }
        white.printSetWithSpaces();
        black.printSetWithSpaces();
    }

    public HashMap<Integer, Space> getBoard() {
        return board;
    }

}