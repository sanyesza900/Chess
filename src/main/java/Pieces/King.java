
package Pieces;

import Misctools.Color;
import Misctools.Space;

import java.util.ArrayList;
import java.util.HashMap;

public class King extends Piece {
    private boolean hasmoved = false;

    public King(Color color) {
        super(color);
    }


    //Calculates where the king can move
    //returns a list of all possible Spaces
    //If the Space doesnt exist or is on the other side of the board, then it wont add that space to the list
    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        ArrayList<Space> movelist = new ArrayList<>();
        int currentposid = getPos().getId();
        int d_diff = -1;
        if (pos.getId() % 8 == 0) {
            d_diff = 1;
        }
        if (pos.getId() % 8 == 1) {
            d_diff = 0;
        }

        for (int i = 0; i < 3; i++) {
            Space forw = board.get(currentposid-(7+i));
            Space backw = board.get(currentposid+(7+i));
            if (forw != null && (forw.getId() % 8) != d_diff && this.occupiedFriendly(forw)) {
                movelist.add(forw);
            }
            if (backw != null && (backw.getId() % 8) != d_diff && this.occupiedFriendly(backw)) {
                movelist.add(backw);
            }
        }

        Space left = board.get(currentposid-1);
        if(left != null && ((currentposid-1) % 8) != d_diff && this.occupiedFriendly(left)) {
            movelist.add(left);
        }

        Space right = board.get(currentposid+1);
        if (right!= null && ((currentposid+1) % 8) != d_diff && this.occupiedFriendly(right)) {
            movelist.add(right);
        }

        return movelist;
    }

    public boolean getHasmoved() {
        return hasmoved;
    }

    public void setHasmovedtoTrue() {
        hasmoved = true;
    }
}