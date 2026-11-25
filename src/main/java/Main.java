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

        /*
        System.out.println();
        Piece king = t1.getSetWhite().Backrow.get(4);
        ArrayList<Space> movelist = king.canMoveTo(board);
        for (Space i : movelist) {
            System.out.println(i.getName());
        }
        */


        Piece king = new King(false);
        //Piece test
        Piece knight = new Knight(false);
        knight.setPos(board.get(44));
        knight.getPos().printSpace();
        //pawn.setHasmoved();
        System.out.println();
        ArrayList<Space> movelist = knight.canMoveTo(board);
        for (Space i : movelist) {
           System.out.println(i.getId());
        }


    }
}