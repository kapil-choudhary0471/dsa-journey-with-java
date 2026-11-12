package Topic_01_Learn_the_Basics.Day53_Rearrange_Array_By_Sign;

public class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int negativeIndex[]=new int[nums.length/2];
        int positiveIndex[]=new int[nums.length/2];
        int newNums[]=new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negativeIndex[j++]=i;
            }else{
                positiveIndex[k++]=i;
            }
        }
        j=1;k=1;
        newNums[0]=nums[positiveIndex[0]];
        newNums[1]=nums[negativeIndex[0]];
        for(int i=2;i<nums.length;i++){
            if(i%2==0){
                newNums[i]=nums[positiveIndex[j++]];
            }else{
                newNums[i]=nums[negativeIndex[k++]];
            }
        }
        return newNums;
    }
}
