package code.bits;

//Problem Description
//Given two binary strings A and B. Return their sum (also a binary string).
//
//
//Problem Constraints
//1 <= length of A <= 105
//
//1 <= length of B <= 105
//
//A and B are binary strings
//
//
//
//Input Format
//The two argument A and B are binary strings.
//
//
//
//Output Format
//Return a binary string denoting the sum of A and B
//
//
//
//Example Input
//Input 1:
//A = "100"
//B = "11"
//Input 2:
//A = "110"
//B = "10"
//
//
//Example Output
//Output 1:
//"111"
//Output 2:
//"1000"
//
//
//Example Explanation
//For Input 1:
//The sum of 100 and 11 is 111.
//For Input 2:
//
//The sum of 110 and 10 is 1000.
//
//
//
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        int aSize = A.length() - 1;
        int bSize = B.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while(aSize >= 0 || bSize >= 0 || carry > 0){
            char aLast;
            char bLast;
            int a;
            int b;
            int sum = 0;
            if(aSize >= 0){
                aLast = A.charAt(aSize);
                a = Integer.parseInt(String.valueOf(aLast));
                aSize--;
                sum += a;
            }
            if(bSize >= 0){
                bLast = B.charAt(bSize);
                b = Integer.parseInt(String.valueOf(bLast));
                bSize--;
                sum += b ;
            }
            sum += carry;
            ans.append(sum%2);
            carry = sum / 2;
        }
        ans.reverse();
        return String.valueOf(ans);
    }
}
