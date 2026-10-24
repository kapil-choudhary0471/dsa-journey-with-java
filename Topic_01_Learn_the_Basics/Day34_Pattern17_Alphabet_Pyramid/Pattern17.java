package Topic_01_Learn_the_Basics.Day34_Pattern17_Alphabet_Pyramid;

public class Pattern17 {
    public void pattern17(int n) {
        char ch='A';
        int spaces=n-1;
        for(char i='A';i<n+'A';i++){
            for(int j=spaces;j>=1;j--){
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            for(char j=ch;j>='A'&&i>'A';j--){
                System.out.print(j);
            }
            if(i=='A'){
                ch='A';
            }else{
                ch++;
            }
            spaces--;
            System.out.println();
        }
    }
}
