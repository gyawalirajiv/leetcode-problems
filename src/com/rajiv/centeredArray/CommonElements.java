package com.rajiv.centeredArray;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        System.out.println(commonElements(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1}));
    }

    public static int[] commonElements(int[] first, int[] second){
        if(first == null || second == null) return null;
        if(first.length == 0 || second.length == 0) return new int[]{};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if(first[i] == second[j]) list.add(first[i]);
            }
        }

        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }
        return output;
    }
}
