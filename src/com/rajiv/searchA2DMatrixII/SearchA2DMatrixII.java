package com.rajiv.searchA2DMatrixII;

public class SearchA2DMatrixII {
    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[][] matrix = new int[][]{{1}, {3}, {5}};
        System.out.println(searchMatrix(matrix, 5));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int x = 0;
        int y = 0;

        while (y < matrix[0].length && matrix[0][y] <= target){
            if(matrix[0][y] == target) return true;
            y++;
        }
        if(y != 0 && y != matrix[0].length - 1) y--;

        while (x < matrix.length){
            if(matrix[x][y] == target) return true;
            if(x < 0 || x >= matrix.length) return false;
            if(x == matrix.length - 1) return false;

            if(matrix[x + 1][y] <= target) {
                x++;
                continue;
            } else {
                if(y == 0) return false;
                y--;
            }
        }
        return false;
    }
}
