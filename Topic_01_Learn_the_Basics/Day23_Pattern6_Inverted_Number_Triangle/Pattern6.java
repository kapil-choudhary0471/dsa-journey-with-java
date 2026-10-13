package Topic_01_Learn_the_Basics.Day23_Pattern6_Inverted_Number_Triangle;

public class Pattern6 {
    public void pattern6(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}
