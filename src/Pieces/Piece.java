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

    //Determines if piece is on left or right side
    //Needed for move calculations
    //false - left (a collumn)
    //true - right  (h collumn)
    public boolean WhichSide() {
        if (pos.getId() % 8 == 0) {
            return true;
        }
        if (pos.getId() % 8 == 1) {
            return false;
        }

        return false;
    }

}