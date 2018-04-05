package com.kodilla.checkers.kodillacheckersgame;

public class Board {
    private BoardRow[] rows;

    public Board() {
        rows = new BoardRow[8];
    }

    public Figure getFigure(int row, int col) {
        Figure foundFigure = null;

        if ((row >= 1 && row <= 8) && (col >= 1 && col <= 8)) {
            foundFigure = rows[row - 1].getRowFigures()[col - 1];
        } else {
            foundFigure = null;
        }
        return foundFigure;
    }
}