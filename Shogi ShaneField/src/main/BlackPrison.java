package main;

import pieces.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BlackPrison extends JPanel {

    public int tileSize = 95;

    int prisonRows = 4;
    int prisonCols = 2;

    ArrayList<Piece> prisonList = new ArrayList<>();

    public Piece selectedPiece;

    public void imprison(Move move) {
        prisonList.add(move.imprison);
    }

    public BlackPrison() {
        this.setPreferredSize(new Dimension(prisonCols * tileSize +1, prisonRows * tileSize +1));
    }

    public Piece getPieceFromPrison(int col, int row) {

        for (Piece piece : prisonList) {
            if (piece.col == col && piece.row == row) {
                return piece;
            }
        }
        return null;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (int r = 0; r < prisonRows ; r++)
            for (int c = 0; c < prisonCols ; c++) {
                g2d.setColor(new Color(239, 198, 144));
                g2d.fillRect( c * tileSize, r * tileSize, tileSize, tileSize);
                g2d.setColor(new Color(79, 0, 0));
                g2d.drawRect(c * tileSize, r * tileSize, tileSize, tileSize);
            }


        for (Piece piece : prisonList) {
            piece.paint(g2d);
        }
    }
}
