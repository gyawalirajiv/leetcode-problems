package com.rajiv.setZeroes;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] input = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(input);
    }

    public static void setZeroes(int[][] matrix) {

        boolean firstRowHasZero = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0) firstRowHasZero = true;
        }
        boolean firstColumnHasZero = false;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0) firstColumnHasZero = true;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if(matrix[i][0] == 0){
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0){
                for (int j = 1; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if(firstRowHasZero){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        if(firstColumnHasZero){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
