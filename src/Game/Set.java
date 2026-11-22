package Game;

import Pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Set {
    public List<Piece> Backrow = new ArrayList<>();
    public List<Piece> Frontrow = new ArrayList<>();

    public Set(boolean color) {
        for (int i = 0; i < 8; i++) {
            Frontrow.add(new Pawn(color));
        }


    }
}
