class Solution {

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i =0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]==0) change(matrix,i,j);
            }
        }
        for (int i =0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]==1246525) matrix[i][j]=0;
            }
        }
    }

    public void change(int[][] matrix, int i, int j){
        int row = matrix.length;
        int col = matrix[0].length;
        for (int x=0;x<row;x++){
            if (matrix[x][j]!=0) matrix[x][j]=1246525;
        }
        for (int x=0;x<col;x++){
            if (matrix[i][x]!=0) matrix[i][x]=1246525;
        }
    }
}