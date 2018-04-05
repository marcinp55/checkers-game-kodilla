package com.kodilla.checkers.kodillacheckersgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCheckersGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCheckersGameApplication.class, args);

        Figure queen1 = new Queen("W");
        Figure queen2 = new Queen("W");
        Figure queen3 = new Queen("W");
        Figure queen4 = new Queen("W");
        Figure queen5 = new Queen("B");
        Figure queen6 = new Queen("B");
        Figure queen7 = new Queen("B");
        Figure queen8 = new Queen("B");

        Figure pawn1 = new Pawn("B");
        Figure pawn2 = new Pawn("B");
        Figure pawn3 = new Pawn("B");
        Figure pawn4 = new Pawn("B");
        Figure pawn5 = new Pawn("W");
        Figure pawn6 = new Pawn("W");
        Figure pawn7 = new Pawn("W");
        Figure pawn8 = new Pawn("W");

        Board board1 = new Board();

        board1.setFigure(1, 2, queen1);
        board1.setFigure(2, 4, queen2);
        board1.setFigure(3, 5, queen3);
        board1.setFigure(4, 7, queen4);
        board1.setFigure(5, 3, queen5);
        board1.setFigure(6, 1, queen6);
        board1.setFigure(7, 7, queen7);
        board1.setFigure(8, 3, queen8);

        board1.setFigure(1, 3, pawn1);
        board1.setFigure(2, 8, pawn2);
        board1.setFigure(3, 4, pawn3);
        board1.setFigure(4, 5, pawn4);
        board1.setFigure(5, 8, pawn5);
        board1.setFigure(6, 5, pawn6);
        board1.setFigure(7, 4, pawn7);
        board1.setFigure(8, 8, pawn8);

        board1.toString();
    }
}