package Topic_01_Learn_the_Basics.Day30_Pattern13_Increasing_Number_Triangle;

public class Pattern13 {
    public void pattern13(int n) {
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
