package com.rajiv.evaluateReversePolishNotation;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    public static int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) return -1;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String item = tokens[i];
            if(item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")){
                int first = stack.pop();
                int second = stack.pop();
                if(item.equals("+")) stack.push(second + first);
                if(item.equals("-")) stack.push(second - first);
                if(item.equals("*")) stack.push(second * first);
                if(item.equals("/")) stack.push(second / first);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
