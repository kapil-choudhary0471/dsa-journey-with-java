package Topic_01_Learn_the_Basics.Day03_Reverse_Number;

public class ReverseNumber {
    public int reverseNumber(int n) {
        int revNum=0;
        while(n!=0){
            int digit=n%10;
            revNum=revNum*10+digit;
            n/=10;
        }
        return revNum;
    }    
}