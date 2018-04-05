package com.kodilla.checkers.kodillacheckersgame;

public class BoardRow {
    private Figure[] rowFigures;

    public BoardRow() {
        rowFigures = new Figure[8];
    }

    public Figure[] getRowFigures() {
        return rowFigures;
    }
}
