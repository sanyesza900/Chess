package Misctools;

//Will be used for storing coordinate
//Basic setters and getters
//Piece and Table will use it
public class Space {
    private char collumn;
    private int row;
    //Storing the color in bool for easier managment
    //0 - white, 1 - black
    private boolean color;

    public Space(char a, int b, boolean c) {
        row = b;
        collumn = a;
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