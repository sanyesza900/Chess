package Pieces;

import Misctools.Color;
import Misctools.ColorLocal;
import Misctools.Space;
import Pieces.Piece;

import java.util.ArrayList;
import java.util.HashMap;

public class Queen extends Piece {
    public Queen(ColorLocal color) {
        super(color);
    }

    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        Rook r = new Rook(color);
        r.setPos(getPos());
        ArrayList<Space> movelist = new ArrayList<>(r.canMoveTo(board));

        Bishop b = new Bishop(color);
        b.setPos(getPos());
        ArrayList<Space> temp = new ArrayList<>(b.canMoveTo(board));

        movelist.addAll(temp);

        return movelist;

    }

}