package com.rajiv.basicCalculatorII;

import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String[] args) {
        System.out.println(calculate("2*3+4"));
    }

    public static int calculate(String s) {
        if(s == null || s.length() == 0) return 0;

        int currentNumber = 0;
        char prevOperation = '+';
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + Integer.parseInt(c + "");
            }
            if((!Character.isDigit(c) && !Character.isWhitespace(s.charAt(i))) || i == s.length() - 1) {
                if(prevOperation == '+') stack.push(currentNumber);
                else if(prevOperation == '-') stack.push(currentNumber * -1);
                else if(prevOperation == '*') stack.push(stack.pop() * currentNumber);
                else if(prevOperation == '/') stack.push(stack.pop() / currentNumber);
                prevOperation = c;
                currentNumber = 0;
            }
        }

        int output = 0;
        while (!stack.isEmpty()){
            output += stack.pop();
        }
        return output;
    }
}
