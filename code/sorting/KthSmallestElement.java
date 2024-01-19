package code.sorting;

import java.util.Arrays;

//Problem Description
//Find the Bth smallest element in given array A .
//
//NOTE: Users should try to solve it in less than equal to B swaps.
//
//
//
//Problem Constraints
//1 <= |A| <= 100000
//
//1 <= B <= min(|A|, 500)
//
//1 <= A[i] <= 109
//
//
//
//Input Format
//The first argument is an integer array A.
//
//The second argument is integer B.
//
//
//
//Output Format
//Return the Bth smallest element in given array.
//
//
//
//Example Input
//Input 1:
//
//A = [2, 1, 4, 3, 2]
//B = 3
//Input 2:
//
//A = [1, 2]
//B = 2
//
//
//Example Output
//Output 1:
//
// 2
//Output 2:
//
// 2
public class KthSmallestElement {

    public int kthsmallest(final int[] A, int C) {
        int[] B;
        B = A;
        Arrays.sort(B);
        return B[C - 1];
    }
}
