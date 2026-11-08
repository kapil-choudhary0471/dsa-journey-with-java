package Topic_01_Learn_the_Basics.Day49_Move_Zeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                count[j++]=i;
            }
        }
        for(int i=0;i<j;i++){
            nums[i]=nums[count[i]];
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
