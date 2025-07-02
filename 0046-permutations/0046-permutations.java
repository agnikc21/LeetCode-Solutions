class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], ans);
        return ans;
    }

    private void backtrack(int[] nums, ArrayList<Integer> curr, boolean[] pick, List<List<Integer>> ans){
        if (curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
        }

        for (int i=0;i<nums.length;i++){
            if(pick[i]) continue;
            pick[i]=true;
            curr.add(nums[i]);
            backtrack(nums,curr,pick,ans);
            curr.remove(curr.size()-1);
            pick[i]=false;
        }
    }
}