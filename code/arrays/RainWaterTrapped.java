package code.arrays;

//Problem Description
//Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
//
//
//
//Problem Constraints
//1 <= |A| <= 100000
//
//
//
//Input Format
//First and only argument is the vector A
//
//
//
//Output Format
//Return one integer, the answer to the question
//
//
//
//Example Input
//Input 1:
//
//A = [0, 1, 0, 2]
//Input 2:
//
//A = [1, 2]
//
//
//Example Output
//Output 1:
//
//1
//Output 2:
//
//0
//
//
//Example Explanation
//Explanation 1:
//
//1 unit is trapped on top of the 3rd element.
//Explanation 2:
//
//No water is trapped.
public class RainWaterTrapped {
    public int trap(final int[] A) {
        int[] lm = new int[A.length];
        int[] rm = new int[A.length];
        int n = A.length;
        int ans = 0;
        lm[0] = A[0];
        rm[n - 1] = A[n - 1];
        for(int i = 1 ; i < A.length; i++){
            if(A[i] > lm[i - 1]){
                lm[i] = A[i];
            }
            else{
                lm[i] = lm[i - 1];
            }
        }
        for(int i = n - 2 ; i >= 0; i--){
            if(A[i] > rm[i + 1]){
                rm[i] = A[i];
            }
            else{
                rm[i] = rm[i + 1];
            }
        }
        for(int i = 0 ; i < n; i++){
            ans += (Math.min(lm[i], rm[i]) - A[i]);
        }
        return ans;
    }
}
