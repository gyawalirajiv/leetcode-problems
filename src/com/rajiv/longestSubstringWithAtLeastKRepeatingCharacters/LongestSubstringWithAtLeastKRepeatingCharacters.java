package com.rajiv.longestSubstringWithAtLeastKRepeatingCharacters;

import java.util.Arrays;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(longestSubstring("ababbc", 2));
    }

    public static int longestSubstring(String s, int k) {
        if(s == null || s.length() == 0) return 0;

        int[] charMapper = new int[26];
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(charMapper, 0);
            for (int j = i; j < s.length(); j++) {
                charMapper[s.charAt(j) - 'a']++;
                if(isValid(charMapper, k)){
                    maxCount = Math.max(j - i + 1, maxCount);
                }
            }
        }
        return maxCount;
    }

    public static boolean isValid(int[] charMapper, int k){
        for (int i = 0; i < charMapper.length; i++) {
            if(charMapper[i] > 0 && charMapper[i] < k) return false;
        }
        return true;
    }


}
