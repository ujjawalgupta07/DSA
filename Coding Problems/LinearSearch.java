//Problem Description
//Given an array A and an integer B, find the number of occurrences of B in A.
//
//
//Problem Constraints
//1 <= B, Ai <= 109
//1 <= length(A) <= 105
//
//
//Input Format
//Given an integer array A and an integer B.
//
//
//Output Format
//Return an integer, number of occurrences of B in A.
//
//
//Example Input
//Input 1:
// A = [1, 2, 2], B = 2
//Input 2:
// A = [1, 2, 1], B = 3
//
//
//Example Output
//Output 1:
// 2
//Output 2:
// 0
public class LinearSearch {
    public int solve(int[] A, int B) {
        int count = 0;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == B){
                count++;
            }
        }
        return count;
    }
}
