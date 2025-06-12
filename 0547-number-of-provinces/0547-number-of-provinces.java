class Solution {
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis){
        vis[node]=1;
        for (int i: adj.get(node)){
            if (vis[i]==0){
                dfs(i,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=isConnected.length;i++){
            adj.add(new ArrayList<>());
        }
        for (int i=0;i<isConnected.length;i++){
            for (int j=0;j<isConnected[i].length;j++){
                if (isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int[] vis = new int[isConnected.length+1];
        for(int i = 0;i<isConnected.length;i++) {
            if(vis[i] == 0) {
               count++;
               dfs(i, adj, vis); 
            }
        }
        return count;
    }
}