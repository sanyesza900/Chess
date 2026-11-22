package Game;

import Pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Set {
    public List<Piece> Backrow = new ArrayList<>();
    public List<Piece> Frontrow = new ArrayList<>();

    //Creates a full set with the given color | false = white | true = black
    public Set(boolean color) {
        for (int i = 0; i < 8; i++) {
            Frontrow.add(new Pawn(color));
        }
        Backrow.add(new Rook(color));
        Backrow.add(new Knight(color));
        Backrow.add(new Bishop(color));
        Backrow.add(new Queen(color));
        Backrow.add(new King(color));
        Backrow.add(new Bishop(color));
        Backrow.add(new Knight(color));
        Backrow.add(new Rook(color));
    }
}
