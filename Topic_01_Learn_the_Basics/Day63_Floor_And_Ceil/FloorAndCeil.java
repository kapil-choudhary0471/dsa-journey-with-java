package Topic_01_Learn_the_Basics.Day63_Floor_And_Ceil;

public class FloorAndCeil {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int low=0;
        int high=nums.length-1;
        int mid=high/2;

        int floor=-1;
        int ceil=-1;
        
        while(low<=high){
            if(nums[mid]==x){
                floor=nums[mid];
                ceil=nums[mid];
                break;
            }else if(nums[mid]>x){
                high=mid-1;
                ceil=nums[mid];
            }else{
                low=mid+1;
                floor=nums[mid];
            }
            mid=low+(high-low)/2;
        }
        return new int[]{floor,ceil};
    }
}
