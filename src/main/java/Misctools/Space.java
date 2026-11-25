package Misctools;

//Will be used for storing coordinate
//Basic setters and getters
//Piece and Table will use it
public class Space {
    private int id;
    private char collumn;
    private int row;
    private boolean isoccupied;

    private Color color;
    private Color occupiedpiececolor;

    public Space(char c, int r, Color col, int id) {
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

    public Color getColor() {
        return color;
    }

    public int getId() { return id;}

    public boolean getIsOccupied() {
        return isoccupied;
    }

    public Color getOccupiedPieceColor() {
        return occupiedpiececolor;
    }

    public void setIsOccupied() {
        isoccupied = true;
    }

    public void setOccupiedPieceColor(Color c) {
        occupiedpiececolor = c;
    }

    //Gives back the name as String
    public String getName() {
        if (color == Color.WHITE) {
            return collumn + "" + row + "" + "w" + " ";
        }
        return collumn + "" + row + "" + "b" + " ";
    }

    //for testing
    public void printSpace() {
        System.out.printf(getName());
    }


}