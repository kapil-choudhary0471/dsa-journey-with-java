package Topic_01_Learn_the_Basics.Day15_Count_Odd_Elements;

public class CountOdd {
    public int countOdd(int[] arr, int n) {
        int countOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                countOdd++;
            }
        }
        return countOdd;
    }
}
