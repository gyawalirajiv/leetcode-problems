package com.rajiv.wordBreak;

import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        System.out.println(wordBreak("catsandog", dictionary));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }
        return dp[n];
    }

//    public static boolean wordBreak(String s, List<String> wordDict) {
//        Set<String> set = new HashSet<>();
//        set.addAll(wordDict);
//        return helperRecursion(0, 1, s, set);
//    }
//
//    public static boolean helperRecursion(int foundIndex, int currentIndex,
//                                          String s, Set<String> set){
//        if(currentIndex >= s.length() + 1 && foundIndex == s.length()) return true;
//        if(currentIndex >= s.length()+ 1) return false;
//
//        String sub = s.substring(foundIndex, currentIndex);
//        if(set.contains(sub))
//            if(helperRecursion(currentIndex, currentIndex + 1, s, set)) return true;
//
//        if(helperRecursion(foundIndex, currentIndex + 1, s, set)) return true;
//
//        return false;
//
//    }
}
