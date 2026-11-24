package Topic_01_Learn_the_Basics.Day65_Search_In_Rotated_Sorted_Array;

public class SearchRotatedArray {
    public int search(int[] nums, int k) {
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==k){
                return mid;
            }

            if(nums[low]<=nums[mid]){
                if(k>=nums[low]&&k<nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(k>nums[mid]&&k<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
