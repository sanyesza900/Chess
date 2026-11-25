package Game;

public class ChessClock {
    int whitetime;
    int blacktime;

    boolean firstmovemade = false;
    boolean nextmove = false;

    public ChessClock(int time) {
        whitetime = time;
        blacktime = time;
    }


}