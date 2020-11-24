package com.company.containerWithMostWater;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int output=0;

        while (left < right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            if(h*w > output) output = h*w;

            if(height[left] > height[right]) right--;
            else left++;
        }
        return output;

    }
}
