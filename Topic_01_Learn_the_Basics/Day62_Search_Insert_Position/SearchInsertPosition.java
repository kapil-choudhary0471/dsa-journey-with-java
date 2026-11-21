package Topic_01_Learn_the_Basics.Day62_Search_Insert_Position;

public class SearchInsertPosition {
     public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=high/2;
        while(low<=high){
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else {
                low=mid+1;
            }
            mid=low+((high-low)/2);
        }
        return low;
    }
}
