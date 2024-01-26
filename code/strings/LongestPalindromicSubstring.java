package code.strings;

//Problem Description
//Given a string A of size N, find and return the longest palindromic substring in A.
//
//Substring of string A is A[i...j] where 0 <= i <= j < len(A)
//
//Palindrome string:
//A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
//
//Incase of conflict, return the substring which occurs first ( with the least starting index).
//
//
//
//Problem Constraints
//1 <= N <= 6000
//
//
//
//Input Format
//First and only argument is a string A.
//
//
//
//Output Format
//Return a string denoting the longest palindromic substring of string A.
//
//
//
//Example Input
//Input 1:
//A = "aaaabaaa"
//Input 2:
//A = "abba
//
//
//Example Output
//Output 1:
//"aaabaaa"
//Output 2:
//"abba"
//
//
//Example Explanation
//Explanation 1:
//We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
//Explanation 2:
//We can see that longest palindromic substring is of length 4 and the string is "abba".
public class LongestPalindromicSubstring {
    public String longestPalindrome(String A) {
        String ans = "";
        int n = A.length();
        for(int i = 0; i < n; i++){
            String s = expand(A, i, i);
            int len = s.length();
            if(len > ans.length()){
                ans = s;
            }
        }
        for(int i = 0; i < n - 1; i++){
            int p2 = i + 1;
            String s = expand(A, i, p2);
            int len = s.length();
            if(len > ans.length()){
                ans = s;
            }
        }
        return ans;
    }

    private String expand(String str, int p1, int p2){
        int n = str.length();
        while(p1 >= 0 && p2 < n && str.charAt(p1) == str.charAt(p2)){
            p1 = p1 -1;
            p2 = p2 + 1;
        }
        return str.substring(p1+1, p2);
    }
}
