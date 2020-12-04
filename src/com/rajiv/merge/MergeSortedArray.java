package com.rajiv.merge;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int mIndex = m - 1;
        int nIndex = n - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if(mIndex >= 0 && nIndex >= 0){
                if(nums1[mIndex] > nums2[nIndex]){
                    nums1[i] = nums1[mIndex];
                    mIndex--;
                } else {
                    nums1[i] = nums2[nIndex];
                    nIndex--;
                }
            } else if(mIndex >= 0){
                nums1[i] = nums1[mIndex];
                mIndex--;
            } else {
                nums1[i] = nums2[nIndex];
                nIndex--;
            }
        }
    }
}
