package com.rajiv.intersectionOfTwoArraysII;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        System.out.println(intersect(new int[]{1,2,2,1}, new int[]{2,2}));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return new int[]{};

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        HashMap map = new HashMap();

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < nums1.length && pointer2 < nums2.length){
            if(nums1[pointer1] == nums2[pointer2]) {
                list.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            }
            else if(nums1[pointer1] < nums2[pointer2]) pointer1++;
            else pointer2++;
        }

        int[] output = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            output[i] = list.get(i);
        }

        return output;
    }

//    public static int[] intersect(int[] nums1, int[] nums2) {
//        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return new int[]{};
//
//        Map<Integer, Integer> map1 = new HashMap<>();
//        Map<Integer, Integer> map2 = new HashMap<>();
//
//        for(int i = 0; i < nums1.length; i++){
//            if(map1.containsKey(nums1[i])) {
//                int count = map1.get(nums1[i]);
//                map1.put(nums1[i], count + 1);
//            } else {
//                map1.put(nums1[i], 1);
//            }
//        }
//
//        for(int i = 0; i < nums2.length; i++){
//            if(map2.containsKey(nums2[i])) {
//                int count = map2.get(nums2[i]);
//                map2.put(nums2[i], count + 1);
//            } else {
//                map2.put(nums2[i], 1);
//            }
//        }
//
//        List<Integer> list = new ArrayList<>();
//        for(Map.Entry<Integer, Integer> item : map1.entrySet()){
//            if(map2.containsKey(item.getKey())){
//                int frequency = Math.min(item.getValue(), map2.get(item.getKey()));
//                while (frequency != 0){
//                    list.add(item.getKey());
//                    frequency--;
//                }
//            }
//        }
//        int[] output = new int[list.size()];
//        for(int i = 0; i < list.size(); i++){
//            output[i] = list.get(i);
//        }
//        return output;
//    }
}
