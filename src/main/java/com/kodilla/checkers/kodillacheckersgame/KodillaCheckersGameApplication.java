package com.kodilla.checkers.kodillacheckersgame;

public class KodillaCheckersGameApplication {

    public static void main(String[] args) {
        Figure blackPawn1 = new Pawn("B");
        Figure blackPawn2 = new Pawn("B");
        Figure blackPawn3 = new Pawn("B");
        Figure blackPawn4 = new Pawn("B");
        Figure blackPawn5 = new Pawn("B");
        Figure blackPawn6 = new Pawn("B");
        Figure blackPawn7 = new Pawn("B");
        Figure blackPawn8 = new Pawn("B");
        Figure blackPawn9 = new Pawn("B");
        Figure blackPawn10 = new Pawn("B");
        Figure blackPawn11 = new Pawn("B");
        Figure blackPawn12 = new Pawn("B");

        Figure whitePawn1 = new Pawn("W");
        Figure whitePawn2 = new Pawn("W");
        Figure whitePawn3 = new Pawn("W");
        Figure whitePawn4 = new Pawn("W");
        Figure whitePawn5 = new Pawn("W");
        Figure whitePawn6 = new Pawn("W");
        Figure whitePawn7 = new Pawn("W");
        Figure whitePawn8 = new Pawn("W");
        Figure whitePawn9 = new Pawn("W");
        Figure whitePawn10 = new Pawn("W");
        Figure whitePawn11 = new Pawn("W");
        Figure whitePawn12 = new Pawn("W");

        Board board1 = new Board();

        board1.setFigure(1, 1, blackPawn1);
        board1.setFigure(1, 3, blackPawn2);
        board1.setFigure(1, 5, blackPawn3);
        board1.setFigure(1, 7, blackPawn4);
        board1.setFigure(2, 2, blackPawn5);
        board1.setFigure(2, 4, blackPawn6);
        board1.setFigure(2, 6, blackPawn7);
        board1.setFigure(2, 8, blackPawn8);
        board1.setFigure(3, 1, blackPawn9);
        board1.setFigure(3, 3, blackPawn10);
        board1.setFigure(3, 5, blackPawn11);
        board1.setFigure(3, 7, blackPawn12);

        board1.setFigure(8, 1, whitePawn1);
        board1.setFigure(8, 3, whitePawn2);
        board1.setFigure(8, 5, whitePawn3);
        board1.setFigure(8, 7, whitePawn4);
        board1.setFigure(7, 2, whitePawn5);
        board1.setFigure(7, 4, whitePawn6);
        board1.setFigure(7, 6, whitePawn7);
        board1.setFigure(7, 8, whitePawn8);
        board1.setFigure(6, 1, whitePawn9);
        board1.setFigure(6, 3, whitePawn10);
        board1.setFigure(6, 5, whitePawn11);
        board1.setFigure(6, 7, whitePawn12);

        System.out.println(board1);
        board1.moveFigure(3, 1, 4, 2);
        System.out.println("///////////////////////////////////////////////////////////////");

        System.out.println(board1);
        board1.moveFigure(6, 3, 5, 2);
        System.out.println("///////////////////////////////////////////////////////////////");

        System.out.println(board1);
        board1.moveFigure(8, 1, 7, 2);
        System.out.println("///////////////////////////////////////////////////////////////");

        System.out.println(board1);
        board1.moveFigure(9, 0, 4, 2);
        System.out.println("///////////////////////////////////////////////////////////////");

        board1.moveFigure(6, 5, 4, 8);
        System.out.println(board1);
    }
}