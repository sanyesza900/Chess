package Pieces;
import Misctools.Space;

public class Piece {
    //Storing a piece color in bool for easier managment
    //false - white, true - black
    protected boolean color;
    protected Space pos;


    Piece(boolean a, Space b) {
        color = a;
        pos = b;
    }

    public Piece() {
    }

    public void setPos(Space p) {
        pos = p;
    }

    //Declaration for all subclasses to use this method
    public void move() {};

}