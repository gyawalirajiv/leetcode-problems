package com.rajiv.fourSumII;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {
    public static void main(String[] args) {
        System.out.println(fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}));
    }

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int a: A){
            for (int b: B){
                int sum = a + b;
                map.put(-sum, map.getOrDefault(-sum, 0) + 1);
            }
        }

        int count = 0;
        for(int c: C){
            for (int d: D){
                int sum = c + d;
                count += map.getOrDefault(sum, 0);
            }
        }

        return count;
    }
}
