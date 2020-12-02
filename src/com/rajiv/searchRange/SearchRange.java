package com.rajiv.searchRange;

public class SearchRange {
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }

    public static int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1, -1};

        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int midIndex = start + ((end - start) / 2);
            int mid = nums[midIndex];
            if(target == mid) {
                start = midIndex;
                break;
            } else if(target < mid){
                end = midIndex;
            } else {
                start = midIndex;
                start++;
            }
        }
        if(nums[start] != target) return new int[]{-1, -1};

        int left = start;
        int right = start;
        while (left > 0 && nums[left - 1] == target){
            if(nums[left - 1] == target) left--;
        }
        while (right < nums.length - 1 && nums[right + 1] == target){
            if(nums[right + 1] == target) right++;
        }

        return new int[]{left, right};
    }
}
