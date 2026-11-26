package Pieces;

import Misctools.ColorLocal;
import Misctools.Space;

import java.util.ArrayList;
import java.util.HashMap;

public class Rook extends Piece {
    public Rook(ColorLocal color) {
        super(color);
    }

    @Override
    public ArrayList<Space> canMoveTo(HashMap<Integer, Space> board) {
        //2 for, 8-8 vonalat kiküld ahol megnézi hogy tudd e oda mozogni, bábu megállitja, ellenséges bábu mezeje hozzálesz adva a listához
        //fontos, jobbra és balra megkell nézni hogy a kapot mező legbal/jobb oldali és ha igen megállitani azt az iterációt
        int id = this.getPos().getId();
        ArrayList<Space> movelist = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            int fid = id - 8 * i;
            Space fs = board.get(fid);
            if (fs != null && !fs.getIsOccupied()) {
                movelist.add(fs);
            }
            else if (fs != null && !occupiedFriendly(fs)) {
                break;
            }
            else if (fs != null && occupiedFriendly(fs)) {
                movelist.add(fs);
                break;
            }
        }

        for (int i = 1; i < 8; i++) {
            int bid = id + 8 * i;
            Space fs = board.get(bid);
            if (fs != null && !fs.getIsOccupied()) {
                movelist.add(fs);
            }
            else if (fs != null && !occupiedFriendly(fs)) {
                break;
            }
            else if (fs != null && occupiedFriendly(fs)) {
                movelist.add(fs);
                break;
            }
        }

        for (int i = 1; i < 8; i++) {
            int rid = id + i;
            Space fs = board.get(rid);
            if (rid % 8 == 1) {
                break;
            }

            if (fs != null && !fs.getIsOccupied()) {
                movelist.add(fs);
            }
            else if (fs != null && !occupiedFriendly(fs)) {
                break;
            }
            else if (fs != null && occupiedFriendly(fs)) {
                movelist.add(fs);
                break;
            }
        }

        for (int i = 1; i < 8; i++) {
            int rid = id - i;
            Space fs = board.get(rid);
            if (rid % 8 == 0) {
                break;
            }

            if (fs != null && !fs.getIsOccupied()) {
                movelist.add(fs);
            }
            else if (fs != null && !occupiedFriendly(fs)) {
                break;
            }
            else if (fs != null && occupiedFriendly(fs)) {
                movelist.add(fs);
                break;
            }
        }

        return movelist;
    }

    public String getUnicode() {
        if (this.color == ColorLocal.WHITE) {
            return "\u2656";
        }
        return "\u265C";
    }
}