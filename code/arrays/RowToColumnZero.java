package code.arrays;
//Problem Description
//You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.
//
//
//
//Problem Constraints
//1 <= A.size() <= 103
//
//1 <= A[i].size() <= 103
//
//0 <= A[i][j] <= 103
//
//
//
//Input Format
//First argument is a 2D integer matrix A.
//
//
//
//Output Format
//Return a 2D matrix after doing required operations.
//
//
//
//Example Input
//Input 1:
//
//[1,2,3,4]
//[5,6,7,0]
//[9,2,0,4]
//
//
//Example Output
//Output 1:
//
//[1,2,0,0]
//[0,0,0,0]
//[0,0,0,0]
//
//
//Example Explanation
//Explanation 1:
//
//A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
public class RowToColumnZero {
    public int[][] solve(int[][] A) {
        int[][] ans = new int[A.length][A[0].length];
        int zeroCount = 0;
        for(int i = 0 ; i < A.length; i++){
            for(int j = 0 ; j < A[0].length; j++){
                ans[i][j] = A[i][j];
                if(A[i][j] == 0){
                    zeroCount++;
                }
            }
        }
        if(zeroCount == (A.length * A[0].length)){
            return A;
        }

        for(int i = 0 ; i < A.length; i++){
            for(int j = 0 ; j < A[0].length; j++){
                if(A[i][j] == 0){
                    for(int k = 0 ; k < A.length; k++){
                        ans[i][k] = 0;
                    }
                    for(int k = 0 ; k < A[0].length; k++){
                        ans[k][j] = 0;
                    }
                }
            }
        }
        return ans;

    }
}
