package Topic_01_Learn_the_Basics.Day44_Largest_Element;

public class LargestElement {
    public int largestElement(int[] nums) {
        int largest=nums[0];
        for(int i=0;i<nums.length;i++){
            if(largest<=nums[i]){
                largest=nums[i];
            }
        }    
        return largest;
    }
}
