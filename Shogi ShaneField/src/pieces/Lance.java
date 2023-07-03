package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Lance extends Piece {
    public Lance(Board board, int col, int row, boolean isWhite, boolean isPromoted) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;

        this.isWhite = isWhite;
        this.isPromoted = isPromoted;
        this.name = "Lance";


        this.sprite = sheet.getSubimage(6 * sheetScale, super.RowHi() * sheetRow + 3, sheetScale, sheetScale)
                .getScaledInstance(board.tileSize, sheetScale, BufferedImage.SCALE_SMOOTH);
    }

    public boolean isValidMovement(int col, int row) {

        int colourIndex = isWhite ? 1 : -1;

        for (int c = 1; c <= 8; c++) {
            if (this.col == col && row == this.row - (colourIndex * c) && board.getPiece(col, row) == null)
                return true;
            if (col == this.col && row == this.row - (colourIndex * c) && board.getPiece(col, row) != null)
                return true;
        }
        return false;
    }
    public boolean moveCollideWithPiece(int col, int row) {
        int colourIndex = isWhite ? 1 : -1;
        if (colourIndex == 1 && this.row > row)
            for (int r = this.row - 1; r > row; r--)
                if (board.getPiece(this.col, r) != null)
                    return true;
        if (colourIndex == -1 && this.row < row)
            for (int r = this.row + 1; r < row; r++)
                if (board.getPiece(this.col, r) != null)
                    return true;
        return false;
    }
}

