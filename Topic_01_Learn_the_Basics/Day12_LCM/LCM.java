package Topic_01_Learn_the_Basics.Day12_LCM;

public class LCM {
    public int lcm(int n1, int n2) {
        if(n1<1||n2<1){
            return 1;
        }
        int lcm=1;
        int min;
        if(n1>n2){
            min=n2;
        }else{
            min=n1;
        }
        for(int i=min;i<=n1*n2;i++){
            if(i%n1==0&&i%n2==0){
                lcm=i;
                break;
            }
        }
        return lcm;
    }    
}
