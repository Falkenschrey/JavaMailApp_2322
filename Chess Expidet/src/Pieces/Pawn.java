package Pieces;

import Board.Field;

import java.util.ArrayList;

public class Pawn extends Piece{

    public Pawn(Teams team, Field startField) {
        super("ChessPieces/" + team.name().toLowerCase() + "_pawn.svg", team, startField);
    }

    @Override
    public ArrayList<Field> getValidMoves() {
        return null;
    }
}

