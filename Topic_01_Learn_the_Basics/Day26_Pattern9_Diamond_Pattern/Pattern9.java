package Topic_01_Learn_the_Basics.Day26_Pattern9_Diamond_Pattern;

public class Pattern9 {
    public void pattern9(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
