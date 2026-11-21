package Misctools;

//Will be used for storing coordinate
//Basic setters and getters
//Piece and Table will use it
public class Space {
    private char collumn;
    private int row;

    //Storing the color in bool for easier managment
    //false - white, true - black
    private boolean color;

    public Space(char c, int r, boolean col) {
        row = r;
        collumn = c;
        color = col;
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

    //for testing
    public void printSpace() {
        String colorn;
        if (color) {
            colorn = "b";
        }
        else {
            colorn = "w";
        }
        System.out.printf(collumn + "" + row + colorn + " ");
    }


}