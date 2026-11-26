package Pieces;
import Misctools.Color;
import Misctools.ColorLocal;
import Misctools.Space;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

//Main class for the pieces
public abstract class Piece {
    protected ColorLocal color;
    protected Space pos;
    protected boolean Hasmoved = false;

    public Piece() {
    }

    public Piece(ColorLocal a) {
        color = a;
    }

    public void setPos(Space p) {
        pos = p;
    }

    public Space getPos() {
        return pos;
    }


    //Declaration for all subclasses to use this method
    public abstract ArrayList<Space> canMoveTo(HashMap<Integer, Space> board);

    //Recieves a piece movelist, then removes all the attacking squares and makes a new list with them
    public ArrayList<Space> attackList(ArrayList<Space> movelist) {
        ArrayList<Space> attacklist = new ArrayList<>();
        for (var it = movelist.iterator(); it.hasNext();) {
            Space s = it.next();
            if (s.getIsOccupied() && s.getOccupiedPieceColor() != this.color) {
                attacklist.add(s);
                it.remove();
            }
        }

        return attacklist;
    }

    public boolean occupiedFriendly(Space s) {
        if (s.getIsOccupied()) {
            if (s.getOccupiedPieceColor() != this.color) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean getHasmoved() {
        return Hasmoved;
    }
}