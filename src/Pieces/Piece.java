package Pieces;
import Misctools.Space;

import java.util.ArrayList;
import java.util.HashMap;

//Main class for the pieces
public abstract class Piece {
    //Storing a piece color in bool for easier managment
    //false - white, true - black
    protected boolean color;
    protected Space pos;

    public Piece() {
    }

    public Piece(boolean a) {
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
                return false;
            }
            return true;
        }
        return false;
    }

}