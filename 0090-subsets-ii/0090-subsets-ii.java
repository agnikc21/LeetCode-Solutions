class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
         for (int num:nums){
            int n = ans.size();
            for (int i=0 ; i<n; i++){
                List<Integer> subset = new ArrayList<>(ans.get(i));
                subset.add(num);
                Collections.sort(subset);
                if (!ans.contains(subset)) ans.add(subset);
            }
         }
         return ans;
    }
}