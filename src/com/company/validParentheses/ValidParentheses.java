package com.company.validParentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{})"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int i = 0;
        while (i < s.length()){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(stack.size() == 0) return false;
                Character c = stack.pop();
                if(s.charAt(i) == ')' && c != '(') return false;
                if(s.charAt(i) == '}' && c != '{') return false;
                if(s.charAt(i) == ']' && c != '[') return false;
            }

            i++;
        }
        if(stack.size() > 0) return false;
        return true;
    }
}
