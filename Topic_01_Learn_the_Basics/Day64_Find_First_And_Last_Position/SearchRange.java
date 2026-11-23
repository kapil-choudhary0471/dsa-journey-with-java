package Topic_01_Learn_the_Basics.Day64_Find_First_And_Last_Position;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;

        int firstOcc=-1;
        int lastOcc=-1;
        
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
               firstOcc=mid;
               high=mid-1; 
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
               lastOcc=mid;
               low=mid+1; 
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        return new int[]{firstOcc,lastOcc};
    }
}
