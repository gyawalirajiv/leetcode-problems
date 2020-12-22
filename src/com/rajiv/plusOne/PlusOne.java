package com.rajiv.plusOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{5,6,2,0,0,4,6,2,4,9}));
    }

    public static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        Stack<Integer> stack = new Stack<>();
        int i = digits.length - 1;
        int carry = 0;
        while (i >= 0){
            if(i == digits.length - 1){
                if(digits[i] == 9){
                    carry = 1;
                }
                stack.push(0);
                i--;
                continue;
            }
            int digit = digits[i];
            if(carry != 0){
                digit++;
                if(digit > 9) {
                    stack.push(0);
                    carry = 1;
                } else {
                    stack.push(digit);
                    carry = 0;
                }
            } else {
                stack.push(digit);
            }
            i--;
        }
        if (carry != 0) stack.push(1);

        int[] output = new int[stack.size()];
        int stackSize = stack.size();
        for (int j = 0; j < stackSize; j++) {
            output[j] = stack.pop();
        }

        return output;
    }
}
