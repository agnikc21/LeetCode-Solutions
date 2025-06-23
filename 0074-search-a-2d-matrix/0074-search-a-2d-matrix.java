class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target<matrix[0][0]) return false;
        int l=0, r=matrix[0].length-1;
        while (l<matrix.length){
            if (target>matrix[l][r]) l++;
            else{
                return bs(matrix,target,l,r);
            }
        }
        return false;
    }
    public boolean bs(int[][] matrix, int target,int l, int r){
        int left=0;
        while (left<=r){
            int mid=(left+r)/2;
            if (matrix[l][mid]==target) return true;
            else if(matrix[l][mid]<target) left=mid+1;
            else r=mid-1;
        }
        
        return false;
    }
}