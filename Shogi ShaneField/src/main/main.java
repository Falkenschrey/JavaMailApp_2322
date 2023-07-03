package main;

import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.getContentPane().setBackground(new Color(65, 65, 65, 255));
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension( 1650, 950));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container pane){
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }


        Prison prisonBlack = new Prison();
        pane.add(prisonBlack);

        Board board = new Board();
        pane.add(board);

        Prison prisonWhite = new Prison();
        pane.add(prisonWhite);
    }
}
