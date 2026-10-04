package Topic_01_Learn_the_Basics.Day14_Sum_of_Array;

public class SumOfArray {
    public  int sum(int arr[], int n) {
      int sum=0;
      for(int i=0;i<n;i++){
        sum=sum+arr[i];
      }
      return sum;
    }
}
