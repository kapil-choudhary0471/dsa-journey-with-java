package Topic_01_Learn_the_Basics.Day33_Pattern16_Repeated_Alphabet_Triangle;

public class Pattern16 {
    public void pattern16(int n) {
        for(char i='A';i<'A'+n;i++){
            for(char j='A';j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
