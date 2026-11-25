package Game;

import Misctools.Color;
import Pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Set {
    Color color;
    public List<Piece> Backrow = new ArrayList<>();
    public List<Piece> Frontrow = new ArrayList<>();

    //Creates a full set with the given color
    public Set(Color color) {
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

        this.color = color;
    }

    //Testing
    public void printSetWithSpaces() {
        System.out.println();
        if (color == Color.WHITE) {
            System.out.printf("White pieces position");
        }
        else {
            System.out.printf("Black Pieces position");
        }

        System.out.println();
        for (Piece pa : Frontrow) {
            pa.getPos().printSpace();
        }
        System.out.println();
        for (Piece p : Backrow) {
            p.getPos().printSpace();
        }
    }
}
