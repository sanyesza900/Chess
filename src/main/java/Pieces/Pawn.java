package Pieces;

import Misctools.ColorLocal;
import Misctools.Space;

import java.util.ArrayList;
import java.util.HashMap;

public class Pawn extends Piece {

    public Pawn(ColorLocal color) {
        super(color);
    }


    //Calculates where a Pawn can move
    //Checks if pawn can attack, if it can that piece space is added to the movelist
    //Does it for both colors
    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        ArrayList<Space> movelist = new ArrayList<>();
        int nid  = getPos().getId();
        if (color == ColorLocal.BLACK) { nid = nid+8;}
        else { nid = nid-8; }

        if (!Hasmoved) {
            if (color == ColorLocal.BLACK) {
                for (int i = 0; i < 2; i++) {
                    if (!board.get(nid + 8 * i).getIsOccupied()) {
                        movelist.add(board.get(nid + 8 * i));
                    }
                    else break;
                }
            }

            else {
                for (int i = 0; i < 2; i++) {
                    if (!board.get(nid - 8 * i).getIsOccupied()) {
                        movelist.add(board.get(nid - 8 * i));
                    }
                    else break;
                }
            }
        }

        else {
            if (!board.get(nid).getIsOccupied()) {
                movelist.add(board.get(nid));
            }

        }

        if (board.get(nid-1).getIsOccupied() && occupiedFriendly(board.get(nid - 1))) {
            movelist.add(board.get(nid-1));
        }

        if (board.get(nid+1).getIsOccupied() && occupiedFriendly(board.get(nid + 1))) {
            movelist.add(board.get(nid+1));
        }

        return movelist;
    }

    public String getUnicode() {
        if (this.color == ColorLocal.WHITE) {
            return "\u2659";
        }
        return "\u265F";
    }

}