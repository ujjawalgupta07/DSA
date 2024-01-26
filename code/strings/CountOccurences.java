package code.strings;
//Problem Description
//Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
//
//
//
//Problem Constraints
//1 <= |A| <= 1000
//
//
//Input Format
//The first and only argument contains the string A, consisting of lowercase English alphabets.
//
//
//Output Format
//Return an integer containing the answer.
//
//
//Example Input
//Input 1:
//
//  "abobc"
//Input 2:
//
//  "bobob"
//
//
//Example Output
//Output 1:
//
//  1
//Output 2:
//
//  2
//
//
//Example Explanation
//Explanation 1:
//
//  The only occurrence is at second position.
//Explanation 2:
//
//  Bob occures at first and third position.
public class CountOccurences {
    public int solve(String A) {
        String prefix = "bob";
        String temp = A.substring(0, 3);
        int ans = 0;
        if(temp.equals(prefix)){
            ans++;
        }
        for(int i = 3; i <= A.length()-1; i++){
            char newCh = A.charAt(i);
            StringBuilder temp2 = new StringBuilder(temp.substring(1,3));
            temp2.append(newCh);
            temp = String.valueOf(temp2);
            if(prefix.contentEquals(temp2)){
                ans++;
            }
        }
        return ans;
    }
}
