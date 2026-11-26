import Game.*;
import Misctools.*;
import Pieces.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public void main() {
        //Table test
        Board t1 = new Board();
        HashMap<Integer, Space> board = t1.getBoard();
        t1.printBoard();
        System.out.println();

        /*
        System.out.println();
        Piece king = t1.getSetWhite().Backrow.get(4);
        ArrayList<Space> movelist = king.canMoveTo(board);
        for (Space i : movelist) {
            System.out.println(i.getName());
        }
        */



        //Piece test
        Piece knight = new Knight(Color.WHITE);
        knight.setPos(board.get(20));
        knight.getPos().printSpace();
        //pawn.setHasmoved();
        System.out.println();
        ArrayList<Space> movelist = knight.canMoveTo(board);
        ArrayList<Space> attacklist = knight.attackList(movelist);
        System.out.println("Move list:");
        for (Space i : movelist) {
           System.out.println(i.getId());
        }

        System.out.println("Attack list:");
        for (Space i : attacklist) {
            System.out.println(i.getId());
        }


    }
}