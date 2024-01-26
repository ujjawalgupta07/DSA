package code.strings;

//Problem Description
//Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
//
//The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
//
//Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
//
//
//
//Problem Constraints
//0 <= sum of length of all strings <= 1000000
//
//
//
//Input Format
//The only argument given is an array of strings A.
//
//
//
//Output Format
//Return the longest common prefix of all strings in A.
//
//
//
//Example Input
//Input 1:
//
//A = ["abcdefgh", "aefghijk", "abcefgh"]
//Input 2:
//
//A = ["abab", "ab", "abcd"];
//
//
//Example Output
//Output 1:
//
//"a"
//Output 2:
//
//"ab"
//
//
//Example Explanation
//Explanation 1:
//
//Longest common prefix of all the strings is "a".
//Explanation 2:
//
//Longest common prefix of all the strings is "ab".
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] A) {
        StringBuilder commonPrefix = new StringBuilder(A[0]);
        for(int i = 1 ; i < A.length ; i++){
            StringBuilder sb = new StringBuilder();
            StringBuilder temp = new StringBuilder(A[i]);
            int len1 = commonPrefix.length();
            int len2 = temp.length();
            if(len1 <= len2){
                for(int j = 0 ; j < len1; j++){
                    if(commonPrefix.charAt(j) != temp.charAt(j)){
                        if(sb.equals("")){
                            return " ";
                        }
                        break;
                    }
                    else{
                        sb.append(temp.charAt(j));

                    }
                }
                commonPrefix = new StringBuilder(sb);
            }
            if(len1 > len2){
                for(int j = 0 ; j < len2; j++){
                    if(temp.charAt(j) != commonPrefix.charAt(j)){
                        if(sb.equals("")){
                            return " ";
                        }
                        break;
                    }
                    else{
                        sb.append(temp.charAt(j));
                    }
                }
                commonPrefix = new StringBuilder(sb);
            }
        }
        return commonPrefix.toString();
    }
}
