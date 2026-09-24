package Topic_01_Learn_the_Basics.Day04_Palindrome_Number;

public class PalindromeNumber {
    public boolean isPalindrome(int n) {
        int revNum=0;
        int temp=n;
        while(n!=0){
            int digit=n%10;
            revNum=revNum*10+digit;
            n/=10;
        }
        return revNum==temp;
    }
}
