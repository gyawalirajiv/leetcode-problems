package com.rajiv.surroundedRegions;

public class SurroundedRegions {
	public static void main(String[] args) {
		char[][] input = new char[][]{
				{'X','X','X','X'},
				{'X','O','O','X'},
				{'X','X','O','X'},
				{'X','O','X','X'}};
		solve(input);
	}
	
	public static void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0) return;

        int row = board.length;
        int column = board[0].length;

		for (int i = 0; i < row; i++) {
			if(board[i][0] == 'O') boundaryDFS(board, i, 0);
			if(board[i][column-1] == 'O') boundaryDFS(board, i, column-1);
		}

		for (int j = 0; j < column; j++) {
			if(board[0][j] == 'O') boundaryDFS(board, 0, j);
			if(board[row-1][j] == 'O') boundaryDFS(board, row-1, j);
		}

		for (int i = 0; i < row; i++){
			for (int j = 0; j < column; j++){
				if(board[i][j] == 'O') board[i][j] = 'X';
				else if(board[i][j] == '*') board[i][j] = 'O';
			}
		}
		System.out.println(board);
    }

    public static void boundaryDFS(char[][] board, int i, int j){
		if(i > board.length - 1 || j > board[0].length || j < 0) return;

		if(board[i][j] == 'O') board[i][j] = '*';

		if(i > 0 && board[i-1][j] == 'O') boundaryDFS(board, i-1, j);
		if(i < board.length - 1 && board[i+1][j] == 'O') boundaryDFS(board, i+1, j);
		if(j > 0 && board[i][j-1] == 'O') boundaryDFS(board, i, j-1);
		if(j < board[0].length - 1 && board[i][j+1] == 'O') boundaryDFS(board, i, j+1);
		return;
	}

}
