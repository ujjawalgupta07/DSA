//Given an integer A, you need to find the count of it's factors.
//
//Factor of a number is the number which divides it perfectly leaving no remainder.
//
//Example : 1, 2, 3, 6 are factors of 6

//Example Input
//Input 1:
//5
//Input 2:
//10
//
//Example Output
//Output 1:
//2
//Output 2:
//4
public class CountFactors {
    public int solve(int A) {
        int count = 0 ;
        for(int i = 1 ; i * i <= A ; i++){
            if(A % i == 0){
                if(i == A/i){
                    count += 1;
                }
                else{
                    count += 2;
                }
            }
        }
        return count;
    }
}
