class Solution {
    public void rotate(int[][] matrix) {
        int row= matrix.length;
        int col = matrix[0].length;
        for (int i=0;i<row;i++){
            int top=0,bottom=col-1;
            while (top<bottom){
                int temp= matrix[top][i];
                matrix[top][i]=matrix[bottom][i];
                matrix[bottom][i]=temp;
                top++;
                bottom--;
            }
        }
        
        for (int i=0; i<row ;i++){
            for (int j=i; j<col ;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        
    }
}