package com.rajiv.sortColors;

public class SortColors {
    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }

    public static void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;

        int l = 0;
        int m = 0;
        int h = nums.length - 1;

        while (m <= h){
            if(nums[m] == 0){
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                m++;
                l++;
            }
            else if(nums[m] == 1){
                m++;
            }
            else if(nums[m] == 2){
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
    }
}
