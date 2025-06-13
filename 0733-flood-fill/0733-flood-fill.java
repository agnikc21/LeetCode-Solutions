class Solution {
    public void fill(int[][] image, int sr, int sc, int color, int[][] dir, int tar){
        int m= image.length, n=image[0].length;
        if ( sc<0||sr<0||sr>=m || sc>=n || image[sr][sc]== color || image[sr][sc]!=tar ) return;
        image[sr][sc]=color;
        for (var arr:dir){
            int i = arr[0];
            int j=arr[1];
            fill(image,sr+i,sc+j,color,dir,tar);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] dir ={{0,1},{0,-1},{-1,0},{1,0}};
        int tar = image[sr][sc];
        fill(image,sr,sc,color,dir,tar); 
        return image;
    }
}