package Topic_01_Learn_the_Basics.Day43_Linear_Search;

public class LinearSearch {
    public int linearSearch(int nums[], int target) {
		for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
