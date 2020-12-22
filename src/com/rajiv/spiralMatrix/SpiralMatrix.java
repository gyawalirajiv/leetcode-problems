package com.rajiv.spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
//        int[][] input = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] input = new int[][]{{1,11},{2,12},{3,13},{4,14},{5,15},{6,16},{7,17},{8,18},{9,19},{10,20}};
        System.out.println(spiralOrder(input));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        List<Integer> output = new ArrayList<>();

        while (startRow <= endRow){
            int rowIndex = startRow;
            int columnIndex = startColumn;

            while (columnIndex <= endColumn){
                output.add(matrix[rowIndex][columnIndex]);
                columnIndex++;
            }
            columnIndex--;
            rowIndex++;

            while (rowIndex <= endRow){
                output.add(matrix[rowIndex][columnIndex]);
                rowIndex++;
            }
            if(output.size() == matrix.length * matrix[0].length) break;

            rowIndex--;
            columnIndex--;

            startRow++;
            endColumn--;

            while (columnIndex >= startColumn){
                output.add(matrix[rowIndex][columnIndex]);
                columnIndex--;
            }
            columnIndex++;
            rowIndex--;

            while (rowIndex >= startRow){
                output.add(matrix[rowIndex][columnIndex]);
                rowIndex--;
            }

            endRow--;
            startColumn++;
            if(output.size() == matrix.length * matrix[0].length) break;
        }

        return output;
    }
}
