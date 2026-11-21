package Pieces;

public class Pawn extends Piece {
    //Checks if the Pawn can double move from its first space or no
    private boolean hasmoved = false;

    private int move_calc(boolean b) {
        if (!b) {
            return 2;
        }
        else {
            return 1;
        }
    }

    public void printName() {
        System.out.printf("Pa");
    }


    @Override
    public void move() {
        int step_num = move_calc(hasmoved);
        hasmoved = true;

        if (!color) {

        }
    }


}