package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Knight extends Piece{
    public Knight(Board board, int col, int row, boolean isWhite, boolean isPromoted) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;

        this.isWhite = isWhite;
        this.isPromoted = isPromoted;
        this.name = "Knight";


        this.sprite = sheet.getSubimage(5 * sheetScale, super.RowHi() * sheetRow+3, sheetScale, sheetScale)
                .getScaledInstance(board.tileSize,sheetScale, BufferedImage.SCALE_SMOOTH);

    }

    public boolean isValidMovement (int col, int row) {

        int colourIndex = isWhite ? 2 : -2;

        if (col == this.col +1 && row == this.row - colourIndex && board.getPiece(col, row) == null)
            return true;

        if (col == this.col -1 && row == this.row - colourIndex && board.getPiece(col, row) == null)
            return true;

        if (col == this.col +1 && row == this.row - colourIndex && board.getPiece(col, row) != null)
            return true;

        if (col == this.col -1 && row == this.row - colourIndex && board.getPiece(col, row) != null)
            return true;
        return  false;
    }
}

