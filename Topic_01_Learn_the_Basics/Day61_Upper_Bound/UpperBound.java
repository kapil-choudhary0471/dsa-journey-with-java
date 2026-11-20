package Topic_01_Learn_the_Basics.Day61_Upper_Bound;

public class UpperBound {
    public int upperBound(int[] nums, int x) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>x){
                return i;
            }
        }
        return nums.length;
    }
}
