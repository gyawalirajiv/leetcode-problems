package com.rajiv.pascalTriangle;


import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> prev = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i) {
                    temp.add(1);
                    continue;
                }
                temp.add(prev.get(j - 1) + prev.get(j));
            }
            output.add(temp);
            prev = temp;
        }

        return output;
    }
}
