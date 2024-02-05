package code.arrays;

import java.util.ArrayList;
import java.util.Collections;

//Problem Description
//Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.
//
//If such arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.
//
//NOTE:
//
//The replacement must be in-place, do not allocate extra memory.
//DO NOT USE LIBRARY FUNCTION FOR NEXT PERMUTATION. Use of Library functions will disqualify your submission retroactively and will give you penalty points.
//
//
//Problem Constraints
//1 <= N <= 5 * 105
//
//1 <= A[i] <= 109
//
//
//
//Input Format
//The first and the only argument of input has an array of integers, A.
//
//
//
//Output Format
//Return an array of integers, representing the next permutation of the given array.
//
//
//
//Example Input
//Input 1:
//
// A = [1, 2, 3]
//Input 2:
//
// A = [3, 2, 1]
//
//
//Example Output
//Output 1:
//
// [1, 3, 2]
//Output 2:
//
// [1, 2, 3]
//
//
//Example Explanation
//Explanation 1:
//
// Next permutaion of [1, 2, 3] will be [1, 3, 2].
//Explanation 2:
//
// No arrangement is possible such that the number are arranged into the numerically next greater permutation of numbers.
// So will rearranges it in the lowest possible order.
public class NextPermutation {

    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int x = -1;
        int y = -1;
        int z = -1;
        int n = A.size();
        int d = Integer.MAX_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        if(n == 1){
            return A;
        }
        for(int i = n - 2 ; i >= 0; i--){
            if(A.get(i) < A.get(i + 1)){
                x = i;
                y = i + 1;
                break;
            }
        }
        if(x == -1 && y == -1){
            Collections.reverse(A);
            return A;
        }
        for(int i = y + 1; i < n; i++){
            int diff = A.get(i) - A.get(x);
            if(diff < d && diff > 0){
                z = i;
                d = diff;
            }
        }
        if(z == -1){
            int temp1 = A.get(x);
            A.set(x, A.get(y));
            A.set(y, temp1);
        }
        else{
            int temp = A.get(x);
            A.set(x, A.get(z));
            A.set(z, temp);
        }

        int e = n - 1;
        while(y < e){
            int temp2 = A.get(y);
            A.set(y, A.get(e));
            A.set(e, temp2);
            y++;
            e--;
        }
        return A;
    }
}
