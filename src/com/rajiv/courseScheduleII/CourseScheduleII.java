package com.rajiv.courseScheduleII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {
    public static void main(String[] args) {
        System.out.println(findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}}));
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {

        List<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] dependenciesTracker = new int[numCourses];
        for (int[] d: prerequisites){
            graph[d[0]].add(d[1]);
            dependenciesTracker[d[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < dependenciesTracker.length; i++){
            if(dependenciesTracker[i] == 0) {
                q.add(i);
                output.add(i);
            }
        }

        while (!q.isEmpty()){
            Integer freeCourse = q.poll();
            for (int d: graph[freeCourse]){
                dependenciesTracker[d]--;
                if(dependenciesTracker[d] == 0) {
                    q.add(d);
                    output.add(d);
                }
            }
        }
        if(output.size() != numCourses) return new int[]{};

        int[] reverse = new int[output.size()];
        for (int i = output.size() - 1; i >= 0; i--) {
            reverse[output.size() - 1 - i] = output.get(i);
        }
        return reverse;

    }
}
