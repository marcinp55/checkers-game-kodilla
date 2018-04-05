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

    public void setFigure(int row, int col, Figure figure) {
        if ((row >= 1 && row <= 8) && (col >= 1 && col <= 8)) {
            rows[row - 1].getRowFigures()[col - 1] = figure;
        } else {
            System.out.println("Wrong row/column number.");
        }
    }
}