package Misctools;

//Will be used for storing coordinate
//Basic setters and getters
//Piece and Table will use it
public class Coordinate {
    private int row;
    private char collumn;

    Coordinate(int a, char b) {
        row = a;
        collumn = b;
    }

    public int getRow() {
        return row;
    }

    public char getCollumn() {
        return collumn;
    }
}