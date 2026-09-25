package Topic_01_Learn_the_Basics.Day05_Largest_Digit;

public class LargestDigit {
    public int largestDigit(int n) {
        int largestDigit=0;
        while(n!=0){
            int digit=n%10;
            if(digit>largestDigit){
                largestDigit=digit;
            }
            n/=10;
        }
        return largestDigit;
    }
}
