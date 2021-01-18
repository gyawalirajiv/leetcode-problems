package com.rajiv.mum;

public class First {
    public static void main(String[] args) {
        is123Array(new int[]{2, 3, 5, 7, 11});
        is123Array(new int[]{2, 3, 6, 7, 11});
        is123Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10});
        is123Array(new int[]{2, 4, 8, 16, 32});
        is123Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1});
        is123Array(new int[]{7, 11, 77, 49});
        is123Array(new int[]{2});
        is123Array(new int[]{});
        is123Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7});
    }

    public static int is123Array(int[] a){

        int divisibleBy2 = 0;
        int divisibleBy3 = 0;
        int divisibleBy5 = 0;
        int divisibleByNone = 0;
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            boolean dividedBySomething = false;
            if(num % 2 == 0) {
                divisibleBy2++;
                dividedBySomething = true;
            }
            if(num % 3 == 0) {
                divisibleBy3++;
                dividedBySomething = true;
            }
            if(num % 5 == 0) {
                divisibleBy5++;
                dividedBySomething = true;
            }
            if(!dividedBySomething) divisibleByNone++;
        }

        return divisibleBy2 + divisibleBy3 + divisibleBy5 + divisibleByNone == a.length ? 1 : 0;
    }

}
