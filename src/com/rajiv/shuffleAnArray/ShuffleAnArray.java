package com.rajiv.shuffleAnArray;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ShuffleAnArray {

}

class Solution {

    int[] list;
    int[] shuffled;
    Random random;

    public Solution(int[] nums) {
        this.list = nums;
        this.shuffled = Arrays.copyOf(this.list, this.list.length);
        this.random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.list;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < this.shuffled.length; i++) {
            int randomIndex = random.nextInt(this.shuffled.length);
            int temp = shuffled[i];
            shuffled[i] = shuffled[randomIndex];
            shuffled[randomIndex] = temp;
        }
        return shuffled;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */