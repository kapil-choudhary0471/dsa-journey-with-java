package Topic_01_Learn_the_Basics.Day46_Maximum_Consecutive_Ones;

public class MaximumConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnes=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
            }else{
                if(temp>consecutiveOnes){
                    consecutiveOnes=temp;
                }
                temp=0;
            }
        }
        if(temp>consecutiveOnes){
            consecutiveOnes=temp;
        }
        return consecutiveOnes;
    }
}
