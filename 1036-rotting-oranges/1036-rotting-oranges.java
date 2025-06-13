class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid==null || grid.length==0) return -1;
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if (grid[i][j]==2) rot(grid,i,j,2);
            }
        }
        int min=2;
        for (var row:grid){
            for (int i: row){
                if (i==1) return -1;
                min = Math.max(min,i);
            }
        }

        return min-2;
    }

    public void rot(int[][] grid, int i, int j, int min){
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || (grid[i][j]>1 && grid[i][j]<min)) return;
        else{
            grid[i][j]=min;
            rot(grid,i+1,j,min+1);
            rot(grid,i-1,j,min+1);
            rot(grid,i,j+1,min+1);
            rot(grid,i,j-1,min+1);
        }
    }
}