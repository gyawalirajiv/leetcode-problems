package com.rajiv.strStr;

//https://leetcode.com/problems/implement-strstr/
public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle){
        if(needle.equals("")) return 0;

        int hayLen = haystack.length();
        int needleLen = needle.length();

        Character firstCharacter = needle.charAt(0);
        for (int i = 0; i < hayLen - needleLen + 1; i++) {
            if(haystack.charAt(i) == firstCharacter){
                int pointer = 1;
                while ((pointer < needleLen && i+pointer < hayLen) &&
                haystack.charAt(i+pointer) == needle.charAt(pointer)) pointer++;
                if(pointer >= needleLen) return i;
            }
        }
        return -1;
    }
}
