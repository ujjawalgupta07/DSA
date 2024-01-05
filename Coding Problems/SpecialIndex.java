//Problem Description
//Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
//
//
//
//Problem Constraints
//1 <= N <= 105
//-105 <= A[i] <= 105
//Sum of all elements of A <= 109
//
//
//Input Format
//First argument contains an array A of integers of size N
//
//
//Output Format
//Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
//
//
//
//Example Input
//Input 1:
//A = [2, 1, 6, 4]
//Input 2:
//
//A = [1, 1, 1]
//
//
//Example Output
//Output 1:
//1
//Output 2:
//
//3

public class SpecialIndex {
    public int solve(int[] A) {
        int n = A.length;
        int count = 0;
        long[] evenSum = new long[n];
        long[] oddSum = new long[n];
        evenSum[0] = A[0];
        oddSum[0] = 0;

        for(int i = 1; i < n ; i++){
            if(i % 2 == 0){
                evenSum[i] = evenSum[i - 1] + A[i];
                oddSum[i] = oddSum[i - 1];
            }
            else{
                evenSum[i] = evenSum[i - 1];
                oddSum[i] = oddSum[i - 1] + A[i];
            }
        }

        for(int i = 0; i < n; i++){
            long eSum = 0;
            long oSum = 0;
            if(i == 0){
                eSum = oddSum[n-1] - oddSum[i];
                oSum = evenSum[n-1] - evenSum[i];
            }
            else{
                eSum = evenSum[i - 1] + oddSum[n-1] - oddSum[i];
                oSum = oddSum[i - 1] + evenSum[n-1] - evenSum[i];
            }
            if(eSum == oSum){
                count++;
            }
        }
        return count;
    }
}
