package code.arrays;//Problem Description
//Given an array A of size N, find the subarray of size B with the least average.
//
//
//
//Problem Constraints
//1 <= B <= N <= 105
//-105 <= A[i] <= 105
//
//
//Input Format
//First argument contains an array A of integers of size N.
//Second argument contains integer B.
//
//
//Output Format
//Return the index of the first element of the subarray of size B that has least average.
//Array indexing starts from 0.
//
//
//Example Input
//Input 1:
//A = [3, 7, 90, 20, 10, 50, 40]
//B = 3
//Input 2:
//
//A = [3, 7, 5, 20, -10, 0, 12]
//B = 2
//
//
//Example Output
//Output 1:
//3
//Output 2:
//
//4
//
//
//Example Explanation
//Explanation 1:
//Subarray between indexes 3 and 5
//The subarray {20, 10, 50} has the least average
//among all subarrays of size 3.
//Explanation 2:
//
// Subarray between [4, 5] has minimum average

public class SubarrayWithLeastAverage {
    public int solve(int[] A, int B) {
        int ans = 0;
        float avg = Float.MAX_VALUE;
        int sum = 0;
        if(B == 1){
            for(int i = 0 ; i < A.length; i++){
                float tAvg = (float) (A[i]) / (float) B;
                if(tAvg < avg){
                    avg = tAvg;
                    ans = i;
                }
            }
        }
        else{
            for(int i = 0 ; i < B; i++){
                sum += A[i];
            }
            avg = (float)sum / (float)B;
            for(int i = 1; i <= A.length - B; i++){
                sum = sum - A[i - 1] + A[B + i - 1];
                float tempAvg = (float)sum / (float)B;
                if(tempAvg < avg){
                    avg = tempAvg;
                    ans = i;
                }
            }
        }

        return ans;
    }
}
