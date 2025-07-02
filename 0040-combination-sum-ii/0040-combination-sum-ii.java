class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates,target, new ArrayList<>(), res, 0);
        return res;

    }

    private void backtrack(int[] candidates, int target, List<Integer> current, List<List<Integer>> res, int start){
        if (target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        if (target<0) return;

        for (int i =start; i<candidates.length;i++){
            if (i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            if (candidates[i]>target) break;
            current.add(candidates[i]);
            backtrack(candidates,target-candidates[i],current,res,i+1);
            current.remove(current.size()-1);
        }
    }
}