package Topic_01_Learn_the_Basics.Day20_Pattern3_Number_Triangle;

public class Pattern3 {
    public void pattern3(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
