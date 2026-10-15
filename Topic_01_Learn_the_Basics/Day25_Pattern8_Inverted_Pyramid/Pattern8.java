package Topic_01_Learn_the_Basics.Day25_Pattern8_Inverted_Pyramid;

public class Pattern8 {
    public void pattern8(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((n-i)*2-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
