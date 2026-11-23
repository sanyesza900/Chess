package Pieces;

import Misctools.Space;

import java.util.ArrayList;
import java.util.HashMap;

public class Pawn extends Piece {
    //Checks if the Pawn can double move from its first space or no
    private boolean hasmoved = false;

    public Pawn(boolean color) {
        super(color);
    }

    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        ArrayList<Space> movelist = new ArrayList<>();



        return movelist;
    }

}