package com.rajiv.mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] input = new int[][]{{1,4},{0,2},{3,5}};
        System.out.println(merge(input));
    }

    public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return new int[][]{{}};

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> output = new ArrayList<>();

        int i = 0;
        while (i < intervals.length){
            if(i < intervals.length - 1 && intervals[i][1] >= intervals[i+1][0]){
                int maxValue = intervals[i][1] > intervals[i+1][1] ? intervals[i][1] : intervals[i+1][1];

                int j = i + 1;
                while (j < intervals.length - 1 && maxValue >= intervals[j+1][0]){
                    maxValue = maxValue < intervals[j+1][1] ? intervals[j+1][1] : maxValue;
                    j++;
                }
                output.add(new int[]{intervals[i][0], maxValue});

                i = j + 1;
            } else {
                output.add(new int[]{intervals[i][0], intervals[i][1]});
                i++;
            }
        }
        int[][] outputInt = new int[output.size()][2];
        for (int j = 0; j < output.size(); j++) {
            outputInt[j][0] = output.get(j)[0];
            outputInt[j][1] = output.get(j)[1];
        }
        return outputInt;
    }
}
