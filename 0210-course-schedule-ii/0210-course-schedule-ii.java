class Solution {
    private int[] topo(int n, ArrayList<ArrayList<Integer>> adj){
        int[] indegree = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        int[] ans = new int[n];
        for (int i=0;i<n;i++){
            for (int node: adj.get(i)){
                indegree[node]++;
            }
        }
        for (int i=0;i<n;i++){
            if (indegree[i]==0) queue.add(i);
        }
        int count=0;
        while (!queue.isEmpty()){
            int node=queue.poll();
            ans[count++]=node;
            for (int neigh: adj.get(node)){
                indegree[neigh]--;
                if (indegree[neigh]==0){
                    queue.add(neigh);
                }
            }
        }

        return count==n?ans: new int[0];
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0;i<numCourses;i++){
            adj.add(new ArrayList<Integer>());
        }
        for (var node: prerequisites){
            adj.get(node[1]).add(node[0]);
        }

        int[] ans= topo(numCourses,adj);
        return ans;
    }
}