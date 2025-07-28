class Solution {
    int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j){
        grid[i][j]='0';
        for (var d:dir){
            int r=d[0];
            int c=d[1];
            if (i+r>=0 && j+c>=0 && i+r<grid.length && j+c<grid[0].length && grid[i+r][j+c]=='1'){
                dfs(grid,i+r,j+c);
            }
        }
    }
}