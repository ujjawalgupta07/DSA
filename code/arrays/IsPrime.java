package code.arrays;//Given a number A. Return 1 if A is prime and return 0 if not.
//
//Note : The value of A can cross the range of Integer.

//Example Input
//Input 1:
//A = 5
//Input 2:
//
//A = 10
//
//
//Example Output
//Output 1:
//1
//Output 2:
//0
public class IsPrime {
    public int checkIfPrime(int A) {
        for(int i = 2; i * i <= A; i++){
            if(A%i == 0){
                return 0;
            }
        }
        return 1;
    }
}