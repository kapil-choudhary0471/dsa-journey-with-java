package Topic_01_Learn_the_Basics.Day09_Prime_Number;

public class PrimeNumber {
    public boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
}
