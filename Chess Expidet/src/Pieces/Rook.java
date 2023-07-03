package Pieces;

import Board.Field;

import java.util.ArrayList;

public class Rook extends Piece{

    public Rook(Teams team, Field startField) {
        super("ChessPieces/" + team.name().toLowerCase() + "_rook.svg", team, startField);
    }

    @Override
    public ArrayList<Field> getValidMoves() {
        return null;
    }
}

