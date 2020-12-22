package com.rajiv.climbStairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        if(n == 0) return 0;

        List<Integer> dp = new ArrayList<>();
        dp.add(1);
        dp.add(1);
        for (int i = 2; i <= n; i++) {
            dp.add(dp.get(i - 1) + dp.get(i - 2));
        }

        return dp.get(n);
    }
}
