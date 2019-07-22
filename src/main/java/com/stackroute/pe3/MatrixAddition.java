package com.stackroute.pe3;

public class MatrixAddition {

    public int[][] additionMatrix(int row, int column, int[][] matrix1, int[][] matrix2){

        if(matrix1 == null | matrix2 == null)
            return null;

        int sum[][] = new int[row][column];

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sum;
    }
}
