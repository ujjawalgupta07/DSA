package code.arrays;//Problem Description
//Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
//
//
//Problem Constraints
//1 <= N <= 105
//1 <= A[i] <=109
//1 <= B <= 109
//
//
//Input Format
//The first argument given is the integer array A.
//The second argument given is the integer B.
//
//
//Output Format
//Return the array A after rotating it B times to the right
//
//
//Example Input
//Input 1:
//
//A = [1, 2, 3, 4]
//B = 2
//Input 2:
//
//A = [2, 5, 6]
//B = 1
//
//
//Example Output
//Output 1:
//
//[3, 4, 1, 2]
//Output 2:
//
//[6, 2, 5]

public class RotateArray {
    public int[] solve(int[] A, int B) {
        int[] ans = new int[A.length];
        int n = A.length;
        for(int i = 0; i < n ; i++){
            int index = (i % n) + B;
            while(index >= n){
                index = index % n;
            }
            ans[index] = A[i];
        }
        return ans;
    }
}
