package Topic_01_Learn_the_Basics.Day19_Pattern2_Right_Angled_Triangle;

public class Pattern2 {
    public void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
