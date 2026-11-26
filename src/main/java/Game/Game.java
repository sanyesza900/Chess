package Game;

import Misctools.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Game extends JFrame {
    ChessClock clock;
    Board board;
    private JButton[][] graphicalBoard = new JButton[8][8];

    public Game(int time) {
        board = new Board();
        clock = new ChessClock(time);
        HashMap<Integer, Space> gameboard = board.getBoard();
        Set whiteSet = board.getSetWhite();
        Set blackSet = board.getSetBlack();

        setTitle("Chess board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);

        JPanel graphicalBoardPanel = new JPanel(new GridLayout(8, 8));
        Color white = new Color(240, 217, 181);
        Color black = new Color(181, 136, 99);
        Font PieceFont = new Font("Serif", Font.PLAIN, 88);

        for (int row = 0; row < 8; row++) {
            int order = 0;
            for (int collumn = 0; collumn < 8; collumn++) {
                int currentId = 1 + collumn + 8*row;

                Space s = gameboard.get(currentId);
                JButton chessSpace = new JButton();
                chessSpace.setFont(PieceFont);
                chessSpace.setForeground(Color.BLACK);

                if (s.getColor() == ColorLocal.BLACK) {
                    chessSpace.setBackground(black);
                }
                else {
                    chessSpace.setBackground(white);
                }

                switch(row+1) {
                    case 1 -> chessSpace.setText(blackSet.Backrow.get(order).getUnicode());
                    case 2 -> chessSpace.setText(blackSet.Frontrow.getFirst().getUnicode());
                    case 7 -> chessSpace.setText(whiteSet.Frontrow.getFirst().getUnicode());
                    case 8 -> chessSpace.setText(whiteSet.Backrow.get(order).getUnicode());
                }

                order++;

                chessSpace.addActionListener(e -> {
                    System.out.println(gameboard.get(currentId).getRow());
                    System.out.println(gameboard.get(currentId).getCollumn());
                });

                chessSpace.setMargin(new Insets(0, 0, 0, 0));
                chessSpace.setOpaque(true);
                chessSpace.setBorderPainted(false);
                chessSpace.setFocusPainted(false);

                graphicalBoard[row][collumn] = chessSpace;
                graphicalBoardPanel.add(chessSpace);
            }

        }

        add(graphicalBoardPanel);
    }

}