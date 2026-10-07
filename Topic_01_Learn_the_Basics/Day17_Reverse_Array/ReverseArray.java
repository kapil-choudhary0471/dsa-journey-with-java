package Topic_01_Learn_the_Basics.Day17_Reverse_Array;

public class ReverseArray {
    public void reverse(int[] arr, int n) {
        int j=n-1;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
    }
}
