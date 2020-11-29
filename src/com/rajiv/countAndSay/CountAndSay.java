package com.rajiv.countAndSay;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        return recursiveCount(1, n, "1");
    }

    public static String recursiveCount(int count, int n, String digit){
        if(n == count) return digit;

        String res = "";
        int i = 0;
        while (i < digit.length()){
            Character d = digit.charAt(i);
            int j = i + 1;
            while (j < digit.length() && digit.charAt(j) == d){
                j++;
            }
            res += (j-i) + "" + d + "";
            i = j;
        }
        return recursiveCount(count+1, n, res);
    }
}
