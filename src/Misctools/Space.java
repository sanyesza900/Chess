package Misctools;

//Will be used for storing coordinate
//Basic setters and getters
//Piece and Table will use it
public class Space {
    private static int id = 1;
    private char collumn;
    private int row;

    //Storing the color in bool for easier managment
    //false - white, true - black
    private boolean color;

    public Space(char c, int r, boolean col) {
        row = r;
        collumn = c;
        color = col;
        id++;
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

    public int getId() { return id;}

    public String getName() {
        return collumn + "" + row;
    }

    //for testing
    public void printSpace() {
        System.out.printf(getName());
    }


}