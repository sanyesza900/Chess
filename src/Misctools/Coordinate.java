package Misctools;

//Will be used for storing coordinate
//Basic setters and getters
//Piece and Table will use it
public class Coordinate {
    private int row;
    private char collumn;
    //Storing the color in bool for easier managment
    //0 - white, 1 - black
    private boolean color;

    Coordinate(int a, char b, boolean c) {
        row = a;
        collumn = b;
        color = c;
    }

    public int getRow() {
        return row;
    }

    public char getCollumn() {
        return collumn;
    }

    public boolean getColor() {
        return color;
    }
}