package com.rajiv.centeredArray;

public class subChar {
    public static void main(String[] args) {
        System.out.println(subChar(new char[]{'a', 'b', 'c'}, 1, 2));
    }

    public static char[] subChar(char[] chars, int start, int len){
        if(start < 0 || start > chars.length - 1) return null;
        if(len < 0 || start + len > chars.length) return null;

        char[] output = new char[len];
        int index = 0;
        for (int i = start; i < start + len; i++) {
            output[index] = chars[i];
            index++;
        }

        return output;
    }
}
