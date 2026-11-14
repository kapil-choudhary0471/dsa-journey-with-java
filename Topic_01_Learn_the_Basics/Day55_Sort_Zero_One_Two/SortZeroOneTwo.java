package Topic_01_Learn_the_Basics.Day55_Sort_Zero_One_Two;

public class SortZeroOneTwo {
    public void sortZeroOneTwo(int[] nums) {
        int count[]=new int[3];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count[0]++;
            }
            else if(nums[i]==1){
                count[1]++;
            }
            else{
                count[2]++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<count[0]){
                nums[i]=0;
            }
            else if(i<count[1]+count[0]){
                nums[i]=1;
            }
            else{
                nums[i]=2;
            }
        }
    }
}
