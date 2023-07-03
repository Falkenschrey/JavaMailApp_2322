package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Gold extends Piece{
    public Gold(Board board, int col, int row, boolean isWhite, boolean isPromoted) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;

        this.isWhite = isWhite;
        this.isPromoted = isPromoted;
        this.name = "Gold General";


        this.sprite = sheet.getSubimage(3 * sheetScale, super.RowHi() * sheetRow+5, sheetScale, sheetScale)
                .getScaledInstance(board.tileSize,sheetScale, BufferedImage.SCALE_SMOOTH);

    }

    public boolean isValidMovement (int col, int row) {

        int colourIndex = isWhite ? 1 : -1;

        if (col == this.col +1 && row == this.row - colourIndex && board.getPiece(col, row) == null)
            return true;

        if (col == this.col +1 && row == this.row - colourIndex && board.getPiece(col, row) != null)
            return true;

        if (col == this.col -1 && row == this.row - colourIndex && board.getPiece(col, row) == null)
            return true;

        if (col == this.col -1 && row == this.row - colourIndex && board.getPiece(col, row) != null)
            return true;

        if (col == this.col && row == this.row - colourIndex && board.getPiece(col, row) == null)
            return true;

        if (col == this.col && row == this.row - colourIndex && board.getPiece(col, row) != null)
            return true;

        if (col == this.col && row == this.row + colourIndex && board.getPiece(col, row) == null)
            return true;

        if (col == this.col && row == this.row + colourIndex && board.getPiece(col, row) != null)
            return true;

        if (col == this.col +1 && row == this.row && board.getPiece(col, row) == null)
            return true;

        if (col == this.col +1 && row == this.row && board.getPiece(col, row) != null)
            return true;

        if (col == this.col -1 && row == this.row && board.getPiece(col, row) == null)
            return true;

        if (col == this.col -1 && row == this.row && board.getPiece(col, row) != null)
            return true;
        return  false;
    }
}

