package Topic_01_Learn_the_Basics.Day36_Pattern19_Butterfly_Pattern;

public class Pattern19 {
    public void pattern19(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>=1;j--){
                System.out.print("*");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=n-i+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
