package code.bits;

//Problem Description
//Given an array A of length N where all the elements are distinct and are in the range [1, N+2].
//
//Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.
//
//
//
//Problem Constraints
//1 <= N <= 105
//
//1 <= A[i] <= N+2
//
//The elements of array A are distinct
//
//
//
//Input Format
//Only argument A is an array of integers
//
//
//
//Output Format
//Return a sorted array of size 2 denoting the missing elements.
//
//
//
//Example Input
//Input 1:
//A = [3, 2, 4]
//Input 2:
//A = [5, 1, 3, 6]
//
//
//Example Output
//Output 1:
//[1, 5]
//Output 2:
//[2, 4]
//
//
//Example Explanation
//For Input 1:
//The missing numbers are 1 and 5.
//For Input 2:
//The missing numbers are 2 and 4.
//
//
//
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
public class Find2MissingNumber {
    public int[] solve(int[] A) {
        int[] ans = new int[2];
        int xor = 1;
        for(int i = 2; i <= A.length + 2; i++){
            xor = (xor^i);
        }
        for(int i = 0 ; i < A.length; i++){
            xor = (xor^A[i]);
        }
        int ind = -1;
        for(int i = 0; i < 32; i++){
            if((xor&(1<<i)) > 0){
                ind = i;
                break;
            }
        }
        int zero = -1;
        int one = -1;
        for(int i = 0; i < A.length; i++){
            if((A[i]&(1<<ind)) == 0){
                if(zero == -1){
                    zero = A[i];
                }
                else{
                    zero = (zero^A[i]);
                }
            }
            else{
                if(one == -1){
                    one = A[i];
                }
                else{
                    one = (one^A[i]);
                }
            }
        }
        for(int i = 1; i <= A.length+2; i++){
            if((i&(1<<ind)) == 0){
                if(zero == -1){
                    zero = i;
                }
                else{
                    zero = (zero^i);
                }
            }
            else{
                if(one == -1){
                    one = i;
                }
                else{
                    one = (one^i);
                }
            }
        }
        if(zero < one){
            ans[0] = zero;
            ans[1] = one;
        }
        else{
            ans[0] = one;
            ans[1] = zero;
        }


        return ans;
    }
}
