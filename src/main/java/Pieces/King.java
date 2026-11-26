
package Pieces;

import Game.Set;
import Misctools.ColorLocal;
import Misctools.Space;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.HashMap;

public class King extends Piece {
    public boolean cancastle = false;
    public King(ColorLocal color) {
        super(color);
    }


    //Calculates where the king can move
    //returns a list of all possible Spaces
    //If the Space doesnt exist or is on the other side of the board, then it wont add that space to the list
    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        ArrayList<Space> movelist = new ArrayList<>();
        int currentposid = getPos().getId();
        int d_diff = -1;
        if (pos.getId() % 8 == 0) {
            d_diff = 1;
        }
        if (pos.getId() % 8 == 1) {
            d_diff = 0;
        }

        for (int i = 0; i < 3; i++) {
            Space forw = board.get(currentposid-(7+i));
            Space backw = board.get(currentposid+(7+i));
            if (forw != null && (forw.getId() % 8) != d_diff && this.occupiedFriendly(forw)) {
                movelist.add(forw);
            }
            if (backw != null && (backw.getId() % 8) != d_diff && this.occupiedFriendly(backw)) {
                movelist.add(backw);
            }
        }

        Space left = board.get(currentposid-1);
        if(left != null && ((currentposid-1) % 8) != d_diff && this.occupiedFriendly(left)) {
            movelist.add(left);
        }

        Space right = board.get(currentposid+1);
        if (right!= null && ((currentposid+1) % 8) != d_diff && this.occupiedFriendly(right)) {
            movelist.add(right);
        }

        return movelist;
    }


    //Checks if the King can short or long castle, if so it gives back the Space it will move to when castling
    public ArrayList<Space> castle(Set pieceset, HashMap<Integer, Space> board) {
        if (this.Hasmoved) {
            return new ArrayList<>();
        }

        ArrayList<Space> castleList = new ArrayList<>();
        //Jobbra
        int id = getPos().getId();
        for (int i = 1;  i < 3; i++) {
            if (board.get(id+i).getIsOccupied()) {
                return new ArrayList<>();
            }
        }
        for (Piece p : pieceset.Backrow) {
            if (p.getClass() == Rook.class && p.getPos() == board.get(id+3) && !p.Hasmoved) {
                    castleList.add(board.get(id+2));
                }

        }

        //Balra
        for (int i = 1;  i < 4; i++) {
            if (board.get(id-i).getIsOccupied()) {
                return new ArrayList<>();
            }
        }
        for (Piece p : pieceset.Backrow) {
            if (p.getClass() == Rook.class && p.getPos() == board.get(id-4) && !p.Hasmoved) {
                    castleList.add(board.get(id-2));
                }

        }

        return castleList;
    }

    public String getUnicode() {
        if (this.color == ColorLocal.WHITE) {
            return "\u2654";
        }
        return "\u265A";
    }
}