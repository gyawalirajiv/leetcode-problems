package com.rajiv.Trie;

import java.util.ArrayList;
import java.util.List;

class Trie {

    class Node {
        Node[] nodes;
        char character;
        boolean isEnd;
        public Node(char character) {
            this.nodes = new Node[26];
            this.character = character;
        }
    }

    Node root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node('\0');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node current = root;
        for (char c: word.toCharArray()){
            Node temp = current.nodes[c - 'a'];
            if(temp == null){
                current.nodes[c - 'a'] = new Node(c);
            }
            current = current.nodes[c - 'a'];
        }
        current.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node current = root;
        for (char c: word.toCharArray()){
            current = current.nodes[c - 'a'];
            if(current == null) return false;
        }
        return current.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node current = root;
        for (char c: prefix.toCharArray()){
            current = current.nodes[c - 'a'];
            if(current == null) return false;
        }
        return true;
    }
}