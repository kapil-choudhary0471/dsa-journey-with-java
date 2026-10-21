package Topic_01_Learn_the_Basics.Day31_Pattern14_Increasing_Alphabet_Triangle;

public class Pattern14 {
    public void pattern14(int n) {
        for(int i=1;i<=n;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
