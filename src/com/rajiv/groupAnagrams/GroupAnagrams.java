package com.rajiv.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> output = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedChars = String.valueOf(chars);
            if(!output.containsKey(sortedChars))
                output.put(sortedChars, new ArrayList<>(Arrays.asList(str)));
            else output.get(sortedChars).add(str);
        }
        return new ArrayList<>(output.values());
    }
}
