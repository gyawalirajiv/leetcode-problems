package com.rajiv.numberOfIslands;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] input = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        System.out.println(numIslands(input));
    }

    public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    DFS(i, j, grid);
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void DFS(int i, int j, char[][] grid){
        grid[i][j] = '*';

        if(i + 1 < grid.length && grid[i+1][j] == '1') DFS(i+1, j, grid);
        if(i - 1 >= 0 && grid[i-1][j] == '1') DFS(i-1, j, grid);
        if(j + 1 < grid[0].length && grid[i][j+1] == '1') DFS(i, j+1, grid);
        if(j - 1 >= 0 && grid[i][j-1] == '1') DFS(i, j-1, grid);
    }
}
