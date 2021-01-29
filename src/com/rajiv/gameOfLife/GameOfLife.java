package com.rajiv.gameOfLife;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] input = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(input);
    }

    public static void gameOfLife(int[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) return;

        int[][] output = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int numberOfLive = numberOfLive(i, j, board);
                if(board[i][j] == 1){
                    if(numberOfLive == 2 || numberOfLive == 3) output[i][j] = 1;
                } else {
                    if(numberOfLive == 3) output[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[0].length; j++) {
                board[i][j] = output[i][j];
            }
        }
    }

    public static int numberOfLive(int i, int j, int[][] board){
        int count = 0;
        if(i > 0 && j > 0 && board[i-1][j-1] == 1) count++;
        if(i > 0 && board[i-1][j] == 1) count++;
        if(i > 0 && j < board[0].length - 1 && board[i-1][j+1] == 1) count++;
        if(j < board[0].length - 1 && board[i][j+1] == 1) count++;
        if(i < board.length - 1 && j < board[0].length - 1 && board[i+1][j+1] == 1) count++;
        if(i < board.length - 1 && board[i+1][j] == 1) count++;
        if(i < board.length - 1 && j > 0 && board[i+1][j-1] == 1) count++;
        if(j > 0 && board[i][j-1] == 1) count++;
        return count;
    }
}
