package Pieces;

import Misctools.Space;
import Pieces.Piece;

import java.util.ArrayList;
import java.util.HashMap;

public class Knight extends Piece {

    public Knight(boolean color) {
        super(color);
    }

    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        return null;
    }

}