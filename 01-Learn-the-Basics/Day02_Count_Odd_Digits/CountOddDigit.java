package Day02_Count_Odd_Digits;

public class CountOddDigit {
    public int countOddDigit(int n) {
        if(n<=0||n>5000){
            return 0;
        }
        int countOddDigit=0;
        while(n!=0){
            int digit=n%10;
            if(digit%2!=0){
                countOddDigit++;
            }
            n/=10;
        }
        return countOddDigit;
    }
}
