package Topic_01_Learn_the_Basics.Day01_Count_Digits;

public class CountDigits {
    public int countDigit(int n) {
        if(n<0||n>5000){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
}
