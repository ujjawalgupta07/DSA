package code.strings;
//Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
//
//
//Input Format
//
//The only argument given is string A.
//Output Format
//
//Return the length of the longest consecutive 1’s that can be achieved.
//Constraints
//
//1 <= length of string <= 1000000
//A contains only characters 0 and 1.
//For Example
//
//Input 1:
//    A = "111000"
//Output 1:
//    3
//
//Input 2:
//    A = "111011101"
//Output 2:
//    7
public class LengthOfConsecutiveOnes {
    public int solve(String A) {
        int numberOfOne = 0;
        for(int i = 0 ; i < A.length(); i++){
            if(A.charAt(i) == '1'){
                numberOfOne++;
            }
        }
        if(numberOfOne == 0){
            return 0;
        }
        if(numberOfOne == A.length()){
            return A.length();
        }
        int ans = 0;
        for(int i = 0 ; i < A.length(); i++){
            if(A.charAt(i) == '0'){
                int l = i-1;
                int left = 0;
                int r = i+1;
                int right = 0;
                while(l >= 0 && A.charAt(l) == '1'){
                    l--;
                    left++;
                }
                while(r < A.length() && A.charAt(r) == '1'){
                    r++;
                    right++;
                }
                if(left + right == numberOfOne){
                    return left + right;
                }
                else{
                    ans = Math.max(ans, left+right+1);
                }
            }
        }
        return ans;
    }
}
