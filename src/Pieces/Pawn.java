package Pieces;

import Misctools.Space;

import java.util.HashMap;

public class Pawn extends Piece {
    //Checks if the Pawn can double move from its first space or no
    private boolean hasmoved = false;

    public Pawn(boolean color) {
        super(color);
    }

    private int move_calc(boolean b) {
        if (!b) {
            return 2;
        }
        else {
            return 1;
        }
    }

    @Override
    public void move(HashMap<Space, Piece> board) {
        int step_num = move_calc(hasmoved);
        hasmoved = true;

        if (!color) {

        }
    }


}