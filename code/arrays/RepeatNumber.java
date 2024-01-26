package code.arrays;
//Problem Description
//You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
//If so, return the integer. If not, return -1.
//
//If there are multiple solutions, return any one.
//
//Note: Read-only array means that the input array should not be modified in the process of solving the problem
//
//
//
//Problem Constraints
//1 <= N <= 7*105
//1 <= A[i] <= 109
//
//
//Input Format
//The only argument is an integer array A.
//
//
//Output Format
//Return an integer.
//
//
//Example Input
//Input 1:
//[1 2 3 1 1]
//Input 2:
//[1 2 3]
//
//
//Example Output
//Output 1:
//1
//Output 2:
//-1
//
//
//Example Explanation
//Explanation 1:
//1 occurs 3 times which is more than 5/3 times.
//Explanation 2:
//No element occurs more than 3 / 3 = 1 times in the array.
public class RepeatNumber {
    public int repeatedNumber(int[] A) {
        int n = A.length;

        if(n == 1){
            return A[0];
        }

        int first = A[0];
        int cnt1 = 1;
        int second = A[1];
        int cnt2 = 0;

        for(int i=1; i<n; i++){
            if(A[i] == first){
                cnt1++;
            }
            else if(A[i] == second){
                cnt2++;
            }
            else if(cnt1 == 0){
                first = A[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0){
                second = A[i];
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        int freq1 = 0;
        int freq2 = 0;

        for(int i=0; i<n; i++){
            if(A[i] == first){
                freq1++;
            }
            else if(A[i] == second){
                freq2++;
            }
        }

        if(freq1 > n/3){
            return first;
        }
        else if(freq2 > n/3){
            return second;
        }
        else{
            return -1;
        }
    }
}
