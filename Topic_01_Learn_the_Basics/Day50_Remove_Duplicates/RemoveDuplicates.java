package Topic_01_Learn_the_Basics.Day50_Remove_Duplicates;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }  
        } 
        return j+1;
    }
}
