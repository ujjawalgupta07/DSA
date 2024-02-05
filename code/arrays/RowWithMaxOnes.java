package code.arrays;


//Problem Description
//Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.
//
//NOTE:
//
//If two rows have the maximum number of 1 then return the row which has a lower index.
//Rows are numbered from top to bottom and columns are numbered from left to right.
//Assume 0-based indexing.
//Assume each row to be sorted by values.
//Expected time complexity is O(rows + columns).
//
//
//Problem Constraints
//1 <= N <= 1000
//
//0 <= A[i] <= 1
//
//
//
//Input Format
//The only argument given is the integer matrix A.
//
//
//
//Output Format
//Return the row with the maximum number of 1.
//
//
//
//Example Input
//Input 1:
//
// A = [   [0, 1, 1]
//         [0, 0, 1]
//         [0, 1, 1]   ]
//Input 2:
//
// A = [   [0, 0, 0, 0]
//         [0, 0, 0, 1]
//         [0, 0, 1, 1]
//         [0, 1, 1, 1]    ]
//
//
//Example Output
//Output 1:
//
// 0
//Output 2:
//
// 3
//
//
//Example Explanation
//Explanation 1:
//
// Row 0 has maximum number of 1s.
//Explanation 2:
//
// Row 3 has maximum number of 1s.

public class RowWithMaxOnes {
    public int solve(int[][] A) {
        int ans = 0;
        int numberOfOnes = 0;
        int maxOnes = 0;
        int i = 0;
        int j = A[0].length - 1;
        while(i >= 0 && j < A[0].length && j >= 0 && i < A.length){
            if(A[i][j] == 1){
                numberOfOnes++;
                j--;
            }
            else if(A[i][j] == 0){
                if(numberOfOnes > maxOnes){
                    maxOnes = numberOfOnes;
                    ans = i;
                }
                i++;
            }
        }
        if(j < 0 && numberOfOnes == A[0].length){
            return i;
        }
        return ans;
    }
}
