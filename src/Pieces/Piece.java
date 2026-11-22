package Pieces;
import Misctools.Space;

//Main class for the pieces
public class Piece {
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

    //Declaration for all subclasses to use this method
    public void move() {};

}