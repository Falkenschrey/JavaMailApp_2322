package pieces;

import main.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {

    public int col, row;
    public int xPos, yPos;

    public boolean isWhite;
    public boolean isPromoted;
    public int rowHight;

    public String name;
    public int value;

    BufferedImage sheet;
    {
        try {
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("pieces.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected int sheetScale = (sheet.getWidth()/8);
    protected int sheetRow = (sheet.getHeight()*10 /38)-1;

    public int RowHi() {
        rowHight = 0;
        if (isWhite) {
            if (isPromoted) {
                rowHight++;
            }
        } else {
            rowHight = 2;
            if (isPromoted) {
                rowHight++;
            }
        }
        return rowHight;
    }

    Image sprite;

    Board board;

    public Piece(Board board) {
        this.board = board;
    }

    public boolean isValidMovement (int col, int row) {
        return true;
    }

    public boolean moveCollideWithPiece (int col, int row) {
        return false;
    }

    public void paint(Graphics2D g2d) {
        g2d.drawImage(sprite,xPos,yPos+5,null);
    }
}
