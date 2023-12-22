//You will be given an integer n.
// You need to return the count of prime numbers less than or equal to n.

//Input Format
//Single input parameter n in function.
//
//
//Output Format
//Return the count of prime numbers less than or equal to n.
//
//
//Example Input
//Input 1:
//19
//Input 2:
//1
//
//
//Example Output
//Output 1:
//8
//Output 2:
//0

public class CountPrimes {
    public int solve(int A) {
        if(A == 1){
            return 0;
        }
        int count = 0;
        for(int i = 2; i <= A; i++){
            int flag = 1;
            for(int j = 2 ; j * j <= i; j++){
                if(i % j == 0){
                    flag = 0;
                }
            }
            if(flag == 1)
                count++;
        }
        return count;
    }
}
