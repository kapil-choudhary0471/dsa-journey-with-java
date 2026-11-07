package Topic_01_Learn_the_Basics.Day48_Rotate_Array_By_K;

public class RotateArray {
    public void rotateArray(int[] nums, int k) {
        for(int i=0;i<k;i++){
            int temp=nums[0];
            for(int j=0;j<nums.length-1;j++){
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=temp;
        }
    }
}
