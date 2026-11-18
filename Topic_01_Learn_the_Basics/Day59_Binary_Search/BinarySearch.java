package Topic_01_Learn_the_Basics.Day59_Binary_Search;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;            
        while(low<=high){
            int mid=low +((high-low)/2);
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }
        }
        return -1;
    }
}
