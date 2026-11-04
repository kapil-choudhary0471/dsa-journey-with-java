package Topic_01_Learn_the_Basics.Day45_Second_Largest_Element;

public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int largest=nums[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                secondLargest=largest;
                largest=nums[i];
            }else if(secondLargest<nums[i]&&largest!=nums[i]){
                secondLargest=nums[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
}
