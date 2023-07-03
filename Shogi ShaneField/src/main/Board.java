package main;

import pieces.*;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {

    public int tileSize = 100;

    int cols = 9;
    int rows = 9;
    int prisonRows = 4;
    int prisonCols = 2;


    ArrayList<Piece> pieceList = new ArrayList<>();

    public Piece selectedPiece;

    Input input = new Input(this);


    public Board() {
        this.setPreferredSize(new Dimension(cols * tileSize +1, rows * tileSize +1));

        this.addMouseListener(input);
        this.addMouseMotionListener(input);

        addPieces();
    }

    public Piece getPiece(int col, int row) {

        for (Piece piece : pieceList) {
            if (piece.col == col && piece.row == row) {
                return piece;
            }
        }
        return null;
    }

    public void makeMove(Move move) {

        if (move.piece.name.equals("Pawn")) {
            movePawn(move);
        } else if (move.piece.name.equals("Bishop")) {
            moveBishop(move);
        } else if (move.piece.name.equals("Knight")) {
            moveKnight(move);
        } else if (move.piece.name.equals("Lance")) {
            moveLance(move);
        } else if (move.piece.name.equals("Rook")) {
            moveRook(move);
        } else if (move.piece.name.equals("Silver General")) {
            moveSilver(move);
        } else {

            move.piece.col = move.newCol;
            move.piece.row = move.newRow;
            move.piece.xPos = move.newCol * tileSize;
            move.piece.yPos = move.newRow * tileSize;

            capture(move.capture);
        }
    }

    private void moveSilver(Move move) {
        int promoOne = move.piece.isWhite ? 0 : 8;
        int promoTwo = move.piece.isWhite ? 1 : 7;
        int promoThree = move.piece.isWhite ? 2 : 6;
        if (move.newRow == promoOne || move.newRow == promoTwo || move.newRow == promoThree) {
            promoteSilver(move);
        }


        move.piece.col = move.newCol;
        move.piece.row = move.newRow;
        move.piece.xPos = move.newCol * tileSize;
        move.piece.yPos = move.newRow * tileSize;

        capture(move.capture);
    }

    private void promoteSilver(Move move) {
        pieceList.add(new pSilver(this, move.newCol, move.newRow, move.piece.isWhite, true));
        capture(move.piece);
    }

    private void moveKnight(Move move) {
        int promoOne = move.piece.isWhite ? 0 : 8;
        int promoTwo = move.piece.isWhite ? 1 : 7;
        int promoThree = move.piece.isWhite ? 2 : 6;
        if (move.newRow == promoOne || move.newRow == promoTwo || move.newRow == promoThree) {
            promoteKnight(move);
        }


        move.piece.col = move.newCol;
        move.piece.row = move.newRow;
        move.piece.xPos = move.newCol * tileSize;
        move.piece.yPos = move.newRow * tileSize;

        capture(move.capture);
    }

    private void promoteKnight(Move move) {
        pieceList.add(new pKnight(this, move.newCol, move.newRow, move.piece.isWhite, true));
        capture(move.piece);
    }

    private void moveLance(Move move) {
        int promoOne = move.piece.isWhite ? 0 : 8;
        int promoTwo = move.piece.isWhite ? 1 : 7;
        int promoThree = move.piece.isWhite ? 2 : 6;
        if (move.newRow == promoOne || move.newRow == promoTwo || move.newRow == promoThree) {
            promoteLance(move);
        }


        move.piece.col = move.newCol;
        move.piece.row = move.newRow;
        move.piece.xPos = move.newCol * tileSize;
        move.piece.yPos = move.newRow * tileSize;

        capture(move.capture);
    }

    private void promoteLance(Move move) {
        pieceList.add(new pLance(this, move.newCol, move.newRow, move.piece.isWhite, true));
        capture(move.piece);
    }

    private void movePawn(Move move) {
        int promoOne = move.piece.isWhite ? 0 : 8;
        int promoTwo = move.piece.isWhite ? 1 : 7;
        int promoThree = move.piece.isWhite ? 2 : 6;
        if (move.newRow == promoOne || move.newRow == promoTwo || move.newRow == promoThree) {
            promotePawn(move);
        }


        move.piece.col = move.newCol;
        move.piece.row = move.newRow;
        move.piece.xPos = move.newCol * tileSize;
        move.piece.yPos = move.newRow * tileSize;

        capture(move.capture);
    }

    private void promotePawn(Move move) {
        pieceList.add(new pPawn(this, move.newCol, move.newRow, move.piece.isWhite, true));
        capture(move.piece);
    }

    private void moveBishop(Move move) {
        int promoOne = move.piece.isWhite ? 0 : 8;
        int promoTwo = move.piece.isWhite ? 1 : 7;
        int promoThree = move.piece.isWhite ? 2 : 6;
        if (move.newRow == promoOne || move.newRow == promoTwo || move.newRow == promoThree) {
            promoteBishop(move);
        }


        move.piece.col = move.newCol;
        move.piece.row = move.newRow;
        move.piece.xPos = move.newCol * tileSize;
        move.piece.yPos = move.newRow * tileSize;

        capture(move.capture);
    }

    private void promoteBishop(Move move) {
        pieceList.add(new Horse(this, move.newCol, move.newRow, move.piece.isWhite, true));
        capture(move.piece);
    }

    private void moveRook(Move move) {
        int promoOne = move.piece.isWhite ? 0 : 8;
        int promoTwo = move.piece.isWhite ? 1 : 7;
        int promoThree = move.piece.isWhite ? 2 : 6;
        if (move.newRow == promoOne || move.newRow == promoTwo || move.newRow == promoThree) {
            promoteRook(move);
        }


        move.piece.col = move.newCol;
        move.piece.row = move.newRow;
        move.piece.xPos = move.newCol * tileSize;
        move.piece.yPos = move.newRow * tileSize;

        capture(move.capture);
    }

    private void promoteRook(Move move) {
        pieceList.add(new Dragon(this, move.newCol, move.newRow, move.piece.isWhite, true));
        capture(move.piece);
    }

    public void capture(Piece piece) {
        if (piece.isWhite) {
        } else {

        }
        pieceList.remove(piece);
    }

    public boolean isValidMove(Move move) {

        if (sameTeam(move.piece, move.capture)) {
            return false;
        }
        if (!move.piece.isValidMovement(move.newCol, move.newRow)) {
            return false;
        }
        if (move.piece.moveCollideWithPiece(move.newCol, move.newRow)) {
            return false;
        }

        return true;
    }

    public boolean sameTeam (Piece p1, Piece p2) {
        if (p1 == null || p2 == null) {
            return false;
        }
        return p1.isWhite == p2.isWhite;
    }

    public void addPieces() {
        int col;
        pieceList.add(new Knight(this, 7, 0, false, false));
        pieceList.add(new Knight(this, 1, 0, false, false));
        pieceList.add(new Knight(this, 7, 8, true, false));
        pieceList.add(new Knight(this, 1, 8, true, false));

        pieceList.add(new Lance(this, 8, 0, false, false));
        pieceList.add(new Lance(this, 0, 0, false, false));
        pieceList.add(new Lance(this, 8, 8, true, false));
        pieceList.add(new Lance(this, 0, 8, true, false));

        pieceList.add(new Bishop(this, 7, 1, false, false));
        pieceList.add(new Rook(this, 1, 1, false, false));
        pieceList.add(new Bishop(this, 7, 7, true, false));
        pieceList.add(new Rook(this, 1, 7, true, false));

        pieceList.add(new Silver(this, 6, 0, false, false));
        pieceList.add(new Silver(this, 2, 0, false, false));
        pieceList.add(new Silver(this, 6, 8, true, false));
        pieceList.add(new Silver(this, 2, 8, true, false));

        pieceList.add(new Gold(this, 5, 0, false, false));
        pieceList.add(new Gold(this, 3, 0, false, false));
        pieceList.add(new Gold(this, 5, 8, true, false));
        pieceList.add(new Gold(this, 3, 8, true, false));

        pieceList.add(new King(this, 4, 0, false, false));
        pieceList.add(new King(this, 4, 8, true, true));

        for (col = 0; col < cols; col++) {
            pieceList.add(new Pawn(this, col, 2, false, false));
            pieceList.add(new Pawn(this, col, 6, true, false));
        }
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        //paint board
        for (int r = 0; r < rows ; r++)
            for (int c = 0; c < cols ; c++) {
                g2d.setColor(new Color(239, 198, 144));
                g2d.fillRect( c * tileSize, r * tileSize, tileSize, tileSize);
                g2d.setColor(new Color(79, 0, 0));
                g2d.drawRect(c * tileSize, r * tileSize, tileSize, tileSize);
                g2d.drawRect(c * tileSize -1, r * tileSize -1, tileSize, tileSize);
            }

        //paint Highlights
        if (selectedPiece != null)
        for (int r = 0; r < rows ; r++)
            for (int c = 0; c < cols ; c++) {

                if (isValidMove(new Move(this, selectedPiece, c, r))) {

                    g2d.setColor(new Color(70, 239, 54, 107));
                    g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
                }
            }

        //paint pieces
        for (Piece piece : pieceList) {
            piece.paint(g2d);
        }
    }
}
