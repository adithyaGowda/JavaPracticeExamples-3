package com.stackroute.pe3;

public class ChessBoardPattern {

    public String patternChessBoard(int row, int column){

        if (row == 0 && column == 0)
            return null;

        String[][] pattern = new String[row][column];

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                pattern[i][j] = (i + j) % 2 == 0 ? "WW" : "BB";
            }
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(pattern[i][j]+"|");
            }
            System.out.println();
        }

        return "pattern created";
    }
}
