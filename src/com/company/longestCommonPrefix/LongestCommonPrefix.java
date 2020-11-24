package com.company.longestCommonPrefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"cir","car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";

        String output = strs[0];
        int i = 1;

        while(i < strs.length){
            String common = "";
            int j = 0;
            while (j < output.length() && j < strs[i].length()){
                if(output.charAt(j) == strs[i].charAt(j)){
                    common += output.charAt(j);
                } else break;
                j++;
            }
            i++;
            output = common;
        }

        return output;
    }
}
