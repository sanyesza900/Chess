package Game;

import Misctools.ColorLocal;

public class ChessClock extends Thread {
    int whitetime;
    int blacktime;

    boolean firstmovemade = false;
    ColorLocal nextmove = ColorLocal.WHITE;

    public ChessClock(int time) {
        whitetime = time;
        blacktime = time;
    }

    @Override
    public void run() {
        while(!firstmovemade) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


}