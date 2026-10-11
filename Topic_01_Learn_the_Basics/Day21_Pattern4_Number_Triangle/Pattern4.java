package Topic_01_Learn_the_Basics.Day21_Pattern4_Number_Triangle;

public class Pattern4 {
    public void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
