package com.rajiv.generateParenthesis;

import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        if (n == 0) return new ArrayList<>();

        List<String> list = new ArrayList<>();
        recursiveParenthesis(n, 0, 0, "", list);
        return list;
    }

    public static void recursiveParenthesis(int n, int open, int close, String current, List<String> list){
        if(current.length() == n * 2) {
            list.add(current);
            return;
        }

        if(open < n) recursiveParenthesis(n, open+1, close, current + "(", list);
        if(close < open) recursiveParenthesis(n, open, close+1, current + ")", list);
    }
}
