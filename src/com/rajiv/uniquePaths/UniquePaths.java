package com.rajiv.uniquePaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(25, 9));
    }
    
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m-1][n-1];
    }

//    public static int uniquePaths(int m, int n) {
//        if(m == 0 || n == 0) return 0;
//
//        HashMap<List<Integer>, Integer> map = new HashMap<>();
//
//        return helperRecursion(m, n, 0, 0, map);
//    }

//    public static int helperRecursion(int m, int n, int x, int y, HashMap<List<Integer>, Integer> map){
//        if(x >= m) return 0;
//        if(y >= n) return 0;
//
//        if(x == m - 1 && y == n - 1) return 1;
//        if(map.containsKey(Arrays.asList(x, y))) return map.get(Arrays.asList(x, y));
//
//        int down = helperRecursion(m, n, x + 1, y, map);
//        int right = helperRecursion(m, n, x, y + 1, map);
//
//        map.put(Arrays.asList(x, y), down + right);
//
//        return down + right;
//
//    }
}
