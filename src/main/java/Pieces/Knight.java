package Pieces;

import Misctools.Color;
import Misctools.Space;

import java.util.ArrayList;
import java.util.HashMap;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color);
    }

    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        ArrayList<Space> movelist = new ArrayList<>();
        int id = getPos().getId();

        //fel-b-j
        Space ns = board.get(id-17);
        if (ns != null && (id-17) % 8 != 0 &&!occupiedFriendly(ns)) {
            movelist.add(ns);
        }
        ns = board.get(id-15);
        if (ns != null && (id-15) % 8 != 1 &&!occupiedFriendly(ns)) {
            movelist.add(ns);
        }

        //le-b-j
        ns = board.get(id+17);
        if (ns != null && (id+17) % 8 != 1 &&!occupiedFriendly(ns)) {
            movelist.add(ns);
        }
        ns = board.get(id+15);
        if (ns != null && (id+15) % 8 != 0 &&!occupiedFriendly(ns)) {
            movelist.add(ns);
        }

        //jobbra oldalra-f-l
        ns = board.get(id-6);
        if (ns != null && ((id-6) % 8 != 1 && (id-6) % 8 != 2) && !occupiedFriendly(ns)) {
            movelist.add(ns);
        }
        ns = board.get(id+10);
        if (ns != null && ((id+10) % 8 != 1 && (id+10) % 8 != 2) && !occupiedFriendly(ns)) {
            movelist.add(ns);
        }

        //balra oldalra-f-l
        ns = board.get(id-10);
        if (ns != null && ((id-10) % 8 != 0 && (id-10) % 8 != 7) && !occupiedFriendly(ns)) {
            movelist.add(ns);
        }
        ns = board.get(id+6);
        if (ns != null && ((id+6) % 8 != 0 && (id+6) % 8 != 7) && !occupiedFriendly(ns)) {
            movelist.add(ns);
        }


        return movelist;
    }

}