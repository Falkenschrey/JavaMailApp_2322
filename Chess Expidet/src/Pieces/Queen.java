package Pieces;

import Board.Field;

import java.util.ArrayList;

public class Queen extends Piece{

    public Queen(Teams team, Field startField) {
        super("ChessPieces/" + team.name().toLowerCase() + "_queen.svg", team, startField);
    }

    @Override
    public ArrayList<Field> getValidMoves() {
        return null;
    }
}

