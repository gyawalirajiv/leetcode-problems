package com.rajiv.mum;

public class Third {
    public static void main(String[] args) {
        isSelfReferential(new int[]{1, 2, 1, 0});
        isSelfReferential(new int[]{2, 0, 0});
        isSelfReferential(new int[]{0});
        isSelfReferential(new int[]{1});
        isSelfReferential(new int[]{2, 0, 2, 0});
        isSelfReferential(new int[]{2, 1, 2, 0, 0});
        isSelfReferential(new int[]{3, 2, 1, 1, 0, 0, 0});
        isSelfReferential(new int[]{4, 2, 1, 0, 1, 0, 0, 0});
        isSelfReferential(new int[]{5, 2, 1, 0, 0, 1, 0, 0, 0});
        isSelfReferential(new int[]{6, 2, 1, 0, 0, 0, 1, 0, 0, 0});
    }

    public static int isSelfReferential(int[ ] a){

//        As, there is no test case given for an empty input array,
//        when the input is an empty array, return value is 1.

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[j] == i) count++;
            }
            if(count != a[i]) return 0;
        }
        return 1;
    }




}
