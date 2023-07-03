package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Pawn extends Piece{
    public Pawn(Board board, int col, int row, boolean isWhite, boolean isPromoted) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;

        this.isWhite = isWhite;
        this.isPromoted = isPromoted;
        this.name = "Pawn";


        this.sprite = sheet.getSubimage(7 * sheetScale, super.RowHi() * sheetRow, sheetScale, sheetScale)
                .getScaledInstance(board.tileSize,sheetScale, BufferedImage.SCALE_SMOOTH);

    }

    public boolean isValidMovement (int col, int row) {

        int colourIndex = isWhite ? 1 : -1;

        // push and capture pawn 1
        if (this.col == col && row == this.row - colourIndex && board.getPiece(col, row) == null)
            return true;

        if (col == this.col && row == this.row - colourIndex && board.getPiece(col, row) != null)
            return true;

        return false;
    }
}

