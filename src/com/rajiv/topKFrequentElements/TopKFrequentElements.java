package com.rajiv.topKFrequentElements;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if(k == 0) return nums;
        if(nums == null || nums.length == 0) return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((x, y) -> map.get(x) - map.get(y));

        for(int i: map.keySet()){
            heap.add(i);
            if(heap.size() > k) heap.poll();
        }

        int output[] = new int[k];
        for (int i = 0; i < output.length; i++) {
            output[i] = heap.poll();
        }

        return output;
    }
}
