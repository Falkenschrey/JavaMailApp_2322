package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Horse extends Piece{
    public Horse(Board board, int col, int row, boolean isWhite, boolean isPromoted) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;

        this.isWhite = isWhite;
        this.isPromoted = isPromoted;
        this.name = "Kirin Dragon Horse";


        this.sprite = sheet.getSubimage(2 * sheetScale, super.RowHi() * sheetRow, sheetScale, sheetScale)
                .getScaledInstance(board.tileSize,sheetScale, BufferedImage.SCALE_SMOOTH);

    }

    public boolean isValidMovement (int col, int row) {
        return Math.abs(this.col - col) == Math.abs(this.row - row) || Math.abs((col - this.col) * (row - this.row)) == 1 || Math.abs(col - this.col) + Math.abs(row - this.row) == 1;
    }

    public boolean moveCollideWithPiece(int col, int row) {

        //up left
        if (this.col > col && this.row > row)
            for (int i = 1; i < Math.abs(this.col - col); i++)
                if (board.getPiece(this.col - i, this.row - i) != null)
                    return true;
        //up right
        if (this.col < col && this.row > row)
            for (int i = 1; i < Math.abs(this.col - col); i++)
                if (board.getPiece(this.col + i, this.row - i) != null)
                    return true;
        //down left
        if (this.row > row && this.col < col)
            for (int i = 1; i < Math.abs(this.col - col); i++)
                if (board.getPiece(this.col - i, this.row + i) != null)
                    return true;
        //down right
        if (this.row < row && this.col < col)
            for (int i = 1; i < Math.abs(this.col - col); i++)
                if (board.getPiece(this.col + i, this.row + i) != null)
                    return true;
        return false;
    }
}

