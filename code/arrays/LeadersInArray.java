package code.arrays;//Problem Description
//Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
//
//NOTE: The rightmost element is always a leader.
//
//
//Problem Constraints
//1 <= N <= 105
//1 <= A[i] <= 108
//
//
//Input Format
//There is a single input argument which a integer array A
//
//
//Output Format
//Return an integer array denoting all the leader elements of the array.
//
//
//Example Input
//Input 1:
// A = [16, 17, 4, 3, 5, 2]
//Input 2:
// A = [5, 4]
//
//
//Example Output
//Output 1:
//[17, 2, 5]
//Output 2:
//[5, 4]
//
//
//Example Explanation
//Explanation 1:
// Element 17 is strictly greater than all the elements on the right side to it.
// Element 2 is strictly greater than all the elements on the right side to it.
// Element 5 is strictly greater than all the elements on the right side to it.
// So we will return these three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
//Explanation 2:
// Element 5 is strictly greater than all the elements on the right side to it.
// Element 4 is strictly greater than all the elements on the right side to it.
// So we will return these two elements i.e [5, 4], we can also any other ordering.


import java.util.ArrayList;

public class LeadersInArray{
    public int[] solve(int[] A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int currLeader = A[A.length - 1];
        ans.add(currLeader);
        for(int i = A.length - 2 ; i >= 0 ; i--){
            if(A[i] > currLeader){
                currLeader = A[i];
                ans.add(currLeader);
            }
        }
        int[] resp = new int[ans.size()];
        for(int i = 0 ; i < ans.size(); i++){
            resp[i] = ans.get(i);
        }

        return resp;
    }
}
