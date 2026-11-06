package Topic_01_Learn_the_Basics.Day47_Rotate_Array_By_One;
public class RotateArrayByOne {
    public void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=temp;
    }
}
