package Topic_01_Learn_the_Basics.Day58_Most_Frequent_Element;

public class MostFrequentElement {
    public int mostFrequentElement(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int mostFreqEle=nums[0];
        int count;
        int maxCount=1;
        for(int i=0;i<nums.length;i++){
            count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(maxCount<count){
                maxCount=count;
                mostFreqEle=nums[i];
            }
        }
        return mostFreqEle;
    }
}
