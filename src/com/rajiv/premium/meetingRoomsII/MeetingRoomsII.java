package com.rajiv.premium.meetingRoomsII;

import java.util.Arrays;
import java.util.PriorityQueue;


// Given an array of meeting time intervals consisting of start
// and end times [[s1,e1],[s2,e2],...] (si < ei),
// find the minimum number of conference rooms required.
//
// For example, Given [[0, 30],[5, 10],[15, 20]], return 2.

public class MeetingRoomsII {
    public static void main(String[] args) {
        int[][] input = new int[][]{{0, 30},{5, 10},{15, 20}};
        System.out.println(minMeetingRooms(input));
    }

    public static int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, (int[] a, int[] b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int room = 0;
        for (int i = 0; i < intervals.length; i++) {
            pq.offer(intervals[i][1]);
            if(intervals[i][0] < pq.peek()) room++;
            else pq.poll();
        }

        return room;
    }
}
