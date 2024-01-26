package code.strings;
//Problem Description
//You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.
//
//Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
//
//
//Problem Constraints
//1 <= N <= 105
//A and B are lowercase strings
//
//
//Input Format
//Both arguments A and B are a string.
//
//
//Output Format
//Return 1 if they are anagrams and 0 if not
//
//
//Example Input
//Input 1:
//A = "cat"
//B = "bat"
//Input 2:
//A = "secure"
//B = "rescue"
//
//
//Example Output
//Output 1:
//0
//Output 2:
//1
public class CheckAnagrams {
    public int solve(String A, String B) {
        int aSum = 0;
        int bSum = 0;
        for(int i = 0 ; i < A.length(); i++){
            aSum += A.charAt(i);
        }
        for(int i = 0 ; i < B.length(); i++){
            bSum += B.charAt(i);
        }
        if(aSum == bSum){
            return 1;
        }
        return 0;
    }
}
