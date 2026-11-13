package Topic_01_Learn_the_Basics.Day54_Rotate_Matrix;

public class RotateMatrix {
    public void rotateMatrix(int[][] matrix) {
        int len=matrix.length;
        int ans[][]=new int[len][len];
        int p=len-1;
        int q=len-1;
        for(int i=0;i<len;i++){
            p=len-1;
            q=i;
            for(int j=0;j<len;j++){
                ans[i][j]=matrix[p][q];
                p--;
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }   
}
