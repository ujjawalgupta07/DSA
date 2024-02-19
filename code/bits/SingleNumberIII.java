package code.bits;

//Problem Description
//Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
//Find the two integers that appear only once.
//
//Note: Return the two numbers in ascending order.
//
//
//Problem Constraints
//2 <= |A| <= 100000
//1 <= A[i] <= 109
//
//
//
//Input Format
//The first argument is an array of integers of size N.
//
//
//
//Output Format
//Return an array of two integers that appear only once.
//
//
//
//Example Input
//Input 1:
//A = [1, 2, 3, 1, 2, 4]
//Input 2:
//
//A = [1, 2]
//
//
//Example Output
//Output 1:
//[3, 4]
//Output 2:
//
//[1, 2]
//
//
//Example Explanation
//Explanation 1:
//3 and 4 appear only once.
//Explanation 2:
//
//1 and 2 appear only once.
//
//
//
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
public class SingleNumberIII {
    public int[] solve(int[] A) {
        int[] ans = new int[2];
        int xor = A[0];
        for(int i = 1 ; i < A.length; i++){
            xor = (xor^A[i]);
        }
        int ind = -1;
        for(int i = 0; i < 32; i++){
            if((xor&(1<<i)) > 0){
                ind = i;
                break;
            }
        }
        int set = -1;
        int unset = -1;
        for(int i  = 0 ; i < A.length; i++){
            if((A[i]&(1<<ind)) > 0){
                if(set == -1){
                    set = A[i];
                }
                else{
                    set = (set^A[i]);
                }
            }
            if((A[i]&(1<<ind)) == 0){
                if(unset == -1){
                    unset = A[i];
                }
                else{
                    unset = (unset^A[i]);
                }
            }
        }
        if(set < unset){
            ans[0] = set;
            ans[1] = unset;
        }
        else{
            ans[0] = unset;
            ans[1] = set;
        }
        return ans;
    }
}
