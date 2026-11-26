package Pieces;

import Misctools.ColorLocal;
import Misctools.Space;

import java.util.ArrayList;
import java.util.HashMap;

public class Bishop extends Piece {
    public Bishop(ColorLocal color) {
        super(color);
    }

    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        ArrayList<Space> movelist = new ArrayList<>();
        int id = getPos().getId();
        //Jobbrafel
        for (int i = 1; i < 8; i++) {
            int nid = id - 7 * i;
            Space ns = board.get(nid);
            if (nid % 8 == 1) {
                break;
            }

            if (ns != null && !ns.getIsOccupied()) {
                movelist.add(ns);
            }
            else if (ns != null && !occupiedFriendly(ns)) {
                break;
            }
            else if (ns != null && occupiedFriendly(ns)) {
                movelist.add(ns);
                break;
            }
        }

        //jobbra le
        for (int i = 1; i < 8; i++) {
            int nid = id + 9 * i;
            Space ns = board.get(nid);
            if (nid % 8 == 1) {
                break;
            }

            if (ns != null && !ns.getIsOccupied()) {
                movelist.add(ns);
            }
            else if (ns != null && !occupiedFriendly(ns)) {
                break;
            }
            else if (ns != null && occupiedFriendly(ns)) {
                movelist.add(ns);
                break;
            }
        }

        //balre le
        for (int i = 1; i < 8; i++) {
            int nid = id + 7 * i;
            Space ns = board.get(nid);
            if (nid % 8 == 0) {
                break;
            }

            if (ns != null && !ns.getIsOccupied()) {
                movelist.add(ns);
            }
            else if (ns != null && !occupiedFriendly(ns)) {
                break;
            }
            else if (ns != null && occupiedFriendly(ns)) {
                movelist.add(ns);
                break;
            }
        }

        //balra fel
        for (int i = 1; i < 8; i++) {
            int nid = id - 9 * i;
            Space ns = board.get(nid);
            if (nid % 8 == 0) {
                break;
            }

            if (ns != null && !ns.getIsOccupied()) {
                movelist.add(ns);
            }
            else if (ns != null && !occupiedFriendly(ns)) {
                break;
            }
            else if (ns != null && occupiedFriendly(ns)) {
                movelist.add(ns);
                break;
            }
        }

        return movelist;


    }

    public String getUnicode() {
        if (this.color == ColorLocal.WHITE) {
            return "\u2657";
        }
        return "\u265D";
    }
}