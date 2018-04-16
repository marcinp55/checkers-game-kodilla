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

    public void moveFigure(int verticalPosOld, int horizontalPosOld, int verticalPosNew, int horizontalPosNew) {
        //Check if not outside of the board
        if ((verticalPosOld < 1 || verticalPosOld > 8) || (horizontalPosOld < 1 || horizontalPosOld > 8)) {
            System.out.println("There are no figures outside of the board to move.");
            return;
        }

        //Check if move is correct
        Figure figureToMove = getFigure(verticalPosOld, horizontalPosOld);
        if (figureToMove.getColor() == "W") {
            if ((verticalPosNew != verticalPosOld - 1 && horizontalPosNew != horizontalPosOld - 1)
                    || (verticalPosNew != verticalPosOld - 1 && horizontalPosNew != horizontalPosOld + 1)) {
                System.out.println("Illegal move.");
                return;
            }
        } else if (figureToMove.getColor() == "B") {
            if ((verticalPosNew != verticalPosOld + 1 && horizontalPosNew != horizontalPosOld - 1)
                    || (verticalPosNew != verticalPosOld + 1 && horizontalPosNew != horizontalPosOld + 1)) {
                System.out.println("Illegal move.");
                return;
            }
        }

        //Check if space to move is free and move if yes
            if (rows[verticalPosNew - 1].getRowFigures()[horizontalPosNew - 1] instanceof Pawn == false
                    && rows[verticalPosNew - 1].getRowFigures()[horizontalPosNew - 1] instanceof Queen == false
                    && (verticalPosNew >= 1 && verticalPosNew <= 8)
                    && (horizontalPosNew >= 1 && horizontalPosNew <= 8)) {
                rows[verticalPosOld - 1].getRowFigures()[horizontalPosOld - 1] = new None();
                setFigure(verticalPosNew, horizontalPosNew, figureToMove);
            } else {
                System.out.println("You can't move here.");
                return;
            }
    }
}