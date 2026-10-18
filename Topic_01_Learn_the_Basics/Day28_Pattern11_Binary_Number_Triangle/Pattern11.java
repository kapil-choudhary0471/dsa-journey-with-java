package Topic_01_Learn_the_Basics.Day28_Pattern11_Binary_Number_Triangle;

public class Pattern11 {
     public void pattern11(int n) {
        int k;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                k=0;
            }else{
                k=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                if(k==0){
                    k=1;
                }else{
                    k=0;
                }
            }
            System.out.println();
        }
    }
}
