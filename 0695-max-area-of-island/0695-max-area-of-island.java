class Solution {
    int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0; j<grid[0].length;j++){
                if (grid[i][j]==1) {
                    maxArea=Math.max(maxArea,dfs(grid,i,j));
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid,int i,int j){
        if (i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1 || grid[i][j]==0){
            return 0;
        }
        int area=1;
        grid[i][j]=0;
        for (int[] arr: dir){
            int row= arr[0]+i;
            int col = arr[1]+j;
            area+=dfs(grid,row,col);
            
        }
        return area;
        
    }
}