package com.rajiv.kthSmallestElementInASortedMatrix;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        int[][] input = new int[][]{{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(input, 8));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return Integer.MIN_VALUE;

        PriorityQueue<GridElement> q = new PriorityQueue<>();
        for (int i = 0; i < matrix[0].length; i++) {
            q.add(new GridElement(0, i, matrix[0][i]));
        }

        int count = 0;
        while (!q.isEmpty()){
            GridElement el = q.poll();
            count++;
            if(count == k) return el.val;

            int rowIndex = el.row;
            int colIndex = el.col;
            if(rowIndex + 1 < matrix.length){
                GridElement gridElement = new GridElement(rowIndex + 1, colIndex, matrix[rowIndex+1][colIndex]);
                q.add(gridElement);
            }
        }

        return -1;
    }

    static class GridElement implements Comparable<GridElement>{
        int row;
        int col;
        int val;
        public GridElement(int r, int c, int v){
            row = r;
            col = c;
            val = v;
        }

        @Override
        public int compareTo(GridElement o) {
            return this.val - o.val;
        }
    }

}
