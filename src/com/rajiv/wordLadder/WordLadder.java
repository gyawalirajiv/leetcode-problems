package com.rajiv.wordLadder;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        System.out.println(ladderLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog")));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord == "" || endWord == "" || wordList.size() == 0) return 0;

        Set<String> set = new HashSet<>();
        for(String word: wordList){
            set.add(word);
        }
        if(!set.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current_word = queue.poll();
                char[] word_chars = current_word.toCharArray();
                for (int j = 0; j < word_chars.length; j++) {
                    char original_char = word_chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if(word_chars[j] == c) continue;
                        word_chars[j] = c;
                        String new_word = String.valueOf(word_chars);
                        if(new_word.equals(endWord)) return level + 1;
                        if(set.contains(new_word)) {
                            queue.add(new_word);
                            set.remove(new_word);
                        }
                    }
                    word_chars[j] = original_char;
                }
            }
            level++;
        }

        return 0;
    }
}
