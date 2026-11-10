package Topic_01_Learn_the_Basics.Day51_Missing_Number;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            sum=sum-nums[i];
        }   
        return sum;
    }
}
