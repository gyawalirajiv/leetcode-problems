package com.company.longestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.equals("")) return 0;
        int output = 0;
        int counterBack = 0;
        int counterFront = 0;
        Set<Character> set = new HashSet<>();

        while(counterFront < s.length()){
            if(set.contains(s.charAt(counterFront))){
                set.remove(s.charAt(counterBack));
                if((counterFront - counterBack) > output) output = counterFront - counterBack;
                counterBack++;
            } else {
                set.add(s.charAt(counterFront));
                counterFront++;
            }
        }
        if((counterFront - counterBack) > output) output = counterFront - counterBack;
        counterBack++;

        return output;
    }
}
