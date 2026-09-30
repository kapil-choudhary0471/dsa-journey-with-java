package Topic_01_Learn_the_Basics.Day10_Prime_Up_To_N;

public class PrimeUptoN {
    public int primeUptoN(int n) {
        int countPrime=0;
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                countPrime++;
            }
        }
        return countPrime;
    }
}
