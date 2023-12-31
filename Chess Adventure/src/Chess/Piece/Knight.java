package Chess.Piece;

import Chess.Board.Board;
import Chess.Common.Location;
import Chess.Squares.Square;

import java.util.List;

public class Knight extends AbstractPiece implements Movable{
    public Knight(PieceColour pieceColour) {
        super(pieceColour);
        this.name = "Knight";
    }

    @Override
    public List<Location> getValidMoves(Board board) {
        System.out.println(this.getName() + "-> getValidMoves()");
        return null;
    }

    @Override
    public List<Location> getValidMoves(Board board, Square square) {
        return null;
    }

    @Override
    public void makeMove(Square square) {
        System.out.println(this.getName() + "-> makeMove()");
    }
}
