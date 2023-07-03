package Pieces;

import Board.Field;

import java.util.ArrayList;

public class King extends Piece{

    public King(Teams team, Field startField) {
        super("ChessPieces/" + team.name().toLowerCase() + "_king.svg", team, startField);
    }

    @Override
    public ArrayList<Field> getValidMoves() {
        return null;
    }
}
