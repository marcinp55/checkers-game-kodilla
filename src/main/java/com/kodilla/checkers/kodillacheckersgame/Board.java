package com.kodilla.checkers.kodillacheckersgame;

public class Board {
    private BoardRow[] rows;
    private char[] boardLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    private int[] boardNumbers = {8, 7, 6, 5, 4, 3, 2, 1};

    public Board() {
        rows = new BoardRow[8];
        for(int n=0; n<rows.length; n++) {
            rows[n] = new BoardRow();
        }
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

    @Override
    public String toString() {
        String board = "  -------------------------\n";

        for (int i = 0;i < 8;i++) {
            board += boardNumbers[i];
            board += " |";
            for (int j = 0;j < 8;j++) {
                if (rows[i].getRowFigures()[j] instanceof None) {
                    board += "  |";
                } else {
                    String s = rows[i].getRowFigures()[j] instanceof Pawn ? "P" : "Q";
                    board = board + rows[i].getRowFigures()[j].getColor() + s + "|";
                }
            }
            board += "\n  -------------------------\n";
        }
        board += "  ";
        for (int i = 0;i < boardLetters.length;i++) {
            board += " " + boardLetters[i] + " ";
        }
        return board;
    }
}