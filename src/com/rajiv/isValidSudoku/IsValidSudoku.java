package com.rajiv.isValidSudoku;


import java.util.HashMap;
import java.util.HashSet;

public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] input = new char[][]{{'5','3','.','.','7','.','.','.','.'}
,{'6','.','.','1','9','5','.','.','.'}
,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}};
//        char[][] input = new char[][]{
//                {'.','.','4','.','.','.','6','3','.'},
//                {'.','.','.','.','.','.','.','.','.'},
//                {'5','.','.','.','.','.','.','9','.'},
//                {'.','.','.','5','6','.','.','.','.'},
//                {'4','.','3','.','.','.','.','.','1'},
//                {'.','.','.','7','.','.','.','.','.'},
//                {'.','.','.','5','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'},
//                {'.','.','.','.','.','.','.','.','.'}};
        System.out.println(isValidSudoku(input));
    }

    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> setRow = new HashSet<>();
            HashSet<Character> setColumn = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                Character rowCharacter = board[i][j];
                Character columnCharacter = board[j][i];
                if(rowCharacter != '.'){
                    if(setRow.contains(rowCharacter)) return false;
                    setRow.add(rowCharacter);
                }
                if(columnCharacter != '.'){
                    if(setColumn.contains(columnCharacter)) return false;
                    setColumn.add(columnCharacter);
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            int startRow = i - (i % 3);
            int startColumn = (i * 3) % 9;
            int endRow = startRow + 3;
            int endColumn = startColumn + 3;

            HashSet<Character> setSquare = new HashSet<>();
            while (startRow < endRow) {
                startColumn = (i * 3) % 9;
                while (startColumn < endColumn) {
                    Character c = board[startRow][startColumn];
                    if (c == '.') {
                        startColumn++;
                        continue;
                    }
                    if (setSquare.contains(c)) return false;
                    setSquare.add(c);
                    startColumn++;
                }
                startRow++;
            }
        }

        return true;
    }
}
