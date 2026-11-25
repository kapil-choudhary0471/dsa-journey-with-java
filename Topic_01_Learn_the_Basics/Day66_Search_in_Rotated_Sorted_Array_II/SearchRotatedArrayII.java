package Topic_01_Learn_the_Basics.Day66_Search_in_Rotated_Sorted_Array_II;

public class SearchRotatedArrayII {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==k){
                return true;
            }

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }else if(nums[low]<=nums[mid]){
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
        return false;
    }
}
