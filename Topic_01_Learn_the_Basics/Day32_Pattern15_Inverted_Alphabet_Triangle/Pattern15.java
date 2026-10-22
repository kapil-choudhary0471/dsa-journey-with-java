package Topic_01_Learn_the_Basics.Day32_Pattern15_Inverted_Alphabet_Triangle;

public class Pattern15 {
    public void pattern15(int n) {
        for(int i=n;i>=1;i--){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
