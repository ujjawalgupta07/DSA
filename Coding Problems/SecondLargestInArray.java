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
        int i = 0;
        int j = 1;
        int largest = 0;
        int secondLargest = 0;
        if(A[i] > A[j]){
            largest = A[i];
            secondLargest = A[j];
        }
        else{
            largest = A[j];
            secondLargest = A[i];
        }
        for(int k = 2; k < A.length; k++){
            if(A[k] > largest){
                int temp = largest;
                largest = A[k];
                secondLargest = temp;
            }
            else if(A[k] < largest && A[k] > secondLargest){
                secondLargest = A[k];
            }

        }

        return secondLargest;
    }
}
