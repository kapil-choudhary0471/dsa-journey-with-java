package Topic_01_Learn_the_Basics.Day06_Factorial;

public class Factorial {
    public int factorial(int n) {
        int factorial=1;
        for(int i=2;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
}
