import Game.*;
import Misctools.*;
import Pieces.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public void main() {
        //Table test
        Table t1 = new Table();
        HashMap<Integer, Space> board = t1.getBoard();
        t1.printBoard();
        System.out.println();

        //Piece test
        Piece king = new King(true);
        king.setPos(board.get(8));
        king.getPos().printSpace();
        System.out.println();
        ArrayList<Space> movelist = king.canMoveTo(board);
        for (Space i : movelist) {
           System.out.println(i.getName());
        }
    }
}