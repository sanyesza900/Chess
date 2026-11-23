
package Pieces;

import Misctools.Space;
import Pieces.Piece;

import java.util.ArrayList;
import java.util.HashMap;

public class King extends Piece {
    private boolean hasmoved = false;

    public King(boolean color) {
        super(color);
    }

    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        ArrayList<Space> movelist = new ArrayList<>();
        int currentposid = getPos().getId();
        int d_diff = -1;
        if (WhichSide()) {
            d_diff = 1;
        }
        else if (!WhichSide()) {
            d_diff = 0;
        }


        for (int i = 0; i < 3; i++) {
            Space forw = board.get(currentposid-(7+i));
            Space backw = board.get(currentposid+(7+i));
            if (forw != null && (forw.getId() % 8) != d_diff) {
                movelist.add(forw);
            }
            if (backw != null && (backw.getId() % 8) != d_diff) {
                movelist.add(backw);
            }
        }

        if(board.get(currentposid-1) != null && ((currentposid-1) % 8) != d_diff) {
            movelist.add(board.get(currentposid-1));
        }

        if (board.get(currentposid+1) != null && ((currentposid+1) % 8) != d_diff) {
            movelist.add(board.get(currentposid+1));
        }

        return movelist;
    }

    public void setHasMovedtoTrue() {
        hasmoved = true;
    }
}