package com.rajiv.wordSearch;

import java.util.ArrayList;
import java.util.HashMap;

public class WordSearch {
    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
    }

    public static boolean exist(char[][] board, String word) {
        if(word == null || word == "") return true;
        if(board.length == 0) return false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(helperRecursion(i, j, 0, board, word)) return true;
                }
            }
        }
        return false;
    }

    public static boolean helperRecursion(int x, int y, int count, char[][] board, String word){
        if(count == word.length()) return true;
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length ||
                board[x][y] != word.charAt(count))
            return false;

        count++;
        char temp = board[x][y];
        board[x][y] = ' ';
        if(
                helperRecursion(x+1, y, count, board, word) ||
                helperRecursion(x-1, y, count, board, word) ||
                helperRecursion(x, y+1, count, board, word) ||
                helperRecursion(x, y-1, count, board, word)
        ) return true;

        board[x][y] = temp;
        return false;
    }
}
