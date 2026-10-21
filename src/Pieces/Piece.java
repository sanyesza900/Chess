package Pieces;
import Misctools.Coordinate;

public class Piece {
    //Storing a piece color in bool for easier managment
    //0 - white, 1 - black
    private boolean color;
    private Coordinate pos;

    Piece(boolean a, Coordinate b) {
        color = a;
        pos = b;
    }

    public Piece() {
    }

    public void setPos(Coordinate p) {
        pos = p;
    }

}