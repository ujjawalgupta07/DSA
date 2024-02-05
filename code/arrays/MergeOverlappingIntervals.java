package code.arrays;

import java.util.ArrayList;

//Problem Description
//Given a collection of intervals, merge all overlapping intervals.
//
//
//
//Problem Constraints
//1 <= Total number of intervals <= 100000.
//
//
//
//Input Format
//First argument is a list of intervals.
//
//
//
//Output Format
//Return the sorted list of intervals after merging all the overlapping intervals.
//
//
//
//Example Input
//Input 1:
//
//[1,3],[2,6],[8,10],[15,18]
//
//
//Example Output
//Output 1:
//
//[1,6],[8,10],[15,18]
//
//
//Example Explanation
//Explanation 1:
//
//Merge intervals [1,3] and [2,6] -> [1,6].
//so, the required answer after merging is [1,6],[8,10],[15,18].
//No more overlapping intervals present.
public class MergeOverlappingIntervals {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> ans = new ArrayList<>();
        int st = intervals.get(0).start;
        int end = intervals.get(0).end;

        for(int i = 1 ; i < intervals.size(); i++){
            if(intervals.get(i).start <= end){
                st = Math.min(st, intervals.get(i).start);
                end = Math.max(end, intervals.get(i).end);
            }
            else{
                ans.add(new Interval(st, end));
                st = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        ans.add(new Interval(st, end));
        return ans;
    }

    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
}

