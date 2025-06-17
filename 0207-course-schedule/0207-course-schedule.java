class Solution {
    private boolean cyclic(int v, ArrayList<ArrayList<Integer>> adj){
        int[] inDegree = new int[v];
        for (int i=0;i<v;i++){
            for (int neighbour: adj.get(i)){
                inDegree[neighbour]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i =0;i<v;i++){
            if (inDegree[i]==0){
                queue.add(i);
            }
        }

        int count=0;
        while (!queue.isEmpty()){
            int node = queue.poll();
            count++;
            for (int neighbour: adj.get(node)){
                inDegree[neighbour]--;
                if (inDegree[neighbour]==0){
                    queue.add(neighbour);
                }
            }
        }

        return count == v;

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0;i<numCourses;i++){
            adj.add(new ArrayList<Integer>());
        }
        for (int[] course: prerequisites){
            adj.get(course[1]).add(course[0]);
        }

        return cyclic(numCourses, adj);
    }
}