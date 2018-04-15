package com.kodilla.checkers.kodillacheckersgame;

public class BoardRow {
    private Figure[] rowFigures;

    public BoardRow() {
        rowFigures = new Figure[8];
        for(int n=0; n<rowFigures.length; n++) {
            rowFigures[n] = new None();
        }
    }

    public Figure[] getRowFigures() {
        return rowFigures;
    }
}
