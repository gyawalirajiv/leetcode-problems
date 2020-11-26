package com.rajiv.letterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinations {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits){
        if(digits.equals("")) return new ArrayList<>();

        List<String> output = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        findCombinations("", digits, output, map);
        return output;
    }

    public static void findCombinations(String current, String digits, List<String> output, Map<Integer, String> map){
        if(current.length() == digits.length()){
            output.add(current);
            return;
        }

        int index = current.length();
        Character c = digits.charAt(index);
        int digit = Integer.parseInt(c + "");
        String[] possibleLetters = map.get(digit).split("");

        for(String letter: possibleLetters){
            findCombinations(current + letter, digits, output, map);
        }
    }

}



















