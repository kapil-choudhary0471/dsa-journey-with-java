package Topic_01_Learn_the_Basics.Day24_Pattern7_Pyramid;

public class Pattern7 {
    public void pattern7(int n) {
        for(int i=n;i>=1;i--){
            for(int j=i-1;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
