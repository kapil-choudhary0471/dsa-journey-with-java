package Topic_01_Learn_the_Basics.Day35_Pattern18_Inverted_Alphabet_Triangle;

public class Pattern18 {
    public void pattern18(int n) {
        for(char i=(char)('A'+n-1);i>='A';i--){
            for(char j=i;j<='A'+n-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }  
}
