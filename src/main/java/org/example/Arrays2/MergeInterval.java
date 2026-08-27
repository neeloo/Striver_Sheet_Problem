package org.example.Arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        // Create an example list of intervals: [[1,3], [2,4], [6,8], [9,10]]
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(new ArrayList<>(Arrays.asList(1, 3)));
        intervals.add(new ArrayList<>(Arrays.asList(2, 4)));
        intervals.add(new ArrayList<>(Arrays.asList(6, 8)));
        intervals.add(new ArrayList<>(Arrays.asList(9, 10)));

        System.out.println("Original Intervals: " + intervals);

        // Call the merge overlap method
        List<List<Integer>> mergedIntervals = mergeOverlap(intervals);

        System.out.println("Merged Intervals:   " + mergedIntervals);
    }

    public static List<List<Integer>> mergeOverlap(List<List<Integer>> intervals) {
        // Edge case handling for empty list or single element
        if (intervals == null || intervals.isEmpty()) {
            return intervals;
        }
        // Corrected sorting for List of Lists
        intervals.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        // Converted to List<Integer> to match input types
        List<Integer> s1 = intervals.get(0);
        List<List<Integer>> list = new ArrayList<>();
        list.add(s1);

        // Changed intervals.length to intervals.size()
        for(int i = 1; i < intervals.size(); i++){
            // Corrected the syntax for getting elements from a list
            int s2 = intervals.get(i).get(0);
            int e2 = intervals.get(i).get(1);
            int e1 = s1.get(1);

            // Corrected the logic condition to check overlap (s2 <= e1)
            if(s2 <= e1){
                s1.set(1, Math.max(e1, e2));
            } else {
                // Corrected to track the new interval when there is no overlap
                s1 = intervals.get(i);
                list.add(s1);
            }
        }
        return list;
    }
}
