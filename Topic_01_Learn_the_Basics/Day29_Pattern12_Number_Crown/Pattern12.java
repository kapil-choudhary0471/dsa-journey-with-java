package Topic_01_Learn_the_Basics.Day29_Pattern12_Number_Crown;

public class Pattern12 {
    public void pattern12(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=(n-i)*2;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
