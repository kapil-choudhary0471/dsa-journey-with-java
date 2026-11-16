package Topic_01_Learn_the_Basics.Day57_Two_Sum;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int indices[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    indices[0]=i;
                    indices[1]=j;
                    return indices;
                }
            }
        }
        return indices;
    }
}
