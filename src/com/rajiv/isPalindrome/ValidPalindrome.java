package com.rajiv.isPalindrome;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ab9a"));
    }

    public static boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;

        s = s.trim();
        s = s.toLowerCase();
        String clean = "";
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                clean += s.charAt(i);
            }
        }
        String reverse = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            reverse += clean.charAt(i);
        }
        if(reverse.equals(clean)) return true;
        return false;

    }
}
