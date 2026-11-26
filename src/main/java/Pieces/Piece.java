package Pieces;
import Misctools.Color;
import Misctools.Space;

import java.util.ArrayList;
import java.util.HashMap;

//Main class for the pieces
public abstract class Piece {
    protected Color color;
    protected Space pos;

    public Piece() {
    }

    public Piece(Color a) {
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

    public boolean occupiedFriendly(Space s) {
        if (s.getIsOccupied()) {
            if (s.getOccupiedPieceColor() != this.color) {
                return true;
            }
            return false;
        }
        return true;
    }

}