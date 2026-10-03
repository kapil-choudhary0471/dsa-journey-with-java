package Topic_01_Learn_the_Basics.Day13_Divisors;

public class Divisors {
    public int[] divisors(int n) {
        int arr[]=new int[(n/2)+1];
        int j=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                arr[j]=i;
                j++;
            }
        }
        arr[j]=n;
        int divisors[]=new int[j+1];
        for(int i=0;i<divisors.length;i++){
            divisors[i]=arr[i];
        }
        return divisors;
    }
}
