package com.rajiv.palindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        findAll(s, result, new ArrayList<>());
        return result;
    }

    public static void findAll(String s, List<List<String>> result, List<String> temp){
        if(s.equals("")) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String leftPart = s.substring(0, i+1);
            if(isPalindrome(leftPart)){
                temp.add(leftPart);
                findAll(s.substring(i+1), result, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;
        if(l == r) return true;
        while (l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
