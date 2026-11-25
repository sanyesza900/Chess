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



        //Piece test
        Piece queen = new Queen(false);
        queen.setPos(board.get(20));
        queen.getPos().printSpace();
        //pawn.setHasmoved();
        System.out.println();
        ArrayList<Space> movelist = queen.canMoveTo(board);
        for (Space i : movelist) {
           System.out.println(i.getId());
        }


    }
}