package com.rajiv.happyNumber;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        if(n == 0) return false;

        HashSet<Integer> set = new HashSet<>();
        while (n != 1){
            int temp = 0;
            while (n != 0){
                int digit = n % 10;
                n = n / 10;
                temp += digit * digit;
            }
            if(set.contains(temp)) return false;
            set.add(temp);
            n = temp;
        }

        return true;
    }
}
