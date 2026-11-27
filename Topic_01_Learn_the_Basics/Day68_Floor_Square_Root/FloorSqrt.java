package Topic_01_Learn_the_Basics.Day68_Floor_Square_Root;

public class FloorSqrt {
    public int floorSqrt(int n) {
        if(n==0){
            return 0;
        }
        for(int i=1;i<=46340;i++){
            if(i*i==n){
                return i;
            }else if(i*i>n){
                return i-1;
            }else if(i==46340){
                return i;
            }
        } 
        return -1;
    }
}
