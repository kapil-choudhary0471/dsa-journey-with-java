package Topic_01_Learn_the_Basics.Day52_Majority_Element;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count[]=new int[nums.length];
        int k=0;
        int majorityElement=0;
        int update=-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=update){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count[k]++;
                }else{
                    update=j;
                    break;
                }
            }
            if(count[k]>=(nums.length/2)){
                majorityElement=i;
                break;
            }
            k++;
        }
        return nums[majorityElement];
    }
}
