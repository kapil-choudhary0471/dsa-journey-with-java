package Topic_01_Learn_the_Basics.Day22_Pattern5_Inverted_Star_Triangle;

public class Pattern5 {
    public void pattern5(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
