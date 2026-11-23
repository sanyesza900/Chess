import Game.*;
import Misctools.*;
import Pieces.*;

public class Main {
    public void main() {
        Table t1 = new Table();

        Space e2 = new Space('e', 2, true);

        Pawn p1 = new Pawn(false);
        p1.setPos(e2);

        t1.printPieceMoveList(p1);
    }
}