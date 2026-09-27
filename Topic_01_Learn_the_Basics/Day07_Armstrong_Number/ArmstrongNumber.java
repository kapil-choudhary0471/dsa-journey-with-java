package Topic_01_Learn_the_Basics.Day07_Armstrong_Number;

public class ArmstrongNumber {
    public boolean isArmstrong(int n) {
        if(n==0){
            return false;
        }
        int count=0;
        int temp=n;
        while(n!=0){
            count++;
            n/=10;
        }
        n=temp;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+(int)Math.pow(digit,count);
            n/=10;
        }
        return sum==temp;
    }    
}