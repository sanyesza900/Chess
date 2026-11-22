package Game;
import Misctools.Space;
import Pieces.*;

import java.util.HashMap;
import java.util.Map;

public class Table {
    private Map<Space, Piece> piecesOnSpace = new HashMap<>();
    private Set white = new Set(false);
    private Set black = new Set(true);

    //Constructor for all new tables
    //sets the spaces and pieces on the table
    public Table() {
        char firstc = 'a';
        boolean color = true;
        int order = 0;
        for (int collumnn = 0; collumnn < 8; collumnn++) {
            color = !color;
            char colc = (char)(firstc+collumnn);

            for (int row = 8; row >= 1; row--) {
                Space ns = new Space(colc, row, color);
                switch (row) {
                    case 8 -> {
                        piecesOnSpace.put(ns, black.Backrow.get(order));
                        piecesOnSpace.get(ns).setPos(ns);
                    }
                    case 7 -> {
                        piecesOnSpace.put(ns, black.Frontrow.get(order));
                        piecesOnSpace.get(ns).setPos(ns);
                    }
                    case 2 -> {
                        piecesOnSpace.put(ns, white.Frontrow.get(order));
                        piecesOnSpace.get(ns).setPos(ns);
                    }
                    case 1 -> {
                        piecesOnSpace.put(ns, white.Backrow.get(order));
                        piecesOnSpace.get(ns).setPos(ns);
                    }
                    default -> piecesOnSpace.put(ns, null);
                }
                color = !color;
            }
            order++;
        }
    }

    //for testing
    public void printTable() {
        for (Space i : piecesOnSpace.keySet()) {
            if (piecesOnSpace.get(i) != null) {
                piecesOnSpace.get(i).getPos().printSpace();
            }
        }
        System.out.println(piecesOnSpace.size());
    }


}