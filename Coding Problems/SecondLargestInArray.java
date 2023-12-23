//Problem Description
//You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
//
//
//Problem Constraints
//1 <= |A| <= 105
//
//0 <= A[i] <= 109
//
//
//
//Input Format
//The first argument is an integer array A.
//
//
//
//Output Format
//Return the second largest element. If no such element exist then return -1.
//
//
//
//Example Input
//Input 1:
//
// A = [2, 1, 2]
//Input 2:
//
// A = [2]
//
//
//Example Output
//Output 1:
//
// 1
//Output 2:
//
// -1

public class SecondLargestInArray {
    public int solve(int[] A) {
        if(A.length < 2){
            return -1;
        }
        int l = -1;
        int sl = -1;
        for(int i = 0 ; i < A.length; i++){
            if(A[i] > l){
                sl = l;
                l = A[i];
            }
            else if(A[i] < l && A[i] > sl){
                sl = A[i];
            }
        }

        return sl;
    }
}
