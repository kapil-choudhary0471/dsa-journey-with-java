package Topic_01_Learn_the_Basics.Day56_Set_Matrix_Zeroes;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int row[]=new int[matrix.length];
        int column[]=new int[matrix[0].length];
        
        for(int i=0;i<row.length;i++){
            row[i]=-1;
        }
        for(int i=0;i<column.length;i++){
            column[i]=-1;
        }
        for(int i=0;i<matrix.length;i++){
            boolean isRowNotAdded=true;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(isRowNotAdded){
                        row[i]=i;
                        isRowNotAdded=false;
                    }
                    if(column[j]==j){
                        continue;
                    }
                    column[j]=j;
                
                }
            }
        } 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==i){
                    matrix[i][j]=0;
                }else if(column[j]==j){
                    matrix[i][j]=0;
                }   
            }
        }  
    }
}
