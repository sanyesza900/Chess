package Misctools;

//Will be used for storing coordinate
//Basic setters and getters
//Piece and Table will use it
public class Space {
    private int id;
    private char collumn;
    private int row;
    private boolean isoccupied;

    private ColorLocal color;
    private ColorLocal occupiedpiececolor;

    public Space(char c, int r, ColorLocal col, int id) {
        row = r;
        collumn = c;
        color = col;
        this.id = id;
        isoccupied = false;
    }

    public int getRow() {
        return row;
    }

    public char getCollumn() {
        return collumn;
    }

    public ColorLocal getColor() {
        return color;
    }

    public int getId() { return id;}

    public boolean getIsOccupied() {
        return isoccupied;
    }

    public ColorLocal getOccupiedPieceColor() {
        return occupiedpiececolor;
    }

    public void setIsOccupied() {
        isoccupied = true;
    }

    public void setOccupiedPieceColor(ColorLocal c) {
        occupiedpiececolor = c;
    }

    //Gives back the name as String
    public String getName() {
        if (color == ColorLocal.WHITE) {
            return collumn + "" + row + "" + "w" + " ";
        }
        return collumn + "" + row + "" + "b" + " ";
    }

    //for testing
    public void printSpace() {
        System.out.printf(getName());
    }


}