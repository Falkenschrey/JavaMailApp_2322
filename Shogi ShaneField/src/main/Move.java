package main;

import pieces.Piece;

public class Move {

    int oldCol;
    int oldRow;
    int newCol;
    int newRow;

    Piece piece;
    Piece capture;
    Piece imprison;
    Piece dropWhite;
    Piece dropBlack;

    public Move(Board board, Piece piece, int newCol, int newRow) {

        this.oldCol = piece.col;
        this.oldRow = piece.row;
        this.newCol = newCol;
        this.newRow = newRow;

        this.piece = piece;
        this.imprison = board.getPiece(newCol, newRow);
        this.capture = board.getPiece(newCol, newRow);
    }

    public void Drop(BlackPrison prisonWhite, BlackPrison prisonBlack, Piece piece, int newCol, int newRow) {

        this.oldCol = piece.col;
        this.oldRow = piece.row;
        this.newCol = newCol;
        this.newRow = newRow;

        this.piece = piece;
        this.dropWhite = prisonWhite.getPieceFromPrison (newCol, newRow);
        this.dropBlack = prisonBlack.getPieceFromPrison(newCol, newRow);

    }

}
