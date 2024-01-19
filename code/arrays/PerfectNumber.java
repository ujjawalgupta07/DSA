package code.arrays;//You are given an integer A. You have to tell whether it is a perfect number or not.
//
//Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//
//A proper divisor of a natural number is the divisor that is strictly less than the number.

//Example Input
//Input 1:
//
//A = 4
//Input 2:
//
//A = 6
//
//
//Example Output
//Output 1:
//
//0
//Output 2:
//
//1

public class PerfectNumber {
    public int isPerfectNumber(int A) {
        if(A == 1){
            return 0;
        }
        int ans = 1;
        for(int i = 2 ; i * i <= A; i++){
            if(A % i == 0){
                ans += i;
                if(i != (A/i)){
                    ans = ans + (A/i);
                }
            }
        }
        if(ans == A){
            return 1;
        }
        return 0;
    }
}
