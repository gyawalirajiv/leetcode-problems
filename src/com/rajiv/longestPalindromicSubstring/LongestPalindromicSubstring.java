package com.company.longestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }

    public static String longestPalindrome(String s) {
        if(s.length() == 0) return "";

        int startIndex = 0;
        int endIndex = 0;
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {
            int l1 = expandFromCenter(s, i, i);
            int l2 = expandFromCenter(s, i, i+1);
            int max = Math.max(l1, l2);
            if(max > longest){
                longest = max;
                startIndex = i - (max-1)/2;
                endIndex = i + max/2 + 1;
            }
        }
        return s.substring(startIndex, endIndex);
    }

    public static int expandFromCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;

    }


}
