package Topic_01_Learn_the_Basics.Day69_Nth_Root_of_a_Number;

public class NthRoot {
    public int nthRoot(int N, int M) {
        int low=1;
        int high=M;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            long temp=1;
            for(int j=1;j<=N;j++){
                temp*=mid;
                if(temp>M){
                    break;
                }
            }
            if(temp==M){
                return mid;
            }else if(temp<M){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
