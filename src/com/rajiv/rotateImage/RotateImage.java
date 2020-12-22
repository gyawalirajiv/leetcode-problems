package com.rajiv.rotateImage;

public class RotateImage {
    public static void main(String[] args) {
        int[][] input = new int[][]{{1,2,3},{4,5,6}, {7,8,9}};
        rotate(input);
    }

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}