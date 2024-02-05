package code.arrays;

import java.util.ArrayList;

//Problem Description
//You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).
//
//You may assume that the intervals were initially sorted according to their start times.
//
//
//
//Problem Constraints
//0 <= |intervals| <= 105
//
//
//
//Input Format
//First argument is the vector of intervals
//
//second argument is the new interval to be merged
//
//
//
//Output Format
//Return the vector of intervals after merging
//
//
//
//Example Input
//Input 1:
//
//Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
//Input 2:
//
//Given intervals [1, 3], [6, 9] insert and merge [2, 6] .
//
//
//Example Output
//Output 1:
//
// [ [1, 5], [6, 9] ]
//Output 2:
//
// [ [1, 9] ]
//
//
//Example Explanation
//Explanation 1:
//
//(2,5) does not completely merge the given intervals
//Explanation 2:
//
//(2,6) completely merges the given intervals
public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> ans = new ArrayList<>();
        if(intervals.size() == 0){
            ans.add(newInterval);
            return ans;
        }
        for(int i = 0 ; i < intervals.size(); i++){
            if(intervals.get(i).end < newInterval.start){
                ans.add(intervals.get(i));
            }
            else if(intervals.get(i).start > newInterval.end){
                ans.add(newInterval);
                for(int j = i; j < intervals.size(); j++){
                    ans.add(intervals.get(j));
                }
                return ans;
            }
            else{
                newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
                newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            }
        }
        ans.add(newInterval);

        return ans;
    }
}
