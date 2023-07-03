package Pieces;

import Board.Field;

import java.util.ArrayList;

public class Knight extends Piece{

    public Knight(Teams team, Field startField) {
        super("ChessPieces/" + team.name().toLowerCase() + "_knight.svg", team, startField);
    }

    @Override
    public ArrayList<Field> getValidMoves() {
        return null;
    }
}

