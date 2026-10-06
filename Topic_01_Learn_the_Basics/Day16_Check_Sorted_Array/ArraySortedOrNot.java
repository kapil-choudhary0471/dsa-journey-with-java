package Topic_01_Learn_the_Basics.Day16_Check_Sorted_Array;

public class ArraySortedOrNot {
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }    
}
