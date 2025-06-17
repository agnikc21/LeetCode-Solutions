class Solution {
    private boolean valid(int[][] graph, int[] colours, int c, int node ){
        if (colours[node]!=0){
            return colours[node]==c;
        }
        colours[node]=c;
        for (int n:graph[node]){
            if (!valid(graph,colours,-c,n)) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colours = new int[n];
        for (int i=0;i<n;i++){
            if (colours[i]==0 && !valid(graph,colours,1,i)){
                return false;
            }
        }
        return true;
    }
}